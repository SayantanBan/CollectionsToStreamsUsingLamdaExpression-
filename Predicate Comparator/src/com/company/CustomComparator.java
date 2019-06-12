package com.company;

public class CustomComparator implements java.util.Comparator {

    @Override
    public int compare(Object t1, Object t2) {
        Person p1 = (Person) t1;
        Person p2 = (Person) t2;

        Comparator<Person> cmpPersonAge = Comparator.comparing(Person::getAge);
        Comparator<Person> cmpPersonLastName = Comparator.comparing(Person::getLastName);
        Comparator<Person> cmpPersonFirstName = Comparator.comparing(Person::getFirstName);


        Comparator<Person> cmp1 = cmpPersonAge
                .thenComparing(cmpPersonLastName)
                .thenComparing(cmpPersonFirstName);

        return cmp1.compare(p1,p2);
    }


//    @Override
//    public Comparator thenComparing(Comparator cmp) {
//        return null;
//    }
//
//    @Override
//    public Comparator thenComparing(Function f) {
//        return null;
//    }
}
