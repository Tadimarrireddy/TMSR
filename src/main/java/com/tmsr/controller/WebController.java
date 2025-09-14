package com.tmsr.controller;

import com.tmsr.model.Contact;
import com.tmsr.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {

    @Autowired
    private ContactService contactService;

    // --- Home ---
    @GetMapping({"/", "/home", "/home**"})
    public String home(Model model) {
        model.addAttribute("companyName", "TMSR TECHNOLOGIES PRIVATE LIMITED");
        model.addAttribute("hotline", "+(91) 8019286192");
        return "/home";
    }

    // --- About ---
    @GetMapping({"/about", "/about**"})
    public String about(Model model) {
        model.addAttribute("companyName", "TMSR TECHNOLOGIES PRIVATE LIMITED");
        return "about";
    }

    // --- Services ---
    @GetMapping({"/services", "/services**"})
    public String services(Model model) {
        return "services";
    }

    // --- Technologies ---
    @GetMapping({"/technologies", "/technologies**"})
    public String technologies(Model model) {
        return "technologies";
    }

    // --- Real Estate ---
    @GetMapping({"/realestate", "/realestate**"})
    public String realestate(Model model) {
        return "realestate";
    }

    // --- FAQ ---
    @GetMapping({"/faq", "/faq**"})
    public String faq(Model model) {
        return "faq";
    }

    // --- Careers ---
    @GetMapping({"/careers", "/careers**"})
    public String careers(Model model) {
        return "careers";
    }

    // --- Contact Form ---
    @GetMapping({"/contact", "/contact**"})
    public String contactForm(Model model) {
        model.addAttribute("contact", new Contact());
        model.addAttribute("hotline", "+(91) 8019286192");
        return "contact";
    }

    @PostMapping("/contact")
    public String submitContact(@ModelAttribute Contact contact, Model model) {
        contactService.save(contact);
        model.addAttribute("name", contact.getName());
        model.addAttribute("hotline", "+(91) 8019286192");
        return "contact-success";
    }

    // --- API Info ---
    @GetMapping({"/api/info", "/api/info**"})
    @ResponseBody
    public java.util.Map<String, String> apiInfo() {
        return java.util.Map.of(
                "companyName", "TMSR TECHNOLOGIES PRIVATE LIMITED",
                "address", "Anantapur, Andhra Pradesh, India",
                "email", "tmrcec1@gmail.com",
                "phone", "+(91) 8019286192",
                "services", "PickMyFruit, TMSR Travels, App Development, Real Estate platforms"
        );
    }

    // --- Catch-all unknown URLs ---
    @GetMapping("/**")
    public String redirectHome() {
        return "redirect:/home";
    }
}
