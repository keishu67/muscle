package com.example.demo1.request.top;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;


@Controller
@RequestMapping("/mainpage")
public class TopController {
    @GetMapping
    public String index(Model model) {

        model.addAttribute("id", Arrays.asList(1, 2));

        return "top/index.html";
    }
}
