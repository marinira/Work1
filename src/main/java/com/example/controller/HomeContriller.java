package com.example.controller;

/**
 * Created by Marin on 16.09.2016.
 */

import com.example.*;
import com.example.impl.Robot;
import com.example.impl.model.ModelT1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HomeContriller
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
        t1000.dance();
    }
}
