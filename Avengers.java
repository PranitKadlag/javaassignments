package com.assignments;

import java.util.Scanner;

public class Avengers {
    Scanner sc=new Scanner(System.in);
    String Avg_name,Avg_weapon,Avg_planet,Avg_power;
    int Avg_age;


    public void getDetails(){
        System.out.println("Enter the name of the Avenger:-");
        Avg_name=sc.nextLine();
        System.out.println("Enter the Power of the Avenger:-");
        Avg_power=sc.nextLine();
        System.out.println("Enter the weapon of the Avenger:-");
        Avg_weapon=sc.nextLine();
        System.out.println("Enter the Planet of the Avenger:-");
        Avg_planet=sc.nextLine();
        System.out.println("Enter the age of the Avenger:-");
        Avg_age=sc.nextInt();

    }
    public void displayDetails(){
        System.out.println("The "+Avg_name+" is an Avenger, he is from "+Avg_planet+
                " planet,at the age of " +Avg_age+" also he uses his "+Avg_power+
                " power with the help of "+Avg_weapon+" weapon.");
    }

}
