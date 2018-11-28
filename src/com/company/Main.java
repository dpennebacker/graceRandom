package com.company;

import java.util.Random;
public class Main {

    public static void main(String[] args) {
	// write your code here

        int r = 0, count = 0;
        Random rndm = new Random();
        for (int j = 0; j < 100; j++) { //for loop to generate 100 random numbers
            r = 1 + rndm.nextInt(100);
            System.out.print(r + " ");
            count++; //used for the if statement
            if (count > 100) { //printing out all 100 numbers on one line
                System.out.println("");
            }
            //How can you know if
            //you are getting all numbers?
            //Array?
            //How about a boolean array of 100 length?
            //Then...when you get 59, set the 59th index
            //to true.
            //Then, loop to find if all values of array are
            //true. When it is, break the loop and read
            //your count number. 


        }
    }
}
