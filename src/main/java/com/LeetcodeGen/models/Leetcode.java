package com.LeetcodeGen.models;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "leetcodes")
public class Leetcode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID leetcodeId;

    private String title;

    private String challenge;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "solve_id")
    private Solve solves;

    public UUID getLeetcodeId() {
        return leetcodeId;
    }

    public void setLeetcodeId(UUID leetcodeId) {
        this.leetcodeId = leetcodeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getChallenge() {
        return challenge;
    }

    public void setChallenge(String challenge) {
        this.challenge = challenge;
    }

    public Solve getSolves() {
        return solves;
    }

    public void setSolves(Solve solves) {
        this.solves = solves;
    }
}
