/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chatvia.chatapp.Controllers;

/**
 *
 * @author LeLan
 */

import com.chatvia.chatapp.Models.Register;
import com.chatvia.chatapp.Models.User;
import com.chatvia.chatapp.Models.ViewedMessage;
import com.chatvia.chatapp.Repo.UserRepository;
import com.chatvia.chatapp.Repo.ViewedMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

//        session.setAttribute("email", user.username);
//        session.setAttribute("fullname", user.fullname);
        if (password.compareTo(repassword) != 0) {
//            session.setAttribute("passwordError", "Mật khẩu không khớp!!!");
            return "redirect:/register";
        } else {
            User user = userRepository.findByEmail(email);

            if (user != null) {
//                session.setAttribute("emailError", "Email đã tồn tại!!!");
                return "redirect:/register";
            } else {
                try {
                    User add = new User();
                    add.setEmail(email);
                    add.setFullname(fullname);
                    add.setPassword(password);
                    userRepository.save(add);
//                    session.setAttribute("msg_reg_sucesss", "Đăng ký tài khoản thành công!!!");
                    return "redirect:/login";
                } catch (Exception ex) {
//                    session.setAttribute("error_reg", "Đăng ký tài khoản không thành công!!!");
                    return "redirect:/register";
                }

            }
        }
    }

    @GetMapping("/login")
    public String loginpage() {
        return "login";
    }

}
