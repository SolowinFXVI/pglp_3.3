package org.uvsq21400579;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test(){
        ArrayList<Robot> Robots = new ArrayList<Robot>();
        Robots.add(new RobotType1(20));
        Robots.add(new RobotType2(20));
        for(int i = 0; i<Robots.size();i++){
            Robots.get(i).avance();
        }
        for(int i=0; i <Robots.size();i++){
            System.out.println("position robot de type" + (i+1)+" : " + Robots.get(i).position);
        }
    }
}
