/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chatvia.chatapp.Controllers;

/**
 *
 * @author LeLan
 */

import com.chatvia.chatapp.Models.User;
import com.chatvia.chatapp.Repo.UserRepository;
import com.chatvia.chatapp.Repo.ViewedMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;




@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ViewedMessageRepository tesst;

    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    @PostMapping("/register")
    public String registerHandle(@RequestParam String email, @RequestParam String fullname, @RequestParam String password, @RequestParam String repassword ) {

        if (password.length() < 6) {
            return "redirect:/register?error=Password must be at least 6 characters long";
        }

        if (!email.matches("^\\S+@\\S+\\.\\S+$")) {
            return "redirect:/register?error=Invalid email address";
        }

        if (!password.equals(repassword)) {
            return "redirect:/register?error=Passwords do not match";
        }

        User user = userRepository.findByEmail(email);

        if (user != null) {
            return "redirect:/register?error=Email address already registered";
        }

        try {
            User add = new User();
            add.setEmail(email);
            add.setFullname(fullname);
            add.setPassword(password);
            userRepository.save(add);
            return "redirect:/login";
        } catch (Exception ex) {
            return "redirect:/register?error=Failed to register";
        }
    }

    @GetMapping("/fail")
    public String loginPageF(@RequestParam(required = false) String error) {
        if (error != null) {
            return "fail?error=" + error;
        }
        return "fail";
    }

    @PostMapping("/fail")
    public String loginHandleF(@RequestParam String email, @RequestParam String password, RedirectAttributes redirectAttributes) {
        User user = userRepository.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return "redirect:/"; // redirect to home page or any other page you want
        } else {
            // Authentication failed, show error message
            redirectAttributes.addFlashAttribute("error", "Invalid email or password");
            return "redirect:/fail"; // redirect back to login page
        }
    }
    @GetMapping("/login")
    public String loginPage(@RequestParam(required = false) String error) {
        if (error != null) {
            return "login?error=" + error;
        }
        return "login";
    }

    @PostMapping("/login")
    public String loginHandle(@RequestParam String email, @RequestParam String password, RedirectAttributes redirectAttributes) {
        User user = userRepository.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return "redirect:/"; // redirect to home page or any other page you want
        } else {
            // Authentication failed, show error message
            redirectAttributes.addFlashAttribute("error", "Invalid email or password");
            return "redirect:/fail"; // redirect back to login page
        }
    }



}
