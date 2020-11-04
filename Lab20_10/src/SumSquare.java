import java.util.Scanner;
public class SumSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner (System.in);
		
		int maxi;
		int num;
		int result;
		int sum;
		
		System.out.print ("Please enter the maximum number: ");
		maxi = kb.nextInt ();
		
		sum = 0;
		result = 0;
		for (num = 0; num <= maxi; num = num + 1) {
			result = (num * num);
		
			System.out.println ("Number " + num + " squared is " + result);
			
			sum = sum + result;
		}
			System.out.println ("\nThe sum of all squares of all numbers from 0 till " + maxi + " is: " + sum);
	}

}
