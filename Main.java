package com.assignments;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//  Questions 1:
//  create a class avenger with
//  properties (name,age,power,weapon,planet) and with
//  functions-getDetails() and displayDetails().
//  create 5 objects as an array in the main method and call.

        System.out.println("The First Question of the assignment is....!");
        Avengers[] av=new Avengers[5];//array object
        for(int i=0;i<5;i++)
        {
            av[i]=new Avengers();
        }

        for(int i=0;i<5;i++)
        {
            av[i].getDetails();
            av[i].displayDetails();
        }
//  Questions 2:
//  Create an int array with 5 values and print only odd values
        System.out.println("The Second Question of the assignment is....!");
        int[] arr=new int[5];
        arr[0]=21;
        arr[1]=32;
        arr[2]=43;
        arr[3]=46;
        arr[4]=95;
        for(int i=0;i<5;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.println("The odd numbers are:-"+arr[i]);
            }

        }
//  Questions 3:
//  Create an int array of size 5, take all the values from the user, add all the values and print the sum.

        System.out.println("The Third Question of the assignment is....!");
        int[] arradd=new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter the elements of the array:-");
            arradd[i]=sc.nextInt();

        }
        int addition=arradd[0]+arradd[1]+arradd[2]+arradd[3]+arradd[4];
        System.out.println("The Addition of the array elements is:-"+addition);
    }
}
