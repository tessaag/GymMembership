package com.example.gymMembershipManagement.Controller;

import com.example.gymMembershipManagement.Model.Gym;
import com.example.gymMembershipManagement.Repository.GymRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class GymManagementController {
    @Autowired
    private GymRepository gymRepository;

    @Transactional
    @PostMapping("/registerMember")
    public ResponseEntity<Map<String, String>> registerMember(@RequestBody Gym gym) {
        Gym gymObj = gymRepository.save(gym);

        Map<String, String> response = new HashMap<>();
        response.put("Status", "Member Registered");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/activeMembers")
    public ResponseEntity<List<Gym>> activeMembers() {
        List<Gym> activeMembers = gymRepository.findByActiveStatusTrue();

        return ResponseEntity.ok(activeMembers);
    }
}
