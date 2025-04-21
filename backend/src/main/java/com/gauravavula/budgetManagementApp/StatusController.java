package com.gauravavula.budgetManagementApp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://138.197.53.171:3000", "http://localhost:3000"})
public class StatusController {

    @GetMapping("/status")
    public ResponseEntity<String> status() {
        return ResponseEntity.ok("Running");
    }
}
