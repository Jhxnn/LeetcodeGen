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

    private String tittle;

    private String challege;

    @JoinColumn(referencedColumnName = "id", name = "solve_id")
    private Solve solves;

    public UUID getLeetcodeId() {
        return leetcodeId;
    }

    public void setLeetcodeId(UUID leetcodeId) {
        this.leetcodeId = leetcodeId;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getChallege() {
        return challege;
    }

    public void setChallege(String challege) {
        this.challege = challege;
    }

    public Solve getSolves() {
        return solves;
    }

    public void setSolves(Solve solves) {
        this.solves = solves;
    }
}
