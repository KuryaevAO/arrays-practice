package com.kuryaevao.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

    public static void main(String[] args) {

        // HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 1);
        hashMap.put("banana", 2);
        hashMap.put("cherry", 3);

        // TreeMap
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "ten");
        treeMap.put(20, "twenty");
        treeMap.put(30, "thirty");

        // доступ к конкретному элементу по индексу
        System.out.println(hashMap.get("banana")); // 2

        // перебор элементов
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        // удаление элементов
        treeMap.remove(20);
        hashMap.clear();
    }
}
