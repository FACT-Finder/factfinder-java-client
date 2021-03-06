/*
 * FACT-Finder REST-API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.factfinder.client.api;

import de.factfinder.client.ApiException;
import de.factfinder.client.model.ApiError;
import de.factfinder.client.model.Group;
import de.factfinder.client.model.User;
import de.factfinder.client.model.UserInfo;
import de.factfinder.client.model.UserUpdate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
@Ignore
public class UsersApiTest {

    private final UsersApi api = new UsersApi();

    
    /**
     * Create a new group. Non-admin user are not allowed to create groups containing api roles.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createGroupUsingPOSTTest() throws ApiException {
        Group group = null;
        Group response = api.createGroupUsingPOST(group);

        // TODO: test validations
    }
    
    /**
     * Create a new local user. Non-admin user are not allowed to create user with api roles or admin user. Only channels known by the creating user can be added to the new user.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserUsingPOSTTest() throws ApiException {
        User user = null;
        UserInfo response = api.createUserUsingPOST(user);

        // TODO: test validations
    }
    
    /**
     * Delete the group with the given name.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteGroupUsingDELETETest() throws ApiException {
        String name = null;
        Group response = api.deleteGroupUsingDELETE(name);

        // TODO: test validations
    }
    
    /**
     * Delete multiple groups.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteGroupsUsingDELETETest() throws ApiException {
        List<String> name = null;
        List<Group> response = api.deleteGroupsUsingDELETE(name);

        // TODO: test validations
    }
    
    /**
     * Delete user.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserUsingDELETETest() throws ApiException {
        String userName = null;
        UserInfo response = api.deleteUserUsingDELETE(userName);

        // TODO: test validations
    }
    
    /**
     * Delete multiple users.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUsersUsingDELETETest() throws ApiException {
        List<String> name = null;
        List<UserInfo> response = api.deleteUsersUsingDELETE(name);

        // TODO: test validations
    }
    
    /**
     * Get groups matching the given filters.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGroupsUsingGETTest() throws ApiException {
        String name = null;
        String role = null;
        List<Group> response = api.getGroupsUsingGET(name, role);

        // TODO: test validations
    }
    
    /**
     * Get the users, which fulfil the given filters.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsersUsingGETTest() throws ApiException {
        String name = null;
        String role = null;
        String channel = null;
        String group = null;
        List<UserInfo> response = api.getUsersUsingGET(name, role, channel, group);

        // TODO: test validations
    }
    
    /**
     * Get visible channels
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVisibleChannelsUsingGETTest() throws ApiException {
        List<String> response = api.getVisibleChannelsUsingGET();

        // TODO: test validations
    }
    
    /**
     * Update group. Non-admin user are not allowed to add new api roles to the group.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateGroupUsingPUTTest() throws ApiException {
        Group group = null;
        Group response = api.updateGroupUsingPUT(group);

        // TODO: test validations
    }
    
    /**
     * Update user password. The password is expected to be plain text. Only passwords for local users can be changed.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePasswordUsingPUTTest() throws ApiException {
        String userName = null;
        String password = null;
        UserInfo response = api.updatePasswordUsingPUT(userName, password);

        // TODO: test validations
    }
    
    /**
     * Update user ui settings and permissions. Non-admin user are not allowed to add api roles or channels unknown to the creating user. Use dedicated api, if you want to change the password.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserUsingPUTTest() throws ApiException {
        UserUpdate user = null;
        UserInfo response = api.updateUserUsingPUT(user);

        // TODO: test validations
    }
    
}
