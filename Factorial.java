package Codoid;
//Java program to implement factorial using recursion
import java.util.Scanner;
public class Factorial{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter factorial value: ");
		long number = in.nextLong();
		System.out.println("factorial of "+ number +" is: "+fact(number));
		}
	static long fact(long number) {
		if(number == 1) {
			return 1;
		}
		else {
			return number * fact(number-1);
		}
	}
}