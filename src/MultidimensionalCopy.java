public class MultidimensionalCopy {

	public static void main(String[] args) {
		final int DAYS_PER_MONTH = 31;
		final int HOURS_PER_DAY = 24;
		String[][] oldCalendar = new String[DAYS_PER_MONTH][HOURS_PER_DAY];
		System.out.println("oldCalendar");
		System.out.println("3. Tag, 8-Uhr-Termin: " + oldCalendar[3 - 1][8]);

		oldCalendar[3 - 1][8] = "Vorlesung";
		System.out.println("3. Tag, 8-Uhr-Termin: " + oldCalendar[3 - 1][8]);

		String[][] newCalendar = new String[31][24];
		System.out.println("newCalendar");

		// // 1. Versuch: Feldreferenz zuweisen
		// newCalendar = oldCalendar;
		
		// // 2. Versuch: Flache Kopie
		// newCalendar = oldCalendar.clone();
		
		// // 3. Versuch: Tiefe Kopie mit Schleife
		// for (int day = 0; day < newCalendar.length; day++) {
		// for (int hour = 0; hour < newCalendar[day].length; hour++) {
		// newCalendar[day][hour] = oldCalendar[day][hour];
		// }
		// }
		
		
		System.out.println("3. Tag, 8-Uhr-Termin: " + newCalendar[3 - 1][8]);
		// Nur oldCalendar Šndern
		oldCalendar[3 - 1][8] = "Keine Vorlesung";
		System.out.println("3. Tag, 8-Uhr-Termin: " + newCalendar[3 - 1][8]);
	}
}
