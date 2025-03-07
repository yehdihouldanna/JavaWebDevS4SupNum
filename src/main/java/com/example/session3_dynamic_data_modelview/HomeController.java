package com.example.session3_dynamic_data_modelview;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
    
    @RequestMapping("/")
    public String index() {
        return "index";

    }

    @RequestMapping("/add")
    public String add(@RequestParam String nom, @RequestParam int a, @RequestParam int b, Model model)  {
        int result = a+b;
        System.out.println("Result = "+ result);

        model.addAttribute("result", result);

        model.addAttribute("nom", nom);
        model.addAttribute("result",result);
        return "result";
    }



}
