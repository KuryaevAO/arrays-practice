package com.kuryaevao.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        // ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("cherry");
        arrayList.add("ananas");

        // LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("dog");
        linkedList.add("cat");
        linkedList.add("fish");

        // доступ к конкретным элементам по индексу
        System.out.println(arrayList.get(1)); // banana

        // перебор элементов
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // сортировка
        Collections.sort(arrayList);

        // удаление элементов
        linkedList.remove(1);
        arrayList.clear();
    }

}
