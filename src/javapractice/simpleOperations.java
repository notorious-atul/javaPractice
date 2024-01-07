package javapractice;

import java.util.Scanner;

public class simpleOperations {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Printing exercise:");
		
		String name = scanner.nextLine(); //use scanner.next = if user press spaces between sentence 
		
		System.out.println("Hello, " + name + "!");
		
	}

}
