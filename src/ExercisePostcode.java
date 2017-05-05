import java.util.Scanner;
import java.io.*;

public class ExercisePostcode {

	public static void main(String[] args) throws FileNotFoundException {
//		java.io.File here = new java.io.File(".");
//		System.out.println(here.getAbsolutePath());
		java.io.File postcodeFile = new java.io.File("src/OpenGeoDB-plz-ort-de.csv");
		System.out.println(postcodeFile.getAbsolutePath());
		if (postcodeFile.exists() && postcodeFile.canRead()) {
			System.out.println("File exists and can be read");
		}
		java.util.Scanner scanner = new java.util.Scanner(postcodeFile, "UTF-8");

		int lastPostcode = -1;
		int aPostcode = -1;
		String aTown = "";
		while (scanner.hasNextLine()) {
			aPostcode = scanner.nextInt();
			aTown = scanner.nextLine();
			if (aPostcode != lastPostcode) {
				lastPostcode = aPostcode;
				System.out.println(aPostcode + " " + aTown);
			}
		}

		scanner.close();
	}

}
