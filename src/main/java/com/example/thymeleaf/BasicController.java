package com.example.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BasicController {
    @GetMapping("/")
    public String getTest(Model model) {
        Person person = new Person();
        person.setName("Bob");
        Contact contact = new Contact();
        contact.setCell("9499227452");
        contact.setEmail("test@test.com");
        contact.setWebsite("http://www.example.com");
        person.setContact(contact);

        model.addAttribute("person", person.getName());
        model.addAttribute("contactEmail", contact.getEmail());
        model.addAttribute("contactCell", contact.getCell());
        model.addAttribute("contactWebsite", contact.getWebsite());


        return "test";
    }
}
