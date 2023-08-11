package com.jay;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

    /*
    arrays does not store in a continues memory in java the element of array
    can be stored anywhere in the memory but the reference variable point to
    that value which is stored in the memory as there are no concept like pointers
    in java, so we cannot get the memory address of that value
    the element in the array should be of type by which it is declared
    while initializing array size parameter is must
    arrays are mutable and are stored by the copy of the reference of
    the value in the memory any changes by the one reference variable can be seen
    in the other too
    */

    //array declaration and initialization
    int[] intArr = new int[5];

//    intArr[0] = 12;
//    intArr[1] = 16;
//    intArr[2] = 13;
//    intArr[3] = 20;
//    intArr[4] = 30;

    //we can insert the element in the array like this but isn't it hectic to fill
    //the array like this

    //we have another syntax to fill the array when declare
    int[] literalArr = {12,16,13,20,30}; //same as above

    //or we can loop through the array to fill the array either by taking an input
    //from the user or loop through array to do some business logic

    Scanner in = new Scanner(System.in);

    // input the array elements
//    for(int i = 0; i < intArr.length; i++) {
//        intArr[i] = in.nextInt();
//    }

    // output the array element
//    for(int i = 0; i< intArr.length; i++) {
//        System.out.print(intArr[i]);
//    }

    //another way to iterate over the element not index
    // same as for of loop in node.js
//    for(int elem : intArr) {
//        System.out.print(elem);
//    }


    //2-dimension array

    //syntax

//    int[][] twoDArr = new int[3][3];
//
//    twoDArr[0][0] = 12;
//    twoDArr[0][1] = 12;
//    twoDArr[0][2] = 12;
//    twoDArr[1][0] = 12;
//    twoDArr[1][1] = 12;
//    twoDArr[1][2] = 12;
//    twoDArr[2][0] = 12;
//    twoDArr[2][1] = 12;
//    twoDArr[2][2] = 12;


    //you can assume 2d array as a matrix here, when initializing 2d array the
    //row length is must column isn't necessary

    //another way to initialize the 2d array when declaring is

    int[][] twoDArrayLiteral = {
            {12,12,12},
            {12,12,12},
            {12,12,12}
    }; //same as above


    //another way to take the elements from the user

    for(int row = 0; row < twoDArrayLiteral.length; row++) {
        for(int col = 0; col< twoDArrayLiteral[row].length; col++){
//            System.out.print(twoDArrayLiteral[row][col] + " ");
        }
//        System.out.println();
    }

    //another way to print an 2d array
    for(int row = 0 ; row< twoDArrayLiteral.length; row++) {
//        System.out.println(Arrays.toString(twoDArrayLiteral[row]));
    }

    //modern loop can also work for 2d array
    for(int[] col: twoDArrayLiteral) {
        System.out.println(Arrays.toString(col));

    }

    }
}


//        00:46 🤔 Arrays are needed when there's a need to store a collection of data elements of the same type. They provide a way to efficiently store and manage multiple values of the same data type.
//        03:18 🧩 The syntax to create an array in Java involves specifying the data type followed by square brackets. Memory for the array is dynamically allocated at runtime using the `new` keyword.
//        05:13 🧱 Arrays in Java are collections of elements of the same data type, and all elements in the array must have the same data type.
//        09:37 📊 Java heap objects, including arrays, are not necessarily continuous blocks of memory, unlike in some other languages like C++. JVM manages memory dynamically at runtime for heap objects.
//        20:18 📑 When an array of non-primitive objects is created, each element of the array is initialized with the default value `null`.
//        25:53 🧠 Java arrays store reference variables, and each element in the array points to objects in the heap memory.
//        28:32 📝 You can use for loops to easily populate arrays with user input or print their elements.
//        31:23 🔄 Enhanced for-loop (for-each) provides a cleaner way to iterate through array elements directly without using indices.
//        37:20 💡 Java 2D arrays can be visualized as arrays of arrays, where each element points to another array in the heap memory.
//        48:26 🔄 The size of individual rows in a 2D array can vary, as each row is a separate object with its own memory allocation.
//        51:01 👉 Arrays in Java are initialized with a fixed size, making them less flexible for dynamic input.
//        53:07 👉 To take input for a 2D array, use nested for loops to iterate through each row and column.
//        54:25 👉 Use `Arrays.toString()` or enhanced for loops to print the 2D array in a more readable format.
//        59:14 👉 For varying column sizes, access the size of each row individually using `array[row].length`.
//        01:05:20 👉 ArrayList in Java provides a dynamic-size array-like structure, allowing adding elements without specifying a fixed size.
//        01:14:31 🔄 Constructor in Java is used to define initial values for an object. It is essential in object-oriented programming but not discussed in detail here.
//        01:15:00 📝 ArrayList in Java can dynamically add elements without specifying an initial size. It internally resizes and doubles its capacity as needed when elements are added beyond the initial capacity.
//        01:15:30 ➕ Elements can be added to an ArrayList using the `add` method. There is no need to specify an initial size, and multiple elements can be added sequentially.
//        01:17:39 ❓ ArrayList provides useful methods like `contains`, `set`, and `remove` to perform operations on its elements, making it easy to manipulate data.
//        01:25:08 🔄 ArrayList internally resizes its capacity to accommodate more elements. When the capacity is reached, it creates a new, larger ArrayList and copies the elements to it. The process of resizing maintains a constant amortized time complexity for adding elements.
//        01:40:15 🔀 To reverse an array in Java, use the "two pointer method." Swap elements at the start and end indices iteratively until the start index becomes greater than the end index.
//        01:40:48 🔄 The two pointer method works for arrays of both even and odd lengths.
//        01:43:05 ➕ The `swap` function can be used to swap elements in the array efficiently during the reversal process.
//        01:43:18 🎯 The two pointer method is a useful approach for solving specific coding challenges, such as those involving array rotation or palindromic arrays.
//        01:44:12 📅 Future videos will focus on solving coding questions related to arrays using techniques like sliding window and two-pointer methods.