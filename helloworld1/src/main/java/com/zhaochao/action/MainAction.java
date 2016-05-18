package com.zhaochao.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;





@Controller
public class MainAction {

    @RequestMapping("/hello")
    public String helllo(){
        System.out.println("hello");
        return  "/success";
    }
}
