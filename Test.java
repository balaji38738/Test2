import java.util.Scanner;

public class Test {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1 = sc.nextInt(), num2 = sc.nextInt();
		int subtract = num1 - num2;
		int sum = num1 + num2 + 20;
		int multiply = num1 * num2;
		int division = num1 / num2;
		System.out.println(sum + " " + multiply + " " + subtract);

	}
}