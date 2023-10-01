package com.deliveryfood.ru.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginConroller
{
    @GetMapping("/loginn")
    public String login()
        {
            return "login";
        }
}
