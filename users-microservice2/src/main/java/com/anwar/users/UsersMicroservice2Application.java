package com.anwar.users;



import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.anwar.users.entities.Role;
import com.anwar.users.entities.User;
import com.anwar.users.service.UserService;



@SpringBootApplication
public class UsersMicroservice2Application {
	@Autowired
UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(UsersMicroservice2Application.class, args);
	}
	/*
	@PostConstruct
	void init_users() {
	//ajouter les rôles
	userService.addRole(new Role(null,"ADMIN"));
	userService.addRole(new Role(null,"USER"));
	//ajouter les users
	userService.saveUser(new User(null,"admin","123",true,null));
	userService.saveUser(new User(null,"anwar","123",true,null));
	userService.saveUser(new User(null,"fatma","123",true,null));
	//ajouter les rôles aux users
	userService.addRoleToUser("admin", "ADMIN");
	userService.addRoleToUser("admin", "USER");
	userService.addRoleToUser("anwar", "USER");
	userService.addRoleToUser("fatma", "USER");
	} */
	@Bean
	BCryptPasswordEncoder getBCE() {
	return new BCryptPasswordEncoder();
	}

}

