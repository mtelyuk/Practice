package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main extends NewClass1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    @Override
    public Set<Character> characters(char[] arr) {
         Set<Character> set1 = new HashSet<>();
        for (char each: arr) {
           set1.add(each);
        }
        return set1;
    }


    public void method2() {

    }
    public void method2(int n) {

    }
}