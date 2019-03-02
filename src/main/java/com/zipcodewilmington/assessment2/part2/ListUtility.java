package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListUtility {
    public List<Integer> listUtility = new ArrayList<>();

    public Boolean add(Integer i) {
        return listUtility.add(i);
    }

    public Integer size() {
        return null;
        //D'OH! I had this!
        // NHU Version
        // return listUtility.size();
    }

    public List<Integer> getUnique() {
        return listUtility.stream().distinct().collect(Collectors.toList());
    }

    //NHU Version
    //List<Integer> unique = new ArrayList<>();

    //for (Integer number : list){
    //if (!unique.contains(number)) {
    //unique.add(number);}
    //}
    //return unique;}

    public String join() {
        StringBuilder joinedList = new StringBuilder();
        for (Integer num : listUtility) {
            joinedList.append(num + ", ");
        }
        joinedList.delete(joinedList.length() - 2, joinedList.length() - 1);
        joinedList.deleteCharAt(joinedList.length() - 1);
        return joinedList.toString();
        //return listUtility.stream().collect(Collectors.joining(", "));

        //NHU Version
        //public String join(){
        //String result = "";

        //for (int i = 0; i < list.size(); i++){
        //result += list.get(i);
        // if (i < list.size() - 1) {
        // result += ", ";}
        //}
        //return result;}
    }

    public Integer mostCommon() {
        Map<Integer, Integer> counterMap = new HashMap<Integer, Integer>();
        Integer maxValue = 0;
        Integer mostFrequentValue = null;
        for (Integer valueAsKey : listUtility) {
            Integer counter = counterMap.get(valueAsKey);
            counterMap.put(valueAsKey, counter == null ? 1 : counter + 1);
            counter = counterMap.get(valueAsKey);
            if (counter > maxValue) {
                maxValue = counter;
                mostFrequentValue = valueAsKey;
            }
        }
        return mostFrequentValue;
    }

    //NHU Version
    //public Integer mostCommon() {
    //Integer common = list.get(0);
    //int commonCount = countOccurence(common);

    //for (Integer currentNumber : list) {
    // int currentCount = countOccurence(currentNumber);
    //if (currentCount > commonCount) {
    //common = currentNumber;
    //commonCount = currentCount;

    public Boolean contains(Integer valueToAdd) {
        return listUtility.contains(valueToAdd);
    }
}
