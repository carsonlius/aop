package com.carsonlius.asp;

import com.carsonlius.services.Teacher;
import com.carsonlius.services.interfaces.TeacherInterface;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherAspTest {
    @Test
    public void test()
    {
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        TeacherInterface teacher= (TeacherInterface) applicationContext.getBean("teacher");
        teacher.teachStudent();
    }

}
