package com.zipcodewilmington.assessment2.part2;

import java.util.*;
import java.util.stream.Stream;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {

        return Stream.concat(Arrays.stream(array1), Arrays.stream(array2))
                .toArray(Integer[]::new);
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        int start = array[0];
        System.arraycopy(array, index, array, 0, array.length - 1);
        array[array.length - 1] = start;
        return array;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
    return getValueCount(array1, valueToEvaluate) + getValueCount(array2, valueToEvaluate);}

    private int getValueCount(Integer[] array, Integer valueToEvaluate){
        int count = 0;
        for (int i : array){
            if(i == valueToEvaluate){
              count++;}}
    return count;}

    public Integer mostCommon(Integer[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : array) {
            Integer count = map.get(i);
            map.put(i, count != null ? count + 1 : 0);
        }
        return Collections.max(map.entrySet(),
                new EntryComparator()).getKey();
    }

    private static class EntryComparator implements Comparator<Map.Entry<Integer, Integer>> {
        @Override
        public int compare(Map.Entry<Integer, Integer> num1, Map.Entry<Integer, Integer> num2) {
            return num1.getValue().compareTo(num2.getValue());
        }
    }
}
