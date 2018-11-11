package com.example.demo1.request.top;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mainpage")
public class TopController {
    @GetMapping
    public String index() {
        return "top/index.html";
    }
}
