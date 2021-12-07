import java.util.Scanner;

// Jonathan Rumley
// 160 CSC 160.401
// Feb. 03, 2020
//

public class Classwork3AdditionQuiz 
{
	public static void main(String[] args)
	{
		// 1. Generate two random single-digit integers
		int number1 = (int)(Math.random() * 100) + 1;
		int number2 = (int)(Math.random() * 100) + 1;
		
		
		// 2. If number1 < number2, swap number1 with number2
		if(number1 < number2)
		{
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		
		// 3. Prompt the student to answer "What is number1 + number2?"
		System.out.print("What is " + number1 + "+" + number2 + "?");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		// 4. Grade the answer and display the result
		if(number1 + number2 == answer)
		{
			System.out.println("You are correct!");
		}
		else
		{
			System.out.println("Your answer is wrong.");
			System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
		}
	}
}
