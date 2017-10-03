import java.util.Scanner;

public class HowOldAreYouSpecifically {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Hey, what's your name?  (Sorry, I keep forgetting.)");
		String name = input.next();
		
		System.out.println("Ok, " + name + ", how old are you?");
		int age = input.nextInt();
		
		if (age < 16) {
			System.out.println("You can't drive, " + name + ".");
		}else if (age == 16 || age == 17) {
			System.out.println("You can drive, but you can't vote, " + name + ".");			
		}else if (age >= 18 && age <= 24) {
			System.out.println("You can vote, but not rent a car, " + name + ".");
		}else {
			System.out.println("You can do pretty much anything, " + name + ".");
		}
		
		input.close();

	}

}
