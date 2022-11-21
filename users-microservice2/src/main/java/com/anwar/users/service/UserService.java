package com.anwar.users.service;

import java.util.List;

import com.anwar.users.entities.Role;
import com.anwar.users.entities.User;

public interface UserService {
User saveUser(User user);
User findUserByUsername (String username);
Role addRole(Role role);
User addRoleToUser(String username, String rolename);
List<User> findAllUsers();
}
