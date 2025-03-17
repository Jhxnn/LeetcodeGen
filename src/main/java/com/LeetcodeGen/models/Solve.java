package com.LeetcodeGen.models;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "solves")
public class Solve {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID solveId;

    @JoinColumn(referencedColumnName = "id", name = "user_id")
    private User solver;

    @JoinColumn(referencedColumnName = "id",name = "leetcode_id")
    private Leetcode leetcode;

    private String solve;

    public UUID getSolveId() {
        return solveId;
    }

    public void setSolveId(UUID solveId) {
        this.solveId = solveId;
    }

    public User getSolver() {
        return solver;
    }

    public void setSolver(User solver) {
        this.solver = solver;
    }

    public Leetcode getLeetcode() {
        return leetcode;
    }

    public void setLeetcode(Leetcode leetcode) {
        this.leetcode = leetcode;
    }

    public String getSolve() {
        return solve;
    }

    public void setSolve(String solve) {
        this.solve = solve;
    }
}
