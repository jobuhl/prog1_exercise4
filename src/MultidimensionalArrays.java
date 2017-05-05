import java.util.Arrays;

public class MultidimensionalArrays {

	public static void main(String[] args) {
		final int DAYS_IN_MONTH = 31;
		final int HOURS_PER_DAY = 24;
		String[][] calendar;

		calendar = new String[DAYS_IN_MONTH][];
		for (int day = 0; day < calendar.length; day++) {
			calendar[day] = new String[HOURS_PER_DAY];
			for (int hour = 0; hour < calendar[day].length; hour++) {
				calendar[day][hour] = "1";
			}
		}

		System.out.println(Arrays.toString(calendar[1]));

	}

}
