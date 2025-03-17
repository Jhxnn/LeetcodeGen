package com.LeetcodeGen.repositories;

import com.LeetcodeGen.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
