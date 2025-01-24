package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/session")
public class SessionController {

    @Autowired
    HttpSession session;

    @RequestMapping("")
    public String index(){
        return "session-form";
    }

    @RequestMapping("/input-m-p")
    public String inputMail(String mail,String password){

        if(mail.equals("111") && password.equals("222")){
            session.setAttribute("name",mail);
            session.setAttribute("name2",password);
        return "result-request";
        }else{
            return "session-form";
        }



       

    
    }

    @RequestMapping("/to-mypage")
    public String toMypage(){

        return "result-maypage";
    }

}
