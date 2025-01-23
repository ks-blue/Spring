package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class receiveController {

    @Controller
    @RequestMapping("/recceive")
    public class ReceiveController {

        @RequestMapping("")
        public String index(){
            return "info-form";
        }
        
        @RequestMapping("/receive-info")
        public String receiveInfo(String name,String age) {
            System.out.println(name);
            System.out.println(age);
            return "finishied";
            
        }
    
        
    }

}
