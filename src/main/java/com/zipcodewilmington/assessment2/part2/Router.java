package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class Router {
    //NB Earlier tests messed up because of missing initially <String, String> AFTER map
    public Map<String, String> router = new TreeMap<>();

    public void add(String path, String controller) {
        router.put(path, controller);
    }

    public Integer size() {
        return router.size();
    }

    public String getController(String path) {
        return router.get(path);
    }

    public void update(String path, String studentController) {
     router.put(path, studentController);
    }

    public void remove(String path) {
        router.remove(path);
    }

    @Override
    public String toString() {
        String result= "";
        Set<Map.Entry<String, String>> routerSet = router.entrySet();
        for (Map.Entry<String, String> e : routerSet) {
            result += (e.getKey() + " -> " + e.getValue() + "\n");
        }
        return result;
    }
}
