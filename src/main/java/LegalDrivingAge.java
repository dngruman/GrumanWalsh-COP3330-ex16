/*
* UCF COP3330 Fall 2021 Assignment 1 Solution
* Copyright 2021 Deirdre Gruman-Walsh
*/
import java.util.Scanner;

public class LegalDrivingAge{
        public static void main(String args[])
        {   Scanner user_input = new Scanner(System.in);
            int age;

            System.out.print("What is your age? ");
            age = user_input.nextInt();

            if(age >= 16)
            {
                System.out.println("You are old enough to legally drive.");
            }
            else
            {
                System.out.println("You are old enough to legally drive.");
            }

        }
    }
