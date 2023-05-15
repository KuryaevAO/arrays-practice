package com.kuryaevao.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        // добавление элементов
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);

        // проверка наличия ключа
        boolean containsKey = map.containsKey("banana"); // true

        // проверка наличия значения
        boolean containsValue = map.containsValue(4); // false

        // получение значения по ключу
        int val1 = map.get("apple"); // 1
        int val2 = map.get("pear"); // null

        // перебор элементов
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // удаление элементов
        map.remove("banana");
        map.clear();
    }

}
