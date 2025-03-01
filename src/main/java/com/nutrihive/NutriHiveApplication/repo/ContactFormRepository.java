package com.nutrihive.NutriHiveApplication.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nutrihive.NutriHiveApplication.entity.ContactForm;

@Repository
public interface ContactFormRepository extends JpaRepository<ContactForm, Long> {
}

