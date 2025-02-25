package com.example.gymMembershipManagement.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "gym_members")
public class Gym {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("memberId")
    @Column(unique = true, nullable = false) // Ensure unique memberId
    private String memberId;

    @JsonProperty("name")
    @Column(nullable = false) // Name should not be null
    private String name;

    @JsonProperty("membershipType")
    @Column(nullable = false) // Membership type is required
    private String membershipType;

    @JsonProperty("activeStatus")
    @Column(nullable = false) // Active status should always have a value
    private Boolean activeStatus;

    @JsonProperty("workoutPlan")
    private String workoutPlan;

    public Gym() {
    }

    public Gym(Long id, String memberId, String name, String membershipType, Boolean activeStatus, String workoutPlan) {
        this.id = id;
        this.memberId = memberId;
        this.name = name;
        this.membershipType = membershipType;
        this.activeStatus = activeStatus;
        this.workoutPlan = workoutPlan;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public Boolean getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getWorkoutPlan() {
        return workoutPlan;
    }

    public void setWorkoutPlan(String workoutPlan) {
        this.workoutPlan = workoutPlan;
    }
}
