package com.example.impl.model;

import com.example.interfaces.Hand;
import com.example.interfaces.Head;
import com.example.interfaces.Leg;
import com.example.interfaces.Robot;

/**
 * Created by Marin on 16.09.2016.
 */
public class ModelT1000 implements Robot
{
    private Hand hand;
    private Leg leg;
    private Head head;

    public ModelT1000(Hand hand,Leg leg,Head head)
    {
        super();
        this.hand =hand;
        this.head = head;
        this.leg = leg;
    }

    public ModelT1000()
    {
    }

    @Override
    public void action()
    {
        head.calc();
        hand.catchSomething();
        leg.go();

    }

    @Override
    public void dance()
    {
        System.out.println("ModelT100o Dansed");

    }
}
