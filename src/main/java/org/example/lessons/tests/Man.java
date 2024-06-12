package org.example.lessons.tests;

import java.util.*;

public class Man {
    public static void main(String[] args) {
       Map<Integer, String> map = new HashMap<>();
       Map<Integer, String> map1 = new LinkedHashMap<>();
       Map<Integer, String> map2 = new TreeMap<>();

      testMap(map2);



    }


    public static void testMap (Map <Integer, String> map) {
        map.put(12, "Nikol");
        map.put(122, "Dana");
        map.put(0, "Oleg");
        map.put(1555, "Avraam");
        map.put(77, "Yana");

        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }









}
