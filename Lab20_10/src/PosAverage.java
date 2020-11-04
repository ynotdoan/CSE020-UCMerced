import java.util.Scanner;
public class PosAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner (System.in);
		
		int num;
		int i;
		int avg;
		
		System.out.println ("Enter 0 or less to stop entering numbers. ");
		
		num = 0;
		avg = 0;
		i = 0;
		do {
			i = i + 1;
			System.out.print ("Enter value #" + i + ": ");
			num = kb.nextInt ();
			avg += num;
		}
		while (num > 0);
		
		avg = (avg-num) / (i-1);

		System.out.println ("Average is " + avg);
		}	
				
}

