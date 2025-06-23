
package com.shadsluiter.eventsapp.controllers;

import com.shadsluiter.eventsapp.models.UserModel;
import com.shadsluiter.eventsapp.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserService userService;

    @GetMapping("/registerForm")
    public String registerForm(Model model) {
        model.addAttribute("user", new UserModel());
        return "register.html";
    }

    @PostMapping("/register")
    public String registerUser(@Valid @ModelAttribute("user") UserModel user,
                                BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "register.html";
        }

        userService.save(user);
        return "redirect:/users/loginForm";
    }

    @GetMapping("/loginForm")
    public String loginForm() {
        return "login.html";
    }
}
