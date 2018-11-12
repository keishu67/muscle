package com.example.demo1.request.third;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thirdpage")
public class ThirdController {
    @GetMapping
    public String index() { return "third/index.html";}
}
