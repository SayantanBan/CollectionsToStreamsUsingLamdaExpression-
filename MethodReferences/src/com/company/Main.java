package com.company;

import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinaryOperator<Integer> sum = Integer::sum;

        System.out.println(sum.apply(1,2));
    }
}
