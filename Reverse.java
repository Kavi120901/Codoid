package Codoid;
//Java program to reverse a string
import java.util.Scanner;
public class Reverse{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String value: ");
		String input = in.nextLine();
		char[] rs = input.toCharArray();
		System.out.println("Reverse of a given string is: ");
		for(int i = rs.length-1; i>=0 ; i--) {
			System.out.print(rs[i]);
		}
		
	}
}