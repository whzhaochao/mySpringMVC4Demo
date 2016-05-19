package com.zhaochao.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by Administrator on 2016/5/19.
 */
@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler({RuntimeException.class})
    public String mathEception(Exception ex){

        System.out.println("error----------");
        ex.printStackTrace();

        return  "error";

    }


}
