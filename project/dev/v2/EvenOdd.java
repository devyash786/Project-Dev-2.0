package project.dev.v2;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int evenOdd=sc.nextInt();
		if(evenOdd%2==0) {
			System.out.println("Number is even");
			
		}
		else {
			System.out.println("Number is odd");
		}

	}

}
