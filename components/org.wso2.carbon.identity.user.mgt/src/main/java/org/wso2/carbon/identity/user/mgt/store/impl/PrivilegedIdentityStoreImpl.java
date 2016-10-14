/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.identity.user.mgt.store.impl;

import org.wso2.carbon.identity.user.mgt.model.GroupModel;
import org.wso2.carbon.identity.user.mgt.model.UserModel;
import org.wso2.carbon.identity.user.mgt.store.PrivilegedIdentityStore;
import org.wso2.carbon.security.caas.user.core.bean.Group;
import org.wso2.carbon.security.caas.user.core.bean.User;
import org.wso2.carbon.security.caas.user.core.claim.Claim;
import org.wso2.carbon.security.caas.user.core.claim.MetaClaim;
import org.wso2.carbon.security.caas.user.core.exception.GroupNotFoundException;
import org.wso2.carbon.security.caas.user.core.exception.IdentityStoreException;
import org.wso2.carbon.security.caas.user.core.exception.UserNotFoundException;
import org.wso2.carbon.security.caas.user.core.store.IdentityStoreImpl;

import java.util.List;
import java.util.Map;
import javax.security.auth.callback.Callback;

/**
 * Implementation of the {@link PrivilegedIdentityStore} which provides write capability
 *
 * @since 1.0.0
 */
public class PrivilegedIdentityStoreImpl extends IdentityStoreImpl implements PrivilegedIdentityStore {

    @Override
    public User addUser(UserModel users) throws IdentityStoreException {
        return null;
    }

    @Override
    public User addUser(UserModel users, String domain) throws IdentityStoreException {
        return null;
    }

    @Override
    public List<User> addUsers(List<UserModel> users) throws IdentityStoreException {
        return null;
    }

    @Override
    public List<User> addUsers(List<UserModel> users, String domain) throws IdentityStoreException {
        return null;
    }

    @Override
    public void updateUserClaims(String userId, List<Claim> userClaims) throws IdentityStoreException {

    }

    @Override
    public void updateUserClaims(String userId, List<Claim> userClaims, String domain) throws IdentityStoreException {

    }

    @Override
    public void updateUserClaims(String userId, List<Claim> userClaimsToUpdate, List<Claim> userClaimsToRemove) throws IdentityStoreException {

    }

    @Override
    public void updateUserClaims(String userId, List<Claim> userClaimsToUpdate, List<Claim> userClaimsToRemove, String domain) throws IdentityStoreException {

    }

    @Override
    public void deleteUser(String userId) throws IdentityStoreException {

    }

    @Override
    public void deleteUser(String userId, String domain) throws IdentityStoreException {

    }

    @Override
    public void updateGroupsOfUser(String userId, List<GroupModel> groups) throws IdentityStoreException {

    }

    @Override
    public void updateGroupsOfUser(String userId, List<GroupModel> groups, String domain) throws IdentityStoreException {

    }

    @Override
    public void updateGroupsOfUser(String userId, List<GroupModel> groupsToUpdate, List<GroupModel> groupsToRemove) throws IdentityStoreException {

    }

    @Override
    public void updateGroupsOfUser(String userId, List<GroupModel> groupsToUpdate, List<GroupModel> groupsToRemove, String domain) throws IdentityStoreException {

    }

    @Override
    public Group addGroup(GroupModel groupModel) throws IdentityStoreException {
        return null;
    }

    @Override
    public Group addGroup(GroupModel groupModel, String domain) throws IdentityStoreException {
        return null;
    }

    @Override
    public List<Group> addGroups(List<GroupModel> groups) throws IdentityStoreException {
        return null;
    }

    @Override
    public List<Group> addGroups(List<GroupModel> groups, String domain) throws IdentityStoreException {
        return null;
    }

    @Override
    public Group updateGroupClaims(String groupId, List<Claim> groupClaims) throws IdentityStoreException {
        return null;
    }

    @Override
    public Group updateGroupClaims(String groupId, List<Claim> groupClaims, String domain) throws IdentityStoreException {
        return null;
    }

    @Override
    public Group updateGroupClaims(String groupId, List<Claim> groupClaimsToUpdate, List<Claim> groupClaimsToRemove) throws IdentityStoreException {
        return null;
    }

    @Override
    public Group updateGroupClaims(String groupId, List<Claim> groupClaimsToUpdate, List<Claim> groupClaimsToRemove, String domain) throws IdentityStoreException {
        return null;
    }

    @Override
    public void deleteGroup(String groupId) throws IdentityStoreException {

    }

    @Override
    public void deleteGroup(String groupId, String domain) throws IdentityStoreException {

    }

    @Override
    public void updateUsersOfGroup(String groupId, List<UserModel> users) throws IdentityStoreException {

    }

    @Override
    public void updateUsersOfGroup(String groupId, List<UserModel> users, String domain) throws IdentityStoreException {

    }

    @Override
    public void updateUsersOfGroup(String groupId, List<UserModel> usersToUpdate, List<UserModel> usersToRemove) throws IdentityStoreException {

    }

    @Override
    public void updateUsersOfGroup(String groupId, List<UserModel> usersToUpdate, List<UserModel> usersToRemove, String domain) throws IdentityStoreException {

    }

    @Override
    public User getUser(String userId, String domain) throws IdentityStoreException, UserNotFoundException {
        return null;
    }

    @Override
    public User getUser(Claim claim, String domain) throws IdentityStoreException, UserNotFoundException {
        return null;
    }

    @Override
    public List<User> listUsers(int offset, int length) throws IdentityStoreException {
        return null;
    }

    @Override
    public List<User> listUsers(int offset, int length, String domain) throws IdentityStoreException {
        return null;
    }

    @Override
    public List<User> listUsers(Claim claim, int offset, int length, String domain) throws IdentityStoreException {
        return null;
    }

    @Override
    public List<User> listUsers(MetaClaim metaClaim, String filterPattern, int offset, int length) throws IdentityStoreException {
        return null;
    }

    @Override
    public List<User> listUsers(MetaClaim metaClaim, String filterPattern, int offset, int length, String domain) throws IdentityStoreException {
        return null;
    }

    @Override
    public Group getGroup(String groupId, String domain) throws IdentityStoreException, GroupNotFoundException {
        return null;
    }

    @Override
    public Group getGroup(Claim claim, String domain) throws IdentityStoreException, GroupNotFoundException {
        return null;
    }

    @Override
    public List<Group> listGroups(int offset, int length) throws IdentityStoreException {
        return null;
    }

    @Override
    public List<Group> listGroups(int offset, int length, String domain) throws IdentityStoreException {
        return null;
    }

    @Override
    public List<Group> listGroups(Claim claim, int offset, int length) throws IdentityStoreException {
        return null;
    }

    @Override
    public List<Group> listGroups(Claim claim, int offset, int length, String domain) throws IdentityStoreException {
        return null;
    }

    @Override
    public List<Group> listGroups(MetaClaim metaClaim, String filterPattern, int offset, int length) throws IdentityStoreException {
        return null;
    }

    @Override
    public List<Group> listGroups(MetaClaim metaClaim, String filterPattern, int offset, int length, String domain) throws IdentityStoreException {
        return null;
    }

    @Override
    public List<Group> getGroupsOfUser(String userId, String domain) throws IdentityStoreException {
        return null;
    }

    @Override
    public List<User> getUsersOfGroup(String groupId, String domain) throws IdentityStoreException {
        return null;
    }

    @Override
    public boolean isUserInGroup(String userId, String groupId, String domain) throws IdentityStoreException {
        return false;
    }
}
