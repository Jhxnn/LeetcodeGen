package com.LeetcodeGen.repositories;

import com.LeetcodeGen.models.Leetcode;
import com.LeetcodeGen.models.Solve;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SolveRepository extends JpaRepository<Solve, UUID> {
}
