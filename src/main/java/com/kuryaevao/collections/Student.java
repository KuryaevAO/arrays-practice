package com.kuryaevao.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student {
    String name;
    String surname;
    List<Integer> grades;

    public Student(String name, String surname, List<Integer> grades) {
        this.name = name;
        this.surname = surname;
        this.grades = grades;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", "Ivanov", Arrays.asList(5, 4, 3)));
        students.add(new Student("Petr", "Petrov", Arrays.asList(3, 4, 5)));
        students.add(new Student("Sergey", "Sidorov", Arrays.asList(4, 5, 4)));

        for (Student student : students) {
            Collections.sort(student.grades);
            System.out.println(student.name + " " + student.surname + " grades: " + student.grades);
        }
    }
}
