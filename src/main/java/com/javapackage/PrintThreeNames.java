package com.javapackage;
public class PrintThreeNames {
    public static void main(String[] args) {
        String s = "Alice Bob Carol";
        String ans[] = s.split(" ");
        System.out.println("Hi "+ans[2]+","+ans[1]+", and "+ans[0]+".");
    }
}
