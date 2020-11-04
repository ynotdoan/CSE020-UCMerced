import java.util.Scanner;
public class SumAllDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int maxi;
		int result;
		int num;
		
		System.out.println ("This program will find the sum of all numbers till a specified maximum");
		
		System.out.print ("\nPlease enter the max amount of numbers to add: ");
		maxi = scan.nextInt ();
		
		num = 0;
		result = 0;
		do {
			result += num;
			num = num + 1;
		} 
		while (num <= maxi); 
			System.out.println("\nThe sum of all numbers from 0 till " + maxi + " is: " + result);
	}

}