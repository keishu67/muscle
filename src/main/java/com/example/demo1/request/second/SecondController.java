package com.example.demo1.request.second;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/secondpage")
public class SecondController {
    @GetMapping
     public String index() { return "second/index.html";}
}

