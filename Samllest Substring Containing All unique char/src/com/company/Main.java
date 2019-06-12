package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {


    public static int countSmallestSubstring(String s){

        char[] c = s.toCharArray();

        HashSet<Character> hs = new HashSet<>();
        HashSet<Character> hs2 = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();
        int count=0;

        for (int i=0;i<c.length;i++)
        {
            hs.add(c[i]);
        }

        for(int i=0; i<c.length; i++)
        {
            hs2.addAll(hs);
            for(int k=i; k<c.length; k++)
            {
                if(hs2.contains(c[k])){
                    hs2.remove(c[k]);
                    count++;
                }
                else if(!hs2.isEmpty())
                {
                    count++;
                }
            }

            if(hs2.isEmpty())
                al.add(count);
            count=0;
        }

        return Collections.min(al);
    }

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int a = countSmallestSubstring(s);

        System.out.println(a);
    }
}
