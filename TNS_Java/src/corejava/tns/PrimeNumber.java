package corejava.tns;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		if(num <= 1) {
			System.out.println("Enter correct number: ");
		}
		else {
			for(int i =2; i<=num; i++) {
				if(num % i == 0) {
					System.out.println(num+" is not a prime");
					return;
				}
				
			}
		}
		System.out.println(num+ " is a prime ");
		}
		
	}


