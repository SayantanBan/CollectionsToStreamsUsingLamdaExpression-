package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Person p1 = new Person("Alice", 23);
        Person p2 = new Person("Brian", 56);
        Person p3 = new Person("Chelsea", 46);
        Person p4 = new Person("David", 28);
        Person p5 = new Person("Francisco", 18);

        List<Person> people = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5));

        City newYork = new City("New York");
        City shanghai = new City("Sanghai");
        City paris = new City("Paris");

        Map<City, List<Person>> map = new HashMap<>();
        Map<City, List<Person>> map1 = new HashMap<>();


//        map.putIfAbsent(paris, new ArrayList<>());
//        map.get(paris).add(p1);

//        people.removeIf(person-> person.getAge()<30);
//        people.replaceAll(person -> new Person(person.getName().toUpperCase(), person.getAge()));
//        people.sort(Comparator.comparing(Person::getAge).reversed());
//        people.forEach(System.out::println);

//        System.out.println("People from Paris: " + map.get(paris));

//        System.out.println("People from Paris: " + map.getOrDefault(paris, new ArrayList<>()));
//        System.out.println("People from Paris: " + map.getOrDefault(paris, Collections.EMPTY_LIST));
//
//        System.out.println("People from New York: " + map.getOrDefault(newYork, Collections.EMPTY_LIST));

        map.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p1);
        map.computeIfAbsent(shanghai, city -> new ArrayList<>()).add(p2);
        map.computeIfAbsent(paris, city -> new ArrayList<>()).addAll(Arrays.asList(p3,p4,p5));

        map.compute(newYork, (city, peopleList) -> Arrays.asList(p2));

//        map.replace(newYork, Arrays.asList(p2));
//        map.replaceAll((city, person)-> map.put(newYork, Arrays.asList(p5)));

//        map1.computeIfAbsent(shanghai, city -> new ArrayList<>()).add(p3);
//        map1.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p4);
//        map1.computeIfAbsent(paris, city -> new ArrayList<>()).add(p5);
//
//
//        map1.forEach((city, listOfPeople)-> {
//            map.merge(city, listOfPeople,
//                    (peopleFromMap, peopleFromMap2) ->{
//                        peopleFromMap.addAll(peopleFromMap2);
//                        return peopleFromMap;
//                    });
//        });

        map.forEach((city, personList) -> System.out.println(city + ": " + personList));

    }
}
