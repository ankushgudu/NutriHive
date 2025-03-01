package com.nutrihive.NutriHiveApplication.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nutrihive.NutriHiveApplication.entity.HealthRecord;
import com.nutrihive.NutriHiveApplication.repo.HealthRecordRepository;

@Service
public class HealthRecordService {

    @Autowired
    private HealthRecordRepository healthRecordRepository;

    public HealthRecord saveHealthRecord(HealthRecord healthRecord) {
        return healthRecordRepository.save(healthRecord);
    }
}

