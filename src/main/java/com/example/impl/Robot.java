package com.example.impl;

import com.example.interfaces.*;

/**
 * Created by Marin on 16.09.2016.
 */
public class Robot
{
    private Hand hand;
    private Leg leg;
    private Head head;

    public Robot(Hand hand,Leg leg,Head head)
    {
        super();
        this.hand =hand;
        this.head = head;
        this.leg = leg;
    }




    public void action()
    {
        head.calc();
        hand.catchSomething();
        leg.go();
    }



}
