package com.ryzhkov.sarafan.repo;

import com.ryzhkov.sarafan.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}
