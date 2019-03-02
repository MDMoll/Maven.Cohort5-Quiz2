package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird {
    String color = "red";
    int speed = 10;
    String migrationMonth;

    public RedRobin() {
        super();
    }

    public RedRobin(String color, int speed) {
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

    public String getMigrationMonth(){
        return migrationMonth;
    }

    public void setMigrationMonth(String month){
        migrationMonth = month;
    }
}

//NHU Version
//public class RedRobin extends Bird{
//private String migrationMonth;

//@Override
//public int getSpeed(){
//return 10;}

//@override
//public String color(){
//return "red";}

//@Override
//public String getMigrationMonth(){
//return migrationMonth;}

//@Override
//public void setMigrationMonth(String migrationMonth){
//this.migrationMonth = migrationMonth;}
//}