package com.saidworks.thymleaf.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.saidworks.thymleaf.dto.UserRegistrationDto;
import com.saidworks.thymleaf.model.User;

public interface UserService extends UserDetailsService {
	User findByEmail(String email);
	User save(UserRegistrationDto registration);
}
