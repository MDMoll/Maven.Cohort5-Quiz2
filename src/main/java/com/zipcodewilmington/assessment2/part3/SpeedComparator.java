package com.zipcodewilmington.assessment2.part3;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {
    public int compare(Animal animal1, Animal animal2) {
        int result = 4;
        if (animal1.getSpeed() == animal2.getSpeed()) {
            result = 0;
        } else if (animal1.getSpeed() > animal2.getSpeed()) {
            result = -1;
        } else if (animal1.getSpeed() < animal2.getSpeed()) {
            result = 1;
        }
        return result;
    }
}

//NHU Version
//public class SpeedComparator implements Comparator<Animal> {
//
//@Override
//public int compare(Animal animal1, Animal animal2){
//Integer animal1Speed = animal1.getSpeed();
//Integer animal2Speed = animal2.getSpeed();

//if (animal1Speed == animal2Speed){
//return 0;
// else if (animal1Speed > animal2Speed){
//return -1;
//} else{
//return 1;
//}
//}
//}

//SHORTER WAY:
//return o2Speed.compareTo(o1Speed);