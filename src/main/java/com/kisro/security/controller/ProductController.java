package com.kisro.security.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sys")
public class ProductController {
    @Secured("ROLE_ADMIN")
    @RequestMapping("/toIndex")
    public String toIndex(){
        return "index";
    }
    @RequestMapping("/toFailure")
    public String toFailure(){
        return "failure";
    }

    @RequestMapping("/loginPage")
    public String loginPage(){
        return "login";
    }
}
