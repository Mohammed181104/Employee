package com.company;

import java.util.Scanner;

public class Main {

    public static double Employee(String name, int hour, double wage){
        double totalWage;
        if(hour > 45){
            totalWage = 1.5 * wage * hour;

        }else{
            totalWage = hour * wage;
        }
        double finalWage = 0.8 * totalWage;
        return finalWage;
    }


    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name");
        String name = input.next();
        System.out.println("What are your hours");
        int hour = input.nextInt();
        System.out.println("What is your hourly wage");
        double wage = input.nextDouble();
        double finWage = Employee(name,hour,wage);
        System.out.println(name + ", your final wage is " + "£" + finWage);
    }
}
