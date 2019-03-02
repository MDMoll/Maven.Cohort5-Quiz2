package com.zipcodewilmington.assessment2.part3;

public class BlueJay extends Bird {
    String color = "blue";
    int speed = 13;

    public BlueJay() {
        super();
    }

    public BlueJay(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }
    public String move() {
        return "fly";
    }

    public String color() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

}

//NHU Version
//public class BlueJay extends Bird {
//@Override
//public int getSpeed() {
//return 13;}

//@Override
//public String color(){
//return "blue";
//}
//}
