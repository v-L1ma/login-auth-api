package com.example.login_auth_api.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.login_auth_api.domain.user.User;

public interface UserRepository extends JpaRepository<User, String> {

}
