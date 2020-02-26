package org.uvsq21400579;

public class Robot {
    public int position;
    public Robot(int pos){
        this.position = pos;
    }
    public void avance(){
        this.position += 10;
    }
}
