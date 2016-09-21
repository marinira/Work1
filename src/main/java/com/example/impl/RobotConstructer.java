package com.example.impl;

import com.example.impl.sony.SonyHand;
import com.example.impl.sony.SonyHead;
import com.example.impl.sony.SonyLeg;
import com.example.impl.toshiba.ToshibaLeg;
import com.example.interfaces.*;

/**
 * Created by Marin on 16.09.2016.
 */
public class RobotConstructer
{
    public static void main(String[] args)
    {
        Hand  hand = new SonyHand();
        Leg leg = new ToshibaLeg();
        Head head = new SonyHead();
        Robot robot = new Robot( hand,leg,head);
        robot.action();
    }
}
