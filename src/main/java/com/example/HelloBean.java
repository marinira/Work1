package com.example;

import org.springframework.stereotype.Component;

/**
 * Created by Marin on 16.09.2016.
 */
@Component
public class HelloBean
{
    public String sayHello()
    {
        return "Hello Bean!!";
    }
}
