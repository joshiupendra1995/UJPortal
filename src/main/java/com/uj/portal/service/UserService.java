package com.uj.portal.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.uj.portal.model.User;
import com.uj.portal.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
