import java.util.Scanner;
public class SumAllFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner (System.in);
		
		int maxi;
		int result;
		int num;
		
		System.out.println ("This program will find the sum of all numbers till a specified maximum");
		
		System.out.print ("\nPlease enter the max amount of numbers to add: ");
		maxi = kb.nextInt ();
		
		result = 0;
		num = 0;
		for (num = 0; num <= maxi; num = num + 1)
			result += num;
		
			System.out.println ("\nThe sum of all numbers from 0 till " + maxi + " is: " + result);
	}

}