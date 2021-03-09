package com.ryzhkov.sarafan.repo;

import com.ryzhkov.sarafan.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
