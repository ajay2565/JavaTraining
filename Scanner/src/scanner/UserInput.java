package scanner;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter some number");
	int user_input_number = scan.nextInt();
	System.out.println("the entered value is");
	System.out.print(user_input_number);
	}

}
