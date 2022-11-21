package com.anwar.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anwar.users.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
User findByUsername(String username);
}

