/*
 * Class: CMSC203 
 * Instructor: David Kuijt
 * Description: ESPGame
 * Due: 09/19/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Student Name here: Ya-Wen Cheng
*/

import java.util.Scanner;
import java.io.*;
import java.util.Random;
import java.util.*;

public class ESPGame {

	public static void main(String[] args) throws IOException
	{
		
		
		Random randomnum = new Random();
		int count = 0;
		System.out.println("Welcome to ESP Game!");
		System.out.println("You only have 3 chances to guess");
		final int colors = 16;
		
		for (int i=0; i<3; i++)
		{
			Scanner keyboard = new Scanner(System.in);
			File inputFile = new File("colors.txt");
			Scanner fileReader = new Scanner(inputFile);
			int selected = randomnum.nextInt(colors)+1;
			
			System.out.println("Enter your guess: ");
			String guess = keyboard.next();
			Boolean msg = false;
			
			while (fileReader.hasNext())
			{
				String line =  fileReader.nextLine();
				if (line.contains(guess.toLowerCase()) && line.contains(String.valueOf(selected)))
				{
					
					msg = true;
					count += 1;
					fileReader.close();
					break;
				}

					
			}
		
			if (msg == true)
				System.out.print("Correct!\n");
			else
				System.out.print("Wrong!\n");
			
			
			
		}
		Scanner keyboard = new Scanner(System.in);
		System.out.println("The number of correct guesses: " + count);
		System.out.println("Your name?");
		String Username = keyboard.nextLine();
		System.out.println("Enter a sentence that describes yourself");
		String Desc = keyboard.nextLine();
		System.out.println("Enter the Due Date in a format of MM/DD/YY");
		String DueDate = keyboard.nextLine();
		System.out.println("The game is over!");
		System.out.println("User Name: "+ Username);
		System.out.println("User Description: "+ Desc);
		System.out.println("Date: "+ DueDate);
		

	}

}