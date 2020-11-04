import java.util.Scanner;

public class SumAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner (System.in);
		
		int maxi, result = 0;
		int num = 0;
		
		System.out.println ("This program prints out multiples of a given number till a specified maximum. ");
		
		System.out.print ("\nPlease enter the maximum numbers to add up: ");
		maxi = kb.nextInt ();
		
		while (num < maxi) {
			num = num + 1;
			System.out.println ("Number " + num);
			
			result = result + num;
		}
			
		System.out.println ("\nThe sum of all numbers from 0 till " + maxi + " is " + result);
	}
}
