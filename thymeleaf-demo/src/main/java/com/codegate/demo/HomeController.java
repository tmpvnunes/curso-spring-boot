package com.codegate.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/blog")
    public String page2(){
        return "blog";
    }

    @RequestMapping("/contact")
    public String page3(){
        return "contact";
    }
}
