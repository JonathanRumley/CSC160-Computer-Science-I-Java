import java.util.Scanner;

public class While 
{

	public static void main(String[] args) 
	{
		//while looping
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();
		
		while (number1 + number2 != answer)
		{
			System.out.println("Wrong answer, try again.");
			System.out.print("What is " + number1 + " + " + number2 + "? ");
			answer = input.nextInt();
		}
		System.out.println("You got it!");
		
		
	}

}
