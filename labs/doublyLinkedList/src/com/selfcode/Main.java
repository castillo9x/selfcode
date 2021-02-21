package com.selfcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList<String> names = new DoublyLinkedList<>();
        names.insert("name1");
        names.insert("name2");
        names.insert("name3");
        names.insert("name4");
        names.insert("name5");

        names.traverseForwad();

        names.traverseBackwad();

        List<String> dll = new LinkedList<>();

        dll.add("name1");
        dll.add("name2");
        dll.add("name3");
        dll.add("name4");

        for (String name : dll){
            System.out.println(name);
        }

        dll.remove("name3");
        for (String name : dll){
            System.out.println(name);
        }


        // Perfomance

        ArrayList<Integer> array = new ArrayList<>();
        long now = System.currentTimeMillis();

        for (int i = 0; i < 500000; i++) {
            array.add(0,i);
        }
        System.out.println("Time taken for ArrayList: " + (System.currentTimeMillis()-now));

        LinkedList<Integer> list = new LinkedList<>();

        now = System.currentTimeMillis();

        for (int i = 0; i < 500000; i++) {
            list.add(0,i);
        }

        System.out.println("Time taken for ArrayList: " + (System.currentTimeMillis()-now));

    }
}
