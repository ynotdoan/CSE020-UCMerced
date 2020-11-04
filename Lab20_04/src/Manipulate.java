import java.util.Scanner;

public class Manipulate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		
		int n1, n2;
		short n3, n4;
		float n5, n6;
		double n7, n8;
		
		System.out.println("Please print two integers: ");
		n1 = kb.nextInt();
		n2 = kb.nextInt();
		
		int Sum, Difference, Product, Divide, Percent;
		Sum = n1 + n2;
		Difference =  n1 - n2;
		Product = n1 * n2;
		Divide = n1 / n2;
		Percent = n1 % n2;
		
		System.out.println("Sum of " + n1 + " and " + n2 + " is " + Sum);
		System.out.println("Difference of " + n1 + " and " + n2 + " is " + Difference);
		System.out.println("Product of " + n1 + " and "+ n2 + " is " + Product);
		System.out.println("Integer cast of " + n1 + " and " + n2 + " is " + Divide);
		System.out.println("Integer cast of " + n1 + " and " + n2 + " is " + Percent);
		
		System.out.println("\nPlease print two shorts: ");
		n3 = kb.nextShort();
		n4 = kb.nextShort();

		short SSum, SDifference, SProduct, SDivide, SPercent;
		SSum = (short) (n3 + n4);
		SDifference = (short) ( n3 - n4);
		SProduct = (short) (n3 * n4);
		SDivide = (short) (n3 / n4);
		SPercent = (short) (n3 % n4);
		
		System.out.println("Sum of " + n3 + " and " + n4 + " is " + SSum);
		System.out.println("Difference of " + n3 + " and " + n4 + " is " + SDifference);
		System.out.println("Product of " + n3 + " and "+ n4 + " is " + SProduct);
		System.out.println("Short cast of " + n3 + " and " + n4 + " is " + SDivide);
		System.out.println("Short cast of " + n3 + " and " + n4 + " is " + SPercent);
		
		System.out.println("\nPlease print two floating points: ");
		n5 = kb.nextFloat();
		n6 = kb.nextFloat();
		
		float FSum, FDifference, FProduct, FDivide, FPercent;
		FSum = n5 + n6;
		FDifference =  n5 - n6;
		FProduct = n5 * n6;
		FDivide = n5 / n6;
		FPercent = n5 % n6;
		
		System.out.println("Sum of " + n5 + " and " + n6 + " is " + FSum);
		System.out.println("Difference of " + n5 + " and " + n6 + " is " + FDifference);
		System.out.println("Product of " + n5 + " and "+ n6 + " is " + FProduct);
		System.out.println("Float cast of " + n5 + " and " + n6 + " is " + FDivide);
		System.out.println("Float cast of " + n5 + " and " + n6 + " is " + FPercent);
		
		System.out.println("\nPlease print two doubles: ");
		n7 = kb.nextDouble();
		n8 = kb.nextDouble();
		
		double DSum, DDifference, DProduct, DDivide, DPercent;
		
		DSum = n7 + n8;
		DDifference =  n7 - n8;
		DProduct = n7 * n8;
		DDivide = n7 / n8;
		DPercent = n7 % n8;
		
		System.out.println("Sum of " + n7 + " and " + n8 + " is " + DSum);
		System.out.println("Difference of " + n7 + " and " + n8 + " is " + DDifference);
		System.out.println("Product of " + n7 + " and "+ n8 + " is " + DProduct);
		System.out.println("Double cast of " + n7 + " and " + n8 + " is " + DDivide);
		System.out.println("Double cast of " + n7 + " and " + n8 + " is " + DPercent);
		
	}

}
