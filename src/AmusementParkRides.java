
public class AmusementParkRides {

	public static void main(String[] args) {
		int heightInInches = 10;

		// heightInInches >= 60 is our *condition*
		if (heightInInches >= 60) {
			System.out.println("You are tall enough to ride.");
			System.out.println("Congratulations!");
		} else if (heightInInches >= 30) {
			System.out.println("Try the teacups. They look fun.");
		} else if (heightInInches <= 11) {
			System.out.println("What is a baby doing here?");
		} else {
			System.out.println("I'm sorry, too short.");
		}

	}

}
