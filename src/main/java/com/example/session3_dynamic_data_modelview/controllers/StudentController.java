package com.example.session3_dynamic_data_modelview.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.session3_dynamic_data_modelview.models.Student;
import com.example.session3_dynamic_data_modelview.services.StudentService;




// @Controller
@RestController
public class StudentController {

    // @Autowired
    // private StudentRepo repo;
    
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


    // @RequestMapping("/add")
    // public ModelAndView add(@ModelAttribute Student etudiant ,ModelAndView mv)  {

    //     mv.addObject("etudiant",etudiant);
    //     mv.setViewName("result");

    //     return mv;
    // }
    
    @Autowired
    private StudentService service;

    @GetMapping("/students")
    @ResponseBody
    public List<Student> getStudents() {
        return service.getStudents();
    }
    


}
