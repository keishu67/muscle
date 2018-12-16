package com.example.demo1.request.second;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/secondpage")
public class SecondController {
    @GetMapping("{id}")
     public String index(@PathVariable Integer id) {
        System.out.println(id);
        return "muscle-intro/" + id.toString();
//        if (id.equals(2)) {
//            return "second/index.html";
//        } else if (id.equals(3)) {
//            return "third/index.html";
//        }
//        return "top/index.html";
    }
}

