package com.zipcodewilmington.assessment2.part3;

public class Horse implements Animal {
    String color;
    int speed;

    public Horse() {
        super();
    }

    public Horse(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public String move() {
        return "gallop";
    }

    public String color() {
        return "brown";
    }

    public int getSpeed() {
        return 40;
    }
}

//NHU Version
//public class Horse implements Animal {
//@Override
//public String move(){
//return "gallop";}

//@Override
//public int getSpeed(){
//return 40;}

//@Override
//public String color(){
//return "brown";}
//}