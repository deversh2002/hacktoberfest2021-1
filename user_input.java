package com.company;
import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = s.nextInt();
        System.out.println("Enter number 2");
        int b = s.nextInt();
        int sum = a +b;
        System.out.println("sum of two numbers is");
        System.out.println(sum);
        System.out.println("To check if the number is integer");
        boolean b1 = s.hasNextInt();
        System.out.println(b1);
        String str = s.nextLine();
        System.out.println(str);

    }


}
