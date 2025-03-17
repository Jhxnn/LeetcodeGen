package com.LeetcodeGen.repositories;

import com.LeetcodeGen.models.Leetcode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LeetcodeRepository extends JpaRepository<Leetcode, UUID> {
}
