import java. util. Scanner;

public class DataAnalyze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner (System.in);

		int SampleSize = 10000;
		int n1;
		int n2;
		int n3;
		int n4;
		int [] s1 = new int [SampleSize];
		int [] s2 = new int [SampleSize];
		int [] s3 = new int [SampleSize];
		int [] s4 = new int [SampleSize];
		int a = 4;
		double [] avg = new double [a];
		double [] total = new double [a];
		int maxi, mini, minimini;

		System.out.print ("Please enter the sample size: ");
		SampleSize = kb.nextInt ();

		if (SampleSize < 1) {
			System.out.println ("No data to analyze. Ending program. ");
		}
		else {
			System.out.println ("Enter numbers for Trial 1");

			for (n1 = 0; n1 < SampleSize;) {
				n1++;
				System.out.print ("Enter sample #" + n1 + ": ");
				s1 [n1] += kb.nextInt ();
				total [1] = total [1] + s1 [n1];
			}

			System.out.println ("\nEnter numbers for Trial 2");
			for (n2 = 0; n2 < SampleSize;) {
				n2++;
				System.out.print ("Enter sample #" + n2 + ": ");
				s2 [n2] += kb.nextInt ();
				total [2] = total [2] + s2 [n2];
			}

			System.out.println ("\nEnter numbers for Trial 3");
			for (n3 = 0; n3 < SampleSize;) {
				n3++;
				System.out.print ("Enter sample #" + n3 + ": ");
				s3 [n3] += kb.nextInt ();
				total [3] = total [3] + s3 [n3];
			}

			System.out.println ("\nEnter numbers for Trial 4");
			for (n4 = 0; n4 < SampleSize;) {
				n4++;
				System.out.print ("Enter sample #" + n4 + ": ");
				s4 [n4] += kb.nextInt ();
				total [4] = total [4] + s4 [n4];
			}

			System.out.println ("\n\tSample # \tTrial 1 \tTrial 2 \tTrial 3 \tTrial 4");
			for (a = 0; a < SampleSize;) {
				a++;
				System.out.println ("\t" + a + " \t\t" + s1 [a] + " \t\t" + s2 [a] + " \t\t" + s3 [a] + " \t\t" + s4 [a]);
			}
			System.out.println ("\t------------------------------------------------------------------------");


			for (a = 0; a < 4; a++) {
				avg [a] = total [a] / SampleSize;
			}

			System.out.println ("Averages: \t\t" + avg [1] + " \t\t" + avg [2] + " \t\t" + avg [3] + " \t\t" + avg [4]);

			maxi = (int) avg [0];
			minimini = (int) avg [0];
			mini = 0;
			for (a = 0; a < 4; a++) {
				if (avg [a] > maxi) {
					maxi = (int) avg [a];
				}
				if (avg [a] < maxi) {
					minimini = mini;
					mini = (int) avg [a];
				}
			}
			System.out.println ("\nMin Average: " + (double) minimini);
			System.out.println ("Max Average: " + (double) maxi);

			if (minimini == maxi) {
				System.out.println ("\nThe trials match EXACTLY! ");
			}
			else if ((minimini * 2) > maxi) {
				System.out.println ("\nThe trials concur with each other! ");
			}
			else if ((minimini * 2) < maxi) {
				System.out.println ("\nThe trials do NOT concur! ");
			}
		}
	}

}
