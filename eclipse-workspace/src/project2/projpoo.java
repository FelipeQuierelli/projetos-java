package project2;

import java.util.Scanner;

public class projpoo {

	public static void main(String[] args) {
		
		Scanner scam = new Scanner(System.in);
		
		String login = "Admin";
		String passw = "1234";
		System.out.print("----------------\n");
		
		boolean acessGranted = false;
		
		int attempts = 0;
		while (attempts <= 3 ) {
			System.out.print("\nLogin: ");
			String s1 = scam.nextLine();
			
			System.out.print("Password: ");
			String s2 = scam.nextLine();
			
			if(s1.equals(login) && s2.equals(passw)) {
				acessGranted = true;
				break;
			}else {
				System.out.print("User incorrect,Try Again");
				attempts++;
			}
			
		}
		if(acessGranted == true) {
			System.out.print("Welcome");
		}else {
			System.out.print("\nSystem denied");
		}
			
	}
		
}


