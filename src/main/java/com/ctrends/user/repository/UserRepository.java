package com.ctrends.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ctrends.model.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
