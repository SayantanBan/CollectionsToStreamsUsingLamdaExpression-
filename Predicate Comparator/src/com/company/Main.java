package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Comparator<Person> cmpAge = (p1, p2) -> p2.getAge() - p1.getAge();
        Comparator<Person> cmpFirstName = (p1, p2) -> p2.getFirstName().compareTo(p1.getFirstName());
        Comparator<Person> cmpLastName = (p1, p2) -> p2.getLastName().compareTo(p1.getLastName());

        Function<Person, Integer> f1 =  Person::getAge;
        Function<Person, String> f2 =  Person::getFirstName;
        Function<Person, String> f3 =  Person::getLastName;

        Comparator<Person> cmpPersonAge = Comparator.comparing(Person::getAge);
        Comparator<Person> cmpPersonLastName = Comparator.comparing(Person::getLastName);
        Comparator<Person> cmpPersonFirstName = Comparator.comparing(Person::getFirstName);


//        Comparator<Person> cmp1 = cmpPersonAge
//                                            .thenComparing(cmpPersonLastName)
//                                            .thenComparing(cmpPersonFirstName);

        Comparator<Person> cmp2 = Comparator.comparing(Person::getAge)
                                            .thenComparing(Person::getFirstName)
                                            .thenComparing(Person::getLastName);

        ArrayList al=new ArrayList();
        al.add(new Person("Alex","Bijay",23));
        al.add(new Person("Bruce","Ajay",23));
        al.add(new Person("Raj","Jai",25));

//        Collections.sort(al, new CustomComparator());

        al.sort(new CustomComparator());

        Iterator itr=al.iterator();

        while(itr.hasNext()){
            Person person=(Person) itr.next();
            System.out.println(person.getFirstName()+" "+person.getLastName()+" "+person.getAge());
        }

        Person p1 = new Person();
        p1.setAge(23);
        p1.setFirstName("Alex");
        p1.setLastName("Doe");


        Person p2 = new Person();
        p2.setAge(23);
        p2.setFirstName("Alex");
        p2.setLastName("Doe");

//        System.out.println(cmp2.compare(p2,p1));
        System.out.println(cmpAge.compare(p1,p2));

    }
}
