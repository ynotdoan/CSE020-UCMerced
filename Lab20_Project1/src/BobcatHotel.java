import java.util.Scanner;

public class BobcatHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner (System.in);

		double guests, roomcost, mealcost, PTC, nights, AAA, AAADiscount, rng, TCB, NewCMD, CMDiscount;
		int CM, room, meal;
		
		CM = 0;
		AAA = 0;
		
		System.out.println ("Hello! Thank you for choosing Bobcat Hotel. ");

		System.out.println ("\nROOM OPTIONS ");
		System.out.println ("1. Single: \t\t$50.50 per night ");
		System.out.println ("2. Double: \t\t$75.00 per night");
		System.out.println ("3. Queen: \t\t$100.75 per night");
		System.out.println ("4. King: \t\t$150.25 per night");
		System.out.println ("5. Master Suite: \t$225.50 per night");

		System.out.println ("\nPlease enter the info below: ");
		System.out.print ("Number of guests: ");
		guests = kb.nextInt ();
		System.out.print ("Please select your choice of room (enter from options 1-5 above): ");
		room = kb.nextInt ();
		System.out.print ("Please enter the number of nights you wish to stay: ");
		nights = kb.nextInt ();
		System.out.print ("Are you a AAA member? (enter 1 for yes, 0 for no): ");
		AAA = kb.nextInt ();

		
			System.out.print ("Are you a club member? (enter 1 for yes, 0 for no): ");
			CM = kb.nextInt ();
		

			rng = 0;
			
				if (CM == 0) {
					System.out.println ("\nUnfortunately, you didn't qualify for our \"Stay 4 nights get 1 free promotion\". Better luck nect time!");
				}
				else if (CM == 1) {
					rng = ((int)(Math.random() + (10-1)+1));
				}
				if (rng < 4 && CM == 1) {
					System.out.println ("\nUnfortunately, you didn't qualify for our \"Stay 4 nights get 1 free promotion\". Better luck nect time!");
				}
				else if (rng >= 4) {
					System.out.println ("\nCongragulations! You've qualified for our \"Stay 4 nights get 1 free promotion\" \nDiscount will be applied during checkout depending on the number of days");
				}
				meal = 0;

		if (room <= 4) {
					System.out.println ("\nMEAL PACKAGES (PRICES SHOWN PER NIGHT): ");
					System.out.println ("0. Complementary: \t$0 per guest");
					System.out.println ("1. Standard: \t$30 per guest");
					System.out.println ("2. Deluxe: \t$50 per guest");
					System.out.print ("\nPlease select your desired meal package (Select from options 0-2 above): ");
					meal = kb.nextInt ();
				}
		else if (room > 4) {
					System.out.println ("\nMEAL PACKAGES (PRICES SHOWN PER NIGHT): ");
					System.out.println ("0. Complementary: \t$0 per guest");
					System.out.println ("1. Standard: \t$30 per guest");
					System.out.println ("2. Deluxe: \t$50 per guest");
					System.out.println ("3. Infulgence: \t$85 per guest");
					System.out.print ("\nPlease select your desired meal package (Select from options 0-3 above): ");
					meal = kb.nextInt();
				}

				roomcost = 0;

				switch (room) {

				case 1: 
					roomcost = 50.50 * nights;
					break;
				case 2:
					roomcost = 75.00 * nights;
					break;
				case 3:
					roomcost = 100.75 * nights;
					break;
				case 4: 
					roomcost = 150.25 * nights;
					break;
				case 5:
					roomcost = 225.50 * nights;
					break;
				}

				mealcost = 0;

				switch (meal) {

				case 0:
					mealcost = 0 * guests * nights;
					break;
				case 1:
					mealcost = 30 * guests * nights;
					break;
				case 2:
					mealcost = 50 * guests * nights;
					break;
				case 3:
					mealcost = 85 * guests * nights;
					break;
				}

				PTC = roomcost + mealcost;

				AAADiscount = 0;
			if (AAA == 1) {
					AAADiscount = PTC * 0.10;
				}
			else if (AAA == 0) {
				AAADiscount = 0;
			}

				NewCMD = 0;
				CMDiscount = (int)(nights / 4);
			if ((CM == 1 && rng >= 4) && room == 1) {
				NewCMD = 50.50 * CMDiscount;
			}
			if ((CM == 1 && rng >= 4) && room == 2) {
				NewCMD = 75.00 * CMDiscount;;
			}
			if ((CM == 1 && rng >= 4) && room == 3) {
				NewCMD = 100.75 * CMDiscount;
			}
			if ((CM == 1 && rng >= 4) && room == 4) {
				NewCMD= 150.25 * CMDiscount;
			}
			if ((CM == 1 && rng >= 4) && room == 5) {
				NewCMD= 225.50 * CMDiscount;
			}
			else if (CM == 0) {
				NewCMD = 0;
			}
			

				TCB = PTC - (AAADiscount + NewCMD);

				System.out.println ("\nCHECKOUT ");
				System.out.println ("Room Cost: \t\t$" + roomcost );

				if (meal > 0) {
					System.out.println ("Meal Cost: \t\t+$" + mealcost );
				}
				else if (meal == 0) {
					//no meal package
				}

				System.out.println ("Preliminary Total Cost: $" + PTC );

				if ((AAA == 0 && CM == 0) || (CM == 1 && rng < 4)); {
					System.out.println ("No Discounts Added ");
				}
				if (AAA == 1) {
					System.out.println ("AAA Discount: \t\t-$" + AAADiscount );
				}
				if (CM == 1 && rng >= 4); {
					System.out.println ("Club Member Dicount: \t-$" + NewCMD);
				}
				System.out.println ("Total Cost of Booking: \t$" + TCB);
			}
		}
	
