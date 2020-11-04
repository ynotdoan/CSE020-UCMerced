import java.util.Scanner;

public class AnyAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner (System.in);
		
		int maxi, result = 0, avg = 0;
		int num = 0;
		
		System.out.println ("This program prints out multiples of a given number till a specified maximum. ");
		
		System.out.print ("\nPlease choose the value of numbers to average: ");
		maxi = kb.nextInt ();
		
		while (num < maxi) {
			num = num + 1;
			System.out.print ("Please enter the " + num + " number: ");
			avg += kb.nextInt ();
			
			result = avg / maxi;
		}
			
		System.out.println ("\nThe average of all numbers from 0 till " + maxi + " is " + (double)result);
	}

}
