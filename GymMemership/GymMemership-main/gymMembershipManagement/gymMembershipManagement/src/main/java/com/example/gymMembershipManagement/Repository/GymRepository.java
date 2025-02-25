package com.example.gymMembershipManagement.Repository;

import com.example.gymMembershipManagement.Model.Gym;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GymRepository extends JpaRepository<Gym, Long> {
    List<Gym> findByActiveStatusTrue();
}
