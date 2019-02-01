package com.example.demo1.request.muscle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/muscle-intro")
public class MuscleIntroController {


    @GetMapping("{id}")
    public String index(@PathVariable Integer id, Model model) {
        model.addAttribute("id", id);

        System.out.println(id);
        return "muscle/index.html";

    }
}

