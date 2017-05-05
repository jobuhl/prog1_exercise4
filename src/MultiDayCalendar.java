import java.util.Scanner;

public class MultiDayCalendar {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		final int HOURS_PER_DAY = 24;
		final int DAYS_PER_MONTH = 31;
		String appointments[][] = new String[DAYS_PER_MONTH][];
		for (int day = 0; day < appointments.length; day++) {
			appointments[day] = new String[HOURS_PER_DAY];
			for (int hour = 0; hour < appointments[day].length; hour++) {
				appointments[day][hour] = "";
			}
		}

		// Hauptschleife
		boolean done = false;
		while (!done) {
			// AuswahlmenŸ
			System.out.println("1 = Neuer Eintrag");
			System.out.println("2 = Termine ausgeben");
			System.out.println("3 = Beenden");
			int choice = scanner.nextInt();

			// Fallunterscheidung
			switch (choice) {
			case 1: // Neuer Eintrag
				System.out.print("Welcher Tag? ");
				int inputDay = scanner.nextInt();
				System.out.print("Wieviel Uhr? ");
				int hour = scanner.nextInt();
				System.out.print("Termin? ");
				appointments[inputDay - 1][hour] = scanner.next();
				break;
			case 2: // Termine ausgeben
				System.out.println("Welcher Tag? ");
				int outputDay = scanner.nextInt();
				for (int anHour = 0; anHour < appointments[outputDay - 1].length; anHour++) {
					System.out.format("%2dh: "
							+ appointments[outputDay - 1][anHour], anHour);
					System.out.println("");
				}
				System.out.println("------------");
				break;
			case 3: // Beenden
				done = true;
				break;
			default: // Falsche Eingabe
				System.out.println("Eingabefehler");
			}
		}

	}

}
