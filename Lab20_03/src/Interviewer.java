import java.util.Scanner;

public class Interviewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		String name;
		String city;
		String year;
		int dob;
		float height;
		float heightcm;
		
		System.out.print("What is your name? ");
		name = kb.nextLine();
		
		System.out.print("Ok, " + name + ", where are you from? ");
		city = kb.nextLine();
		
		System.out.print("What is your class standing? ");
		year = kb.nextLine();
		
		System.out.print("What is your year of birth? ");
		dob = kb.nextInt();
		
		System.out.print("Finally, how tall are you in inches? ");
		height = kb.nextFloat();
		
		heightcm = (float) (height * 2.54);
		
		System.out.print("Ok, " + name + ". You were born in " + dob + " and you are currently a " + year + ". ");
		System.out.print("You are from " + city + ", and you are " + heightcm + " cm. ");
		System.out.print("It is nice to meet you, " + name + "! ");
		
	}


}
