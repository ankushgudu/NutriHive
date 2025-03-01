package com.nutrihive.NutriHiveApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nutrihive.NutriHiveApplication.entity.ContactForm;
import com.nutrihive.NutriHiveApplication.repo.ContactFormRepository;


@Controller
public class IndexRenderController {
	
	
	@Autowired
	ContactFormRepository contactFormRepository;

	@GetMapping("/")
	public String home() {
		return "index";
	}
	
    @PostMapping("/submit-form")
    public String submitForm(@ModelAttribute ContactForm contactForm, Model model) {
        // Save to database
    	contactFormRepository.save(contactForm);

        // Confirmation message
        model.addAttribute("successMessage", "Thank you!,  Your message has been received.");

        return "index"; // Return to the same page with success message
    }

}
