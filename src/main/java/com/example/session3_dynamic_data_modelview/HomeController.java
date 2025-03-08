package com.example.session3_dynamic_data_modelview;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
    
    @RequestMapping("/")
    public String index() {
        return "index";

    }

    //? using parameteres one by one 
    // @RequestMapping("/add")
    // public String add(@RequestParam String nom, 
    //                 @RequestParam String classe,
    //                  @RequestParam int matricule, 
    //                  Model model)  {

    //     model.addAttribute("nom", nom);
    //     model.addAttribute("classe", classe);
    //     model.addAttribute("matricule", matricule);


    //     //? new section : 
    //     Student etudiant = new Student(nom, classe, matricule);

    //     model.addAttribute("etudiant", etudiant);

    //     return "result";

    
    //? using object directly (as a class)
    
    // @RequestMapping("/add")
    // public String add(@ModelAttribute Student etudiant ,Model model)  {

    //     model.addAttribute("etudiant", etudiant);

    //     return "result";
    // }


    @RequestMapping("/add")
    public ModelAndView add(@ModelAttribute Student etudiant ,ModelAndView mv)  {

        mv.addObject("etudiant",etudiant);
        mv.setViewName("result");

        return mv;
    }



}
