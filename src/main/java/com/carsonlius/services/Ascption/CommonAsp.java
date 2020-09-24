package com.carsonlius.services.Ascption;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class CommonAsp {

    @Before(value = "execution(* *(..))")
    public void doLog()
    {
        Date date = new Date();
        System.out.println("日志" + date);
    }
}
