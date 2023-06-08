package dev.bitan.springthymeleafbasics.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class MyController {

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(Model model) {

        model.addAttribute("name", "Bitan Atarthy");
        model.addAttribute("currentDate", new Date().toString());

        System.out.println("Inside about handler.....");
        return "about";
        //about.html
    }


    // handling iteration
    @GetMapping("/example-loop")
    public String iterateHandler(Model m) {


        List<String> names = List.of("Ankit", "Laxmi", "Karan", "John");

        m.addAttribute("names", names);

        return "iterate";
    }

    // handler for conditionals
    @GetMapping("/condition")
    public String conditionHandler(Model m) {

        m.addAttribute("isActive", true);
        m.addAttribute("gender", "F");

        List<Integer> list = List.of(7);

        m.addAttribute("mylist", list);

        System.out.println("conditional handler executed..");
        return "condition";
    }


}
