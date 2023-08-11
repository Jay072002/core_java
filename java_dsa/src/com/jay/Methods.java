package com.jay;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //greeting(); if you call with string argument then
        //greeting(String name) will be called else greeting()

        greeting();

        //create a method that returns the sum of two values
        System.out.print("Enter n1 : ");
        float n1 = in.nextFloat();
        System.out.print("Enter n2 : ");
        float n2 = in.nextFloat();
        float sum = sum(n1, n2);
        System.out.println(sum);

        //create a method that checks if the number is prime or not
        System.out.println("Enter a number : ");
        int num = in.nextInt();
        boolean isPrimeOrNot = isPrime(num);
        System.out.println(isPrimeOrNot);

        // print all the prime numbers from 1 to 100
        for(int i = 0; i<100; i++) {
            boolean result = isPrime(i);
            if(result) {
                System.out.println(i);
            }
        }

        // create a method that check if the number is palindrome or not
        System.out.print("Enter number : ");
        int number = in.nextInt();
        boolean isPalindromeOrNot = isPalindrome(number);
        System.out.println(isPalindromeOrNot);


        //create a method that check if the number is armstrong or not
        System.out.print("Enter number : ");
        int n = in.nextInt();
        boolean isArmstrongOrNot = isArmstrong(n);
        System.out.println(isArmstrongOrNot);


        // print all the armstrong number between 0 to 1000
        for(int i = 0; i<1000; i++) {
            boolean isArmstrongOrNots = isArmstrong(i);

            if(isArmstrongOrNots) {
                System.out.println(i);
            }
        }

    }

    static void greeting() {
        System.out.println("hello from the java program");
    }

    static void greeting(String name) {
        System.out.println("hello "+ name);
    }

    static float sum(float n1,float n2) {
        return n1 + n2;
    }

    static boolean isPrime(int num) {
        //start from 2
        if(num == 2) {
            return true;
        }
        int c = 2;
        while(c*c < num) {
            if(num % c*c == 0) {
                return false;
            }
            c++;
        }
        c=c-1;

        return c*c == num-1;
    }

    static boolean isPalindrome(int num) {
        int originalNum = num;
        int reverseNum = 0;
        while(num > 0) {
            int lastDigit = num % 10;
            reverseNum = reverseNum * 10 + lastDigit; // Fix this line
            num /= 10;
        }

        return originalNum == reverseNum;
    }

    static boolean isArmstrong(int n) {
        int originalNum = n;
        int armstrongNum = 0;
        while(n > 0) {
            int rem = n % 10;
            armstrongNum += rem*rem*rem;
            n /=10;
        }

        return originalNum == armstrongNum;
    }

}
