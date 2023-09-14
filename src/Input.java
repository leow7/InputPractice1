//(c) A+ Computer Science
//www.apluscompsci.com
//NAME - Leo Wang
//DATE - 9/14/2023
//PURPOSE - define, input, and print variables

import java.util.Scanner;

public class Input
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int intOne, intTwo;
        double doubleOne, doubleTwo;
        String stringOne, stringTwo;


        System.out.print("Enter an integer :: ");
        intOne = keyboard.nextInt();


        System.out.print("Enter an integer :: ");
        intTwo = keyboard.nextInt();


        System.out.print("Enter a double :: ");
        doubleOne = keyboard.nextDouble();


        System.out.print("Enter a double :: ");
        doubleTwo = keyboard.nextDouble();
        keyboard.nextLine();


        System.out.print("Enter a string :: ");
        stringOne = keyboard.nextLine();


        System.out.print("Enter a string :: ");
        stringTwo = keyboard.nextLine();


        System.out.println();
        System.out.println("integer one = " + intOne );
        System.out.println("integer two = " + intTwo );

        System.out.println();
        System.out.println("double one = " + doubleOne );
        System.out.println("double two = " + doubleTwo );

        System.out.println();
        System.out.println("string one = " + stringOne );
        System.out.println("string two = " + stringTwo );
    }
}