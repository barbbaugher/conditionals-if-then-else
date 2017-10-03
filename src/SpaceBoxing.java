import java.util.Scanner;

public class SpaceBoxing {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your current Earth weight: ");
		double weight = input.nextDouble();

		System.out.println("I have information for the following planets: ");
		System.out.println("\t 1. Venus \t 2. Mars \t 3. Jupiter");
		System.out.println("\t 4. Saturn \t 5. Uranus \t 6. Neptune");

		System.out.println("Which planet are you visiting, please enter the number:");
		int planetNumber = input.nextInt();

		if (planetNumber == 1) {
			System.out.println("Your weight would be " + weight * .78 + " pounds on that planet.");
		} else if (planetNumber == 2) {
			System.out.println("Your weight would be " + weight * .39 + " pounds on that planet.");
		} else if (planetNumber == 3) {
			System.out.println("Your weight would be " + weight * 2.65 + " pounds on that planet.");
		} else if (planetNumber == 4) {
			System.out.println("Your weight would be " + weight * 1.17 + " pounds on that planet.");
		} else if (planetNumber == 5) {
			System.out.println("Your weight would be " + weight * 1.05 + " pounds on that planet.");
		} else if (planetNumber == 6) {
			System.out.println("Your weight would be " + weight * 1.23 + " pounds on that planet.");
		} else {
			System.out.println("Invalid planet selection.");
		}
		
		input.close();
	}

}
