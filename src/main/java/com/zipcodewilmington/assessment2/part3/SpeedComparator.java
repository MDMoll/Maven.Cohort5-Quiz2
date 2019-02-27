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