package com.carsonlius.services;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//@Aspect
public class Asp01 {
//    @Before(value = "execution(* *(..))")
    public void log(){
        System.out.println("日志 ==== 》");
    }
}
