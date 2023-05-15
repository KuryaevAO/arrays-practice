package com.kuryaevao.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

        // HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("red");
        hashSet.add("green");
        hashSet.add("blue");

        // TreeSet
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);

        // проверка наличия элемента
        System.out.println(hashSet.contains("green")); // true

        // перебор элементов
        for (int num : treeSet) {
            System.out.println(num);
        }

        // удаление элементов
        hashSet.remove("red");
        treeSet.clear();
    }

}