package variablesmethods;
import java.util.Scanner;
public class IntegerSum {
	 
	 	public static void main(String[] args)

	 	{

	 	Scanner console = new Scanner(System.in);

	 	int num1, num2;

	 	System.out.print("Enter first number: 2 ");

	 	num1 = console.nextInt();

	 	System.out.print("Enter second number: 8 ");

	 	num2 = console.nextInt();

	 	int sum = getTotal(num1, num2);

	 	System.out.println("Sum: " + sum);

	 	}

	 	public static int getTotal(int number1, int number2)

	 	{

	 	return number1 + number2;

	 	}

}
