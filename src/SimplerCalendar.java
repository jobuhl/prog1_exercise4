import java.util.Scanner;

public class SimplerCalendar {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		// FŸr jede Stunde eine neue Variable
		final int HOURS_PER_DAY = 24;
		String appointments[] = new String[HOURS_PER_DAY];
		for (int hour = 0; hour < appointments.length; hour++) {
			appointments[hour] = "";
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
				System.out.print("Wieviel Uhr? ");
				int hour = scanner.nextInt();
				System.out.print("Termin? ");
				appointments[hour] = scanner.next();
				break;
			case 2: // Termine ausgeben
				for (int anHour = 0; anHour < appointments.length; anHour++) {
					System.out.format("%2dh: " + appointments[anHour], anHour);
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