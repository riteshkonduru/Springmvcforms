package com.example.springmvcforms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {
//Hello
    @RequestMapping("/")
    String showHome() {
        return "redirect:/personlist";
    }
}
