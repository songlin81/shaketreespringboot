package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Copy Right (C), 2020-2020, Entrebean.com
 * Filename: HelloMvcController
 * Author: Lin, Song
 * Date: 12/30/2020 8:36 AM
 * Description: MVC Controller
 */
@Controller
public class HelloMvcController {
    @RequestMapping("/helloworld")
    public String helloWorld (Model model) throws Exception{
        model.addAttribute("mav", "HelloWorldController, Spring Boot!");
        return "view/hello";
    }
}
