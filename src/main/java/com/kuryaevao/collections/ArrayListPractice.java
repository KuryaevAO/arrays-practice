package com.kuryaevao.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        // добавление элементов
        list.add(10); // [10]
        list.add(20); // [10, 20]
        list.add(30); // [10, 20, 30]
        list.add(1, 15); // [10, 15, 20, 30]

        // удаление элементов
        list.remove(2); // [10, 15, 30]

        // установка конкретного элемента
        list.set(1, 25); // [10, 25, 30]

        // получение элемента
        int val1 = list.get(0); // 10
        int val2 = list.get(2); // 30

        // перебор элементов
        for (int num : list) {
            System.out.print(num + " ");
        }
        // вывод: 10 25 30

        // размер ArrayList
        int size = list.size(); // 3

        // конвертация ArrayList в массив
        Integer[] array = list.toArray(new Integer[list.size()]);
    }

}
