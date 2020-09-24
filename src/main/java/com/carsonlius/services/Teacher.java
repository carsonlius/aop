package com.carsonlius.services;


import com.carsonlius.services.interfaces.TeacherInterface;
import org.springframework.stereotype.Component;

@Component
public class Teacher implements TeacherInterface {
    @Override
    public void teachStudent() {
        System.out.println("老师教学生");
    }
}
