import java.util.Scanner;
public class MultiplesFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner (System.in);
		
		int maxi;
		int multiple;
		int num;
		
		
		System.out.println ("This program prints out multiples of a base number till a specified maximum.");
		
		System.out.print ("\nPlease enter the maximum number: ");
		maxi = kb.nextInt ();
		System.out.print ("Please enter the base number of whose multiples to print: ");
		multiple = kb.nextInt ();
		
		System.out.println ("\nMultiples of " + multiple + " from 1 till " + maxi + " are: ");
		
		for (num = 1; num <= maxi; num++) {
			if (num % multiple == 0)
				System.out.println("Number " + num);
		}
	
	}

}
