package j2ee.research.tutorial.lang;

public class EnumTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(WeekDay.FRIDAY.ordinal());
		System.out.println(WeekDay.valueOf("FRIDAY"));

	}

}
