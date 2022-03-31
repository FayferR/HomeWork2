package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        System.out.println(people(15, -20));
        System.out.println(people(38, 25));
        System.out.println(people(40, -30));
        System.out.println(people(55, 6));
        System.out.println(people(10, 24));

    }


    public static String people(int age, int temp) {
        String goAWalk = "Можно идти гулять";
        String sitAtHome = "Оставайтесь дома";
        if (age > 20 && age < 45 && temp > -20 && temp < 30) {
            return goAWalk;
        } else if (age < 20 && temp > 0 && temp < 28) {
            return goAWalk;
        } else if (age > 45 && temp > -10 && temp < 25) {
            return goAWalk;
        } else {
            return sitAtHome;
        }
    }
}
