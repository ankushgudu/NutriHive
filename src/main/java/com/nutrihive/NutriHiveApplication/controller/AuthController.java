package com.nutrihive.NutriHiveApplication.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private com.nutrihive.NutriHiveApplication.service.EmailService emailService;

    private final Map<String, String> otpStorage = new HashMap<>();

    @PostMapping("/send-otp")
    public Map<String, String> sendOTP(@RequestParam String email) {
        String otp = emailService.generateOTP();
        otpStorage.put(email, otp); // Store OTP temporarily

        emailService.sendOTP(email, otp);

        Map<String, String> response = new HashMap<>();
        response.put("message", "OTP sent successfully to " + email);
        return response;
    }

    @PostMapping("/verify-otp")
    public Map<String, String> verifyOTP(@RequestParam String email, @RequestParam String otp) {
        Map<String, String> response = new HashMap<>();

        if (otpStorage.containsKey(email) && otpStorage.get(email).equals(otp)) {
            response.put("message", "OTP verified successfully!");
            otpStorage.remove(email);
        } else {
            response.put("message", "Invalid OTP. Try again.");
        }

        return response;
    }
}

