package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Integer> ints = Arrays.asList(0, 1, 2, 3, 4);

        Stream<Integer> stream1 = ints.stream();
        Stream<Integer> stream2 = Stream.of(0, 1, 2, 3, 4);
        Stream<String> streamOfStrings = Stream.generate(()-> "one");
        Stream<String> streamOfStrings2 = Stream.iterate("+", s->s + "+");
        IntStream streamOfInt = ThreadLocalRandom.current().ints();
//        stream2.forEach(System.out::println);
        streamOfInt.limit(5).forEach(System.out::println);
    }
}
