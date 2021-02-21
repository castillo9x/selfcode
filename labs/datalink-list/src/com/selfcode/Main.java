package com.selfcode;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        LinkedList2<String> names = new LinkedList2<>();
        names.insert("name1");
        names.insert("name2");
        names.insert("name3");
        names.insert("name4");
        names.insert("name5");

        // Recorrer
        names.traverse();

        // Romover uno que existe
        names.remove("name3");
        names.traverse();

        names.remove("blabla");
        names.traverse();

        LinkedList2<Person> people = new LinkedList2<>();

        Person person1 = new Person(1, "name1");
        Person person2 = new Person(2, "name2");
        Person person3 = new Person(3, "name3");
        Person person4 = new Person(4, "name4");
        Person person5 = new Person(5, "name5");

        people.insert(person1);
        people.insert(person2);
        people.insert(person3);
        people.insert(person4);
        people.insert(person5);

        people.traverse();

        people.remove(person3);
        people.traverse();

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);

        Collections.sort(personList);

        for (Person p: personList) {
            System.out.println(p);
        }

        Comparator<Person> comparator = (o1, o2) -> Integer.compare(o1.getAge() * -1, o2.getAge() * -1);

        personList.sort(comparator);

        for (Person p: personList) {
            System.out.println(p);
        }


    }
}
