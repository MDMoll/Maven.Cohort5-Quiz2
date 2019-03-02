package com.zipcodewilmington.assessment2.part1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length % 2 == 0;
    }

    public Integer[] range(int start, int stop) {
        List<Integer> result = IntStream.rangeClosed(start, stop)
                .boxed().collect(Collectors.toList());
        return result.toArray(new Integer[0]);
    }

    //NHU version
    //public Integer[] range(int start, int stop){
    //int length = stop - start + 1;

    //Integer[] numbers = new Integer[length];
    //int count = start;

    //for (int i = 0; i < length; i++){
    //mumbers[i] = count;
    //count++;

    //return numbers;}

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[0] * array[1];
    }
}
