package getCreative;

import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");

		String userName = input.nextLine();

		System.out.println("Welcome " + userName);
	}

}
