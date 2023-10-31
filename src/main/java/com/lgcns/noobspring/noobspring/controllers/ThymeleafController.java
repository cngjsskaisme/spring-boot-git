package com.lgcns.noobspring.noobspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {

  @GetMapping("/template")
  public String home(Model model) {
      model.addAttribute("message", "Welcome to our website!");
      return "home";
  }
}
