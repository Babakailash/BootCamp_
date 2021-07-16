package com.javapackage;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the spring month: ");
        int m = sc.nextInt();
        System.out.println("Enter the Date: ");
        int d = sc.nextInt();
        System.out.println("Month with Date: 0" + m + "/" + d);


        if (m >= 3 && m <= 6) {

            switch (m) {
                case 3:if(d>=20 && d<=31) {
                    System.out.println("March " + d);

                } else {
                    System.out.println("Out of SpringSeason Date!!!");
                }
                break;
                case 4: if(d>=1 && d<=30) {
                    System.out.println("April " + d);
                } else {
                    System.out.println("Date Not Exist!!");
                }
                    break;

                case 5: if(d>=1 && d<=31) {
                    System.out.println("May " + d);
                } else {
                    System.out.println("Date Not Exist!!");
                }
                    break;

                case 6: if(d>=1 && d<=20) {
                    System.out.println("June " + d);
                } else {
                    System.out.println("Out of SpringSeason Date !!");
                }
                break;
            }
        } else {
            System.out.println("Date Not exist in Spring Season!!!");
        }
    }
}
