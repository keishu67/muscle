package com.example.demo1.request.third;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thirdpage")
public class ThirdController {
    @GetMapping
    public String index(Model model) {
        model.addAttribute( "id",  3);
        return "third/index.html";
    }
}
