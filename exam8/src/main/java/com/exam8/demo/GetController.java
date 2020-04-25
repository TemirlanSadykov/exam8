package com.exam8.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GetController {
    @GetMapping("/countries")
    public String country(Model model){
        return "countries";
    }


}
