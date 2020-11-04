import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner (System.in);
		
		int maxi, mult;
		int num = 0;
		
		System.out.println ("This program prints out multiples of a given number till a specified maximum. ");
		
		System.out.print ("\nPlease enter the maximum number: ");
		maxi = kb.nextInt ();
		
		System.out.print ("Please enter the number whose multiples to print: ");
		mult = kb.nextInt ();
		
		System.out.println ("\nMultiples of " + mult + " from 1 till " + maxi + " are: ");
		
		while (num < maxi) {
			num = num + 1;
			if (num % mult == 0) { 
				System.out.println ("Number "+ num);
			}
			
	}
	}
}
