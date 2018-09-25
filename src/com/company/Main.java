package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int i = 0;
        int num = 0;
        int randomNumber1 = ((int) (Math.random() * 10));
        int randomNumber2 = ((int) (Math.random() * 100));
        int randomNumber3 = ((int) (Math.random() * 1000));
        int randomNumber4 = ((int) (Math.random() * 10000));
        Scanner reader = new Scanner(System.in);
        System.out.println("Hi, what's your name?");
        String playerName = reader.nextLine();
        System.out.println("Hi " + playerName + ", let's play the guessing game");
        System.out.println("Choose a game mode: 1)1-10 2)1-100 3) 1-1000 4)1-10000");
        
        if ()
        {
            System.out.println("Guess a number between 1 and 100 ");
            int guess = reader.nextInt();
            num++;
            if (guess == randomNumber1)
            {
                System.out.println("You got the correct answer!");
                i++;
            }
        }



    }
}
