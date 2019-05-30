package com.sp.kt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class HelloWord {

    @ModelAttribute
    public void first(ModelMap model){
        model.addAttribute("user","jack");
    }

    @GetMapping("hello")
    @ResponseBody
    public Object hello(ModelMap model){
        return new Date();
    }
}
