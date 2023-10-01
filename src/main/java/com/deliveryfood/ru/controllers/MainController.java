package com.deliveryfood.ru.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController
{
    @GetMapping("/says")
    public String say()
        {
            return "say";
        }
}
