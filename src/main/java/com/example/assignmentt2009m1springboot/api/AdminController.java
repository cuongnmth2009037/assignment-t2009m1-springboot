package com.example.assignmentt2009m1springboot.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {
    @RequestMapping(method = RequestMethod.GET)
    public String say(){
        return "Hello Admin";
    }
}
