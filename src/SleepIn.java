
public class SleepIn {

	public static void main(String[] args) {
		boolean weekday = true;
		System.out.println("Is it a weekday? " + weekday);
		boolean vacation = false;
		System.out.println("On vacation? " + vacation);
		boolean weekend = !weekday;
		System.out.println("Is it a weekend? " + weekend);

		System.out.println("Can haz extra sleep?");
		System.out.println(weekend || vacation);
	}

}
