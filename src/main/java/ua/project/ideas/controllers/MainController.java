package ua.project.ideas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {


    @RequestMapping(value = {"/", "/home" , "/index"}, method = RequestMethod.GET)
    public ModelAndView getHomePage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("helloText", "Hello World from controller!");
        modelAndView.setViewName("index");
        return modelAndView;
    }

}
