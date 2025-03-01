package com.nutrihive.NutriHiveApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nutrihive.NutriHiveApplication.entity.HealthRecord;
import com.nutrihive.NutriHiveApplication.service.HealthRecordService;

@RestController
@RequestMapping("/api/health")
public class HealthRecordController {

    @Autowired
    private HealthRecordService healthRecordService;

    @PostMapping("/save")
    public HealthRecord saveHealthRecord(@RequestBody HealthRecord healthRecord) {
        return healthRecordService.saveHealthRecord(healthRecord);
        
    }
}
