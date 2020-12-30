package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Copy Right (C), 2020-2020, Entrebean.com
 * Filename: AppMvcController
 * Author: Lin, Song
 * Date: 12/30/2020 8:36 AM
 * Description: MVC Controller
 */
@Controller
public class AppMvcController {
    @RequestMapping("/getAuthor")
    public String getAuthorInfo (Model model) throws Exception{
        model.addAttribute("author", "v0cn140, Spring Boot!");
        return "view/Detail";
    }
}
