/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import com.datadog.api.TestUtils;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.AccessRole;
import com.datadog.api.v1.client.model.User;
import com.datadog.api.v1.client.model.UserListResponse;
import com.datadog.api.v1.client.model.UserResponse;
import org.junit.*;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * API tests for UsersApi
 */
public class UsersApiTest extends V1ApiTest {

    private static UsersApi api;
    private final String testingUserHandle = "testinguser@datadoghq.com";
    private final String testingUserName = "Testing User";
    private final AccessRole testingUserAR = AccessRole.STANDARD;
    private ArrayList<String> disableUsers = null;

    @Before
    public void resetDisableUsers() {
        disableUsers = new ArrayList<String>();
    }

    @BeforeClass
    public static void initApi() {
        api = new UsersApi(generalApiClient);
    }

    @After
    public void disableUsers() throws ApiException {
        if (disableUsers != null) {
            for (String handle: disableUsers) {
                UserResponse ugr = api.getUser(handle).execute();
                if (!ugr.getUser().getDisabled()) {
                    api.disableUser(handle).execute();
                }
            }
        }
    }

    /**
     * Create, modify and disable user object, also test getting it
     */
    @Test
    public void userCreateModifyDisableTest() throws ApiException {
        // Test creating user
        User user = new User();
        user.setAccessRole(testingUserAR);
        user.setHandle(testingUserHandle);
        user.setName(testingUserName);
        UserResponse response = api.createUser().body(user).execute();
        // If something fails, make sure we disable the user
        disableUsers.add(testingUserHandle);

        user = response.getUser();
        assertEquals(testingUserHandle, user.getHandle());
        assertEquals(testingUserName, user.getName());
        assertEquals(testingUserAR.toString(), user.getAccessRole().toString());

        // Now test updating user
        user.setName("Updated Name");
        user.setDisabled(false);
        response = api.updateUser(user.getHandle()).body(user).execute();

        assertEquals("Updated Name", response.getUser().getName());

        // Now test getting user
        response = api.getUser(user.getHandle()).execute();
        assertEquals(testingUserHandle, response.getUser().getHandle());
        assertEquals("Updated Name", response.getUser().getName());
        assertEquals(testingUserAR.toString(), response.getUser().getAccessRole().toString());
        assertEquals(false, response.getUser().getDisabled());

        // Now test disabling user
        api.disableUser(user.getHandle()).execute();
        response = api.getUser(user.getHandle()).execute();
        assertEquals(true, response.getUser().getDisabled());
    }

    /**
     * Get all users
     */
    @Test
    public void getAllUsersTest() throws ApiException {
        Assume.assumeTrue("This test does not support replay from recording", TestUtils.isRecording());
        ArrayList<String> prefixes = new ArrayList<>(Arrays.asList("1", "2", "3"));
        for (String prefix: prefixes) {
            User user = new User();
            user.setAccessRole(testingUserAR);
            user.setHandle(prefix + testingUserHandle);
            user.setName(prefix + testingUserName);
            UserResponse response = api.createUser().body(user).execute();
            disableUsers.add(response.getUser().getHandle());
        }
        UserListResponse response = api.getAllUsers().execute();
        List<User> users = response.getUsers();
        for (String prefix: prefixes) {
            boolean found = false;
            for (User user: users) {
                if (user.getHandle().equals(prefix + testingUserHandle)) {
                    found = true;
                }
            }
            assertTrue(String.format("User %s%s not found", prefix, testingUserHandle), found);
        }
    }
}
