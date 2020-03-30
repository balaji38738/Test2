import java.util.Scanner;

public class Test {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1 = sc.nextInt(), num2 = sc.nextInt();
		int sum = num1 + num2;
		int multiply = num1 * num2;
		int division = num1 / num2;
		System.out.println("Sum = " + sum);
		System.out.println("Multiplication = " + multiply);
		System.out.println("Division = " + division);

	}
}