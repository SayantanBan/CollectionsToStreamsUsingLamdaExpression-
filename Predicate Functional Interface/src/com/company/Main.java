package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Predicate<String> p1 = s -> s.length() < 20;
        Predicate<String> p2 = s -> s.length() > 5;
        Predicate<String> p3 = p1.and(p2);
        Predicate<String> p4 = p1.or(p2);
        Predicate<String> p5 = Predicate.isEqualsTo("Yes");

        boolean b1 = p3.test("Hello World");

        boolean b2 = p4.test("Hello World");

        System.out.println("String is greater than 20 characters " + b1);
        System.out.println("String is greater than 20 characters " + b2);

        System.out.println(p5.test("Yes"));
        System.out.println(p5.test("No"));
    }
}
