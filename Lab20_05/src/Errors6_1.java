import java.util.Scanner;

public class Errors6_1 {

	public static void main(String[] args) {
		
		System.out.println("This program will ask the user for three sets of two numbers and will calculate the average of each set.");

		Scanner input = new Scanner(System.in);

		int n1, n2;

		System.out.print("\nPlease enter the first int: ");
		n1 = input.nextInt();

		System.out.print("Please enter the second int: ");
		n2 = input.nextInt();

		int average;
		average = (n1+n2)/2;
		
		System.out.println("The average of the integers is " + average);

		
		float n3, n4;

		System.out.print("\nPlease enter the first float: ");
		n3 = input.nextFloat();

		System.out.print("Please enter the second float: ");
		n4 = input.nextFloat();

		float averageF;
		averageF = (n3+n4)/2;
		
		System.out.println("The average of the floats is " + averageF);
		

		short s1, s2;

		System.out.print("\nPlease enter the first short: ");
		s1 = input.nextShort();

		System.out.print("Please enter the second short: ");
		s2 = input.nextShort();

		short shortAvg;
		shortAvg = (short) ((s1+s2)/2);
		
		System.out.println("The average of the shorts is " + shortAvg);
	}

}
