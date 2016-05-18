package com.zhaochao.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class MainAction {
    public static String SUCCESS = "success";

    @RequestMapping("/hello*")
    public String helllo() {
        System.out.println("hello");
        return SUCCESS;
    }

    @RequestMapping("/a/{id}")
    public String testPathVariable(@PathVariable("id") Integer id) {
        return SUCCESS;
    }


    @RequestMapping(value = "/b", method = RequestMethod.POST)
    public String testPut(@RequestBody String name) {
        System.out.println(name);
        return SUCCESS;
    }
}
