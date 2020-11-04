import java.util.Scanner;

public class FiveAverage {

	public static void main(String[] args) {
		System.out.println("This program will find the average of up to 5 numbers");

		Scanner input = new Scanner(System.in);

		int count, total, runningCount;

		System.out.print("Please choose amount of numbers to average (0-5): ");
		count = input.nextInt();

		runningCount = count;
		total = 0;

		if (runningCount == 5) {
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			int num = input.nextInt();
			total = total + num;
			runningCount = runningCount - 1;
		}

		if (runningCount == 4) {
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			total = total + input.nextInt();
			runningCount = runningCount - 1;
		}

		if (runningCount == 3) {
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			total += input.nextInt();
			runningCount = runningCount - 1;
		}

		if (runningCount == 2) {
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			total += input.nextInt();
			runningCount--;
		}

		if (runningCount == 1) {
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			total += input.nextInt();
			--runningCount;
		}

		if (count > 0)
			System.out.println("Average is " + ((double)total/count));
		else
			System.out.println("There are no numbers to average.");
	
		int i = 0; // i == 0
		int j = i++;  // i == 1
		int k = ++i;  // i == 2
		System.out.println(j);	
		System.out.println(k);	
		
		/*
		System.out.println("Prefix and Postfix operator Code");
		int i = 10; // 10
		i--; // 9
		System.out.println(i);		//9
		--i;			   // 8
		System.out.println(i);	 // 8	
		System.out.println(++i); // 9, 9	
		System.out.println(i++); // 10, 9	
		System.out.println(i);	// 10
		System.out.println(--i); // 9	
		System.out.println(i--); // 8	
		System.out.println(i);	// 8

		if (i++ == 8)
			System.out.println("Eight");
		
		if (++i == 9)
			System.out.println("Nine");
		
		System.out.println("Final value " + i);
		*/
	}
}