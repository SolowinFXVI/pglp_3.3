package org.uvsq21400579;

public class RobotType1 extends Robot{
    public RobotType1(int position){
        super(position);
    }
    public void avance(){
        super.position+=5;
    }
}
