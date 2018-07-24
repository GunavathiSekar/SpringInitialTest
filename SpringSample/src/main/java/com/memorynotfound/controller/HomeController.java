package com.memorynotfound.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap model){
        List<Student> listk =new ArrayList<Student>();
        Student stud = new Student(1,"Gunavathi");
        listk.add(stud);
        Student stud1 = new Student(2,"Sathish");
        listk.add(stud1);
        Student stud2 = new Student(3,"DhineshRaja");
        listk.add(stud2);
        model.addAttribute("message",listk);
        System.out.print("LIST"+listk);
        return "index";
    }

}