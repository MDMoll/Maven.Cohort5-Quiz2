package com.zipcodewilmington.assessment2.part2;

import java.util.*;
import java.util.stream.Stream;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {

        return Stream.concat(Arrays.stream(array1), Arrays.stream(array2))
                .toArray(Integer[]::new);
    }

    //NHU version
    //public Integer[] merge(Integer[] array1, Integer[] array2) {
    //int newLength = array1.length + array2.length;

    //Integer[] numbers = Arrays.copyOf(array1, newLength);

    //int n = array1.length;

    //for (int i = 0; i < array2.length; i++){
    //numbers[n] = array2[i];
    //n++;}

    //Shorter way to Copy Array
    //System.arraycopy(array2, 0, numbers, array1.length, array2.length)

    //return numbers;

    //My (semi-working) version
    /*public Integer[] rotate(Integer[] array, Integer index) {
        int start = array[0];
        System.arraycopy(array, index, array, 0, array.length - 1);
        array[array.length - 1] = start;
        return array;
    }*/

    //NHU Version
    public Integer[] rotate(Integer[] array, Integer index){
    Integer[] rotated = new Integer[array.length];
    int rotatedIndex = 0;

    //THIS COPIES THE INDEX TO THE END OF THE ARRAY
    for(int i = index; i < array.length; i++){
    rotated[rotatedIndex] = array[i];
    rotatedIndex++;}

    //COPIES THE BEGINNING UP TO THE INDEX
    for(int i = 0; i < index; i++){
    rotated[rotatedIndex] = array[i];
    rotatedIndex++;}

    return rotated;}

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        return getValueCount(array1, valueToEvaluate) + getValueCount(array2, valueToEvaluate);
    }

    private int getValueCount(Integer[] array, Integer valueToEvaluate) {
        int count = 0;
        for (int i : array) {
            if (i == valueToEvaluate) {
                count++;
            }
        }
        return count;
    }

    //NHU Version of Helper Method for what I did with getValueCount
    //public int count(Integer[] array, Integer valueToCount){
    //int count = 0;
    //for (int i = 0; i < array.length; i++){
    //if (valueToCount.equals(array[i])){
    //count++;}
    //}
    //return count;}

    public Integer mostCommon(Integer[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : array) {
            Integer count = map.get(i);
            map.put(i, count != null ? count + 1 : 0);
        }
        return Collections.max(map.entrySet(),
                new EntryComparator()).getKey();
    }

    //NHU Version
    //public Integer mostCommon(Integer[] array){
    //Integer common = array[0];
    //int commonCount = count(array, common);
    //for (int i = 0; i < array.length; i++){
    //Integer currentNumber = array[i];
    //int currentCount = count(array, currentNumber);
    //if (currentCount > commonCount){
    //common = currentNumber;
    //commonCount = currentCount;
    //}
    //}
    //return common;}

    private static class EntryComparator implements Comparator<Map.Entry<Integer, Integer>> {
        @Override
        public int compare(Map.Entry<Integer, Integer> num1, Map.Entry<Integer, Integer> num2) {
            return num1.getValue().compareTo(num2.getValue());
        }
    }
}
