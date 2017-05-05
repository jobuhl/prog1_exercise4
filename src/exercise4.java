import com.sun.org.apache.bcel.internal.generic.GOTO;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import sun.awt.image.IntegerInterleavedRaster;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

/**
 * Created by Rackenrotz on 26.04.15.
 */
public class exercise4 {


    //22.1
    public int[] arrays(int n) {

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = (int) (Math.random() * 200 - 100);

        }
        System.out.println(Arrays.toString(arr));


        return arr;
    }

    //22.2

    public void sumAVG(int n) {

        int[] a = arrays(n);

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("Summe von " + Arrays.toString(a) + ": " + sum);

        double avg = (double) sum / a.length;

        System.out.println("Durchschnitt von " + Arrays.toString(a) + ": " + avg);

    }

    //22.3
    public void index(int n) {

        int[] a = arrays(n);

        int max = 0;
        int min = 0;
        for (int i = 0; i < a.length; i++) {


            if (a[min] > a[i]) {
                a[min] = a[i];
            }


        }
        System.out.println("Maximum der Liste " + a[min]);

        for (int i = 0; i < a.length; i++) {
            if (a[max] < a[i]) {
                a[max] = a[i];
            }
        }
        System.out.println("Maximum der Liste " + a[max]);

    }

    //23.1
    public ArrayList<Integer> isPrim(int prim) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for (int i = 2; i <= prim; i++) {

            if (i % 2 == 0 && i > 2 || i > 3 && i % 3 == 0 || i > 5
                    && i % 5 == 0 || i > 7 && i % 7 == 0) {

            } else {
                arr1.add(i);
            }

        }

        for (int i = 0; i < arr1.size(); i++) {
            for (int j = 0; j < arr1.size(); j++) {
                if (arr1.get(i) % arr1.get(j) == 0
                        && arr1.get(i) != arr1.get(j)) {
                    arr1.remove(i);
                    i = i - 1;

                }

            }

        }
        // System.out.println(arr1);


        for (int i = 4; i < 101; i++) {
            if (!arr1.contains(i))
                arr2.add(i);

        }
        //System.out.println(arr2);

        return arr2;

    }

    public void primFactor() {


        System.out.println("Liste aller Primzahlen von 0-100: ");
        System.out.println(primFactor2(100));
        int count = 0;
        do {
            System.out.println();


            primFactor1(isPrim(100).get(count));

            int max = 0;
            int min = 0;
            for (int i = 0; i < arr4.size(); i++) {


                if (arr4.get(min) > arr4.get(i)) {
                    min = i;
                }


            }
            System.out.println("Minimum der Primfaktorenzerlegung von " + isPrim(100).get(count) + ": " + arr4.get(min));

            for (int i = 0; i < arr4.size(); i++) {
                if (arr4.get(max) < arr4.get(i)) {
                    max = i;
                }
            }
            System.out.println("Maximum der Primfaktorenzerlegung von " + isPrim(100).get(count) + ": " + arr4.get(max));


            arr4.removeAll(arr4);


            count++;

        } while (count < isPrim(100).size());


    }


    ArrayList<Integer> arr4 = new ArrayList();

    public ArrayList<Integer> primFactor1(int prim) {


        Boolean test = false;
        for (int i = 0; i < primFactor2(prim).size(); i++) {

            if (prim == primFactor2(prim).get(i)) {
                test = true;

            } else {
                test = false;

            }
        }
        if (test == true) {
            arr4.add(prim);


        } else {
            double prim2 = (double) prim;

            for (int i = 1; i < primFactor2(prim).size(); i++) {

                if (prim2 > 3 && prim2 % 2 == 0) {
                    arr4.add(2);
                    prim2 = prim2 / 2;
                    primFactor1((int) prim2);
                    break;

                }
                if (prim2 > 3 && prim2 % primFactor2(prim).get(i) == 0) {
                    arr4.add(primFactor2(prim).get(i));
                    prim2 = prim2 / primFactor2(prim).get(i);
                    primFactor1((int) prim2);
                    break;
                }
            }
        }
        return arr4;
    }


    public ArrayList<Integer> primFactor2(int prim) {

        ArrayList<Integer> arr6 = new ArrayList<Integer>();
        for (int i = 2; i <= prim; i++) {

            if (i % 2 == 0 && i > 2 || i > 3 && i % 3 == 0 || i > 5
                    && i % 5 == 0 || i > 7 && i % 7 == 0) {

            } else {
                arr6.add(i);
            }

        }

        for (int i = 0; i < arr6.size(); i++) {
            for (int j = 0; j < arr6.size(); j++) {
                if (arr6.get(i) % arr6.get(j) == 0
                        && arr6.get(i) != arr6.get(j)) {
                    arr6.remove(i);
                    i = i - 1;

                }

            }

        }

        return arr6;
    }

    //23.3
    public void primFactor3(int n) {
        if (primFactor2(n).contains(n)) {
            System.out.println("Eingebene Zahl ist eine Primzahl");
        } else if (n < 2) {
            System.out.println("Die eingegene Zahl muss eine Natürliche Zahl >= 2 sein");
        } else {

            ArrayList<Integer> arr7 = primFactor1(n);

            System.out.println(arr7);
            for (int i = 0; i < arr7.size() - 1; i++) {
                System.out.print(arr7.get(i) + " * ");
            }
            System.out.println(arr7.get(arr7.size() - 1));

        }
    }
    //24.1

    public void day1() {
        System.out.println("Bitte eine Zahl im Bereich von 1 - 365 Tage eingeben");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n < 0 || n > 365) {
            System.out.println("Bitte eine Zahl im Bereich von 1 - 365 Tage eingeben");
            day1();
        } else {

            System.out.println("Tag: ");
            switch (n % 7) {

                case 1:
                    System.out.println("Montag");
                    break;

                case 2:
                    System.out.println("Dienstag");
                    break;

                case 3:
                    System.out.println("Mittwoch");
                    break;

                case 4:
                    System.out.println("Donnerstag");
                    break;

                case 5:
                    System.out.println("Freitag");
                    break;

                case 6:
                    System.out.println("Samstag");
                    break;

                case 0:
                    System.out.println("Sonntag");
                    break;
            }

            System.out.println("");
            System.out.println("Monat: ");

            int count = 0;
            if (n <= 31) {
                count = 1;
            } else if (n > 31 && n <= 59) {
                count = 2;
            } else if (n > 59 && n <= 90) {
                count = 3;
            } else if (n > 59 && n <= 120) {
                count = 4;
            } else if (n > 80 && n <= 151) {
                count = 5;
            } else if (n > 151 && n <= 181) {
                count = 6;
            } else if (n > 181 && n <= 212) {
                count = 7;
            } else if (n > 212 && n <= 243) {
                count = 8;
            } else if (n > 243 && n <= 273) {
                count = 9;
            } else if (n > 273 && n <= 304) {
                count = 10;
            } else if (n > 304 && n <= 334) {
                count = 11;
            } else if (n > 334 && n <= 365) {
                count = 12;
            }


            switch (count) {
                case 1:
                    System.out.println("Januar");
                    break;

                case 2:
                    System.out.println("Februar");
                    break;

                case 3:
                    System.out.println("März");
                    break;

                case 4:
                    System.out.println("April");
                    break;

                case 5:
                    System.out.println("Mai");
                    break;

                case 6:
                    System.out.println("Juni");
                    break;

                case 7:
                    System.out.println("Juli");
                    break;

                case 8:
                    System.out.println("August");
                    break;

                case 9:
                    System.out.println("September");
                    break;

                case 10:
                    System.out.println("Oktober");
                    break;

                case 11:
                    System.out.println("November");
                    break;

                case 12:
                    System.out.println("Dezember");
                    break;
            }


        }

    }

    public void day2() {

        System.out.println("Bitte geben sie hier eineinen Tag von 1 bis 365 ein: ");
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();

        int month = 0;
        int newday = day - 1;
        if (day <= 31) {
            month = 0;
        } else if (day > 31 && day <= 59) {
            month = 1;
            newday = newday - 31;
        } else if (day > 59 && day <= 90) {
            month = 2;
            newday = newday - 59;
        } else if (day > 91 && day <= 120) {
            month = 3;
            newday = newday - 91;
        } else if (day > 120 && day <= 151) {
            month = 4;
            newday = newday - 120;
        } else if (day > 151 && day <= 181) {
            month = 5;
            newday = newday - 151;
        } else if (day > 181 && day <= 212) {
            month = 6;
            newday = newday - 181;
        } else if (day > 212 && day <= 243) {
            month = 7;
            newday = newday - 212;
        } else if (day > 243 && day <= 273) {
            month = 8;
            newday = newday - 243;
        } else if (day > 273 && day <= 304) {
            month = 9;
            newday = newday - 273;
        } else if (day > 304 && day <= 334) {
            month = 10;
            newday = newday - 304;
        } else if (day > 334 && day <= 365) {
            month = 11;
            newday = newday - 334;
        }

        String[][] calendar;


        calendar = new String[12][];
        calendar[0] = new String[31];
        calendar[1] = new String[28];
        calendar[2] = new String[31];
        calendar[3] = new String[30];
        calendar[4] = new String[31];
        calendar[5] = new String[30];
        calendar[6] = new String[31];
        calendar[7] = new String[31];
        calendar[8] = new String[30];
        calendar[9] = new String[31];
        calendar[10] = new String[30];
        calendar[11] = new String[31];


        String wochentag[] = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"};
        String monate[] = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};

        int a = 0;
        int b = 0;

        for (int i = 0; i < calendar.length; i++) {
            // Tage des Monats 'i'
            for (int j = 0; j < calendar[i].length; j++) {
                calendar[i][j] = wochentag[(a) % 7];
                a++;
            }
        }

        System.out.println("Monat: " + monate[month] + " Tag: " + calendar[month][newday]);
    }


    public void getZip(String plz) throws FileNotFoundException {
        java.io.File postcodeFile = new java.io.File("src/OpenGeoDB-plz-ort-de.csv");
        System.out.println(postcodeFile.getAbsolutePath());
        if (postcodeFile.exists() && postcodeFile.canRead()) {
            System.out.println("File exists and can be read");
        }
        java.util.Scanner scanner = new java.util.Scanner(postcodeFile, "UTF-8");


        String zip;
        String town;

        while (scanner.hasNextLine()) {
            zip = scanner.next();
            town = scanner.nextLine();
            if (plz.equals(zip)) {
                System.out.println("");
                System.out.println(town);
                break;
                //Für alle Städte mit der gleichen PLZ muss er break entfernt werden
            }

        }
    }


    String[][] ziparr = new String[4][50];

    public void getbackery() throws FileNotFoundException {


        java.io.File postcodeFile = new java.io.File("src/baeckereistellen.csv");
        System.out.println(postcodeFile.getAbsolutePath());
        if (postcodeFile.exists() && postcodeFile.canRead()) {
            System.out.println("File exists and can be read");
        }
        java.util.Scanner scanner = new java.util.Scanner(postcodeFile, "UTF-8");


        String[] arr1 = new String[10];

        String[][] arr2 = new String[3][30];
        String zip;
        String address;

        System.out.println("Bitte geben sie eine Postleizahl aus Konstanz ein: ");
        Scanner scan = new Scanner(System.in);
        String newzip = scan.next();


        int a = 0, b = 0, c = 0, d = 0;
        while (scanner.hasNextLine()) {


            if (scanner.next().contains("Konstanz")) {
                zip = scanner.next();
                address = scanner.nextLine();

                if (zip.equals("78462")) {
                    ziparr[0][a] = address;
                    a++;
                    //System.out.println(address);
                }
                if (zip.equals("78464")) {
                    ziparr[1][b] = address;
                    b++;
                    //System.out.println(address);
                }
                if (zip.equals("78465")) {
                    ziparr[2][c] = address;
                    c++;
                    //System.out.println(address);
                }
                if (zip.equals("78467")) {
                    ziparr[3][d] = address;
                    d++;
                    //System.out.println(address);
                }


            }
        }


        if (newzip.equals("78462")) {
            System.out.println("Alle Bäckereien in dem PLZ " + newzip);

            for (int i = 0; i < ziparr[0].length; i++) {
                if (ziparr[0][i] != null) {
                    System.out.println(ziparr[0][i]);
                }
            }
        } else if (newzip.equals("78464")) {
            System.out.println("Alle Bäckereien in dem PLZ " + newzip);

            for (int i = 0; i < ziparr[1].length; i++) {
                if (ziparr[1][i] != null) {
                    System.out.println(ziparr[1][i]);
                }
            }
        } else if (newzip.equals("78465")) {
            System.out.println("Alle Bäckereien in dem PLZ " + newzip);

            for (int i = 0; i < ziparr[2].length; i++) {
                if (ziparr[2][i] != null) {
                    System.out.println(ziparr[2][i]);
                }
            }
        } else if (newzip.equals("78464")) {
            System.out.println("Alle Bäckereien in dem PLZ " + newzip);

            for (int i = 0; i < ziparr[3].length; i++) {
                if (ziparr[3][i] != null) {
                    System.out.println(ziparr[3][i]);
                }
            }
        } else {
            System.out.println("Keine PLZ aus Konstanz eingegeben");
            getbackery();
        }
    }

    String[][][] arrchess = new String[8][8][2];

    public void chess1() {

        System.out.println("Ausgabe auf deutsch? bitte deutsch eingeben! ");
        System.out.println("Output in english? Please write english!");
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.next();

        if (scan.equals("english")) {

            chess2();
        } else {

            String[] field = {"A", "B", "C", "D", "E", "F", "G", "H"};


            //Färbt Turm - Turm schwarz
            arrchess[0][0][0] = "\033[30mTurm  \033[0m";
            arrchess[0][1][0] = "\033[30mPferd \033[0m";
            arrchess[0][2][0] = "\033[30mLäufer\033[0m";
            arrchess[0][3][0] = "\033[30mDame  \033[0m";
            arrchess[0][4][0] = "\033[30mKönig \033[0m";
            arrchess[0][5][0] = "\033[30mLäufer\033[0m";
            arrchess[0][6][0] = "\033[30mPferd \033[0m";
            arrchess[0][7][0] = "\033[30mTurm  \033[0m";

            //färbt Bauer schwarz
            for (int i = 0; i < arrchess[1].length; i++) {
                arrchess[1][i][0] = "\033[30mBauer \033[0m";
            }

            //Füllt die Leeren Felder zwischen weiß und Schwarz
            for (int i = 2; i <= arrchess.length - 2; i++) {
                for (int j = 0; j < arrchess.length; j++) {
                    arrchess[i][j][0] = "      ";

                }
            }


            arrchess[7][0][0] = "Turm  ";
            arrchess[7][1][0] = "Pferd ";
            arrchess[7][2][0] = "Läufer";
            arrchess[7][3][0] = "Dame  ";
            arrchess[7][4][0] = "König ";
            arrchess[7][5][0] = "Läufer";
            arrchess[7][6][0] = "Pferd ";
            arrchess[7][7][0] = "Turm  ";
            for (int i = 0; i < arrchess[6].length; i++) {
                arrchess[6][i][0] = "Bauer ";
            }


            for (int i = 0; i < arrchess[7].length; i++) {
                arrchess[0][i][1] = "schwarz";
                arrchess[1][i][1] = "schwarz";
            }

            for (int i = 0; i < arrchess[7].length; i++) {
                arrchess[7][i][1] = "weiß";
                arrchess[6][i][1] = "weiß";
            }


            System.out.print("[");
            for (int i = 0; i < arrchess[0].length - 1; i++) {
                System.out.print(arrchess[0][i][0] + " | ");
            }
            System.out.println(arrchess[0][7][0] + "]");
            System.out.print("[");
            for (int i = 0; i < arrchess[1].length - 1; i++) {
                System.out.print(arrchess[1][i][0] + " | ");
            }
            System.out.println(arrchess[1][7][0] + "]");


            for (int i = 2; i < arrchess[2].length; i++) {
                System.out.print("[");
                for (int j = 0; j < arrchess[2].length - 1; j++) {
                    System.out.print(arrchess[i][j][0] + " | ");
                }

                System.out.println(arrchess[i][7][0] + "]");
            }


            System.out.println("");

            for (int i = 0; i < arrchess.length; i++) {
                for (int j = 0; j < arrchess.length; j++) {
                    if (arrchess[i][j][1] != null) {
                        System.out.println(arrchess[i][j][1] + "er" + " " + arrchess[i][j][0] + " auf " + field[i] + (j + 1));
                    }
                }
            }

        }
        System.out.println(Arrays.toString(arrchess[0][0]));
        System.out.println(Arrays.toString(arrchess[7][0]));
    }

    public void chess2() {

        System.out.println("Ausgabe auf deutsch? bitte deutsch eingeben! ");
        System.out.println("Output in english? Please write english!");
        Scanner scanner = new Scanner(System.in);

        String[] field = {"A", "B", "C", "D", "E", "F", "G", "H"};


        //Färbt Turm - Turm schwarz
        arrchess[0][0][0] = "\033[30mRook  \033[0m";
        arrchess[0][1][0] = "\033[30mKnight\033[0m";
        arrchess[0][2][0] = "\033[30mBishop\033[0m";
        arrchess[0][3][0] = "\033[30mQueen \033[0m";
        arrchess[0][4][0] = "\033[30mKing  \033[0m";
        arrchess[0][5][0] = "\033[30mBishop\033[0m";
        arrchess[0][6][0] = "\033[30mKnight\033[0m";
        arrchess[0][7][0] = "\033[30mRook  \033[0m";

        //färbt Bauer schwarz
        for (int i = 0; i < arrchess[1].length; i++) {
            arrchess[1][i][0] = "\033[30mPown  \033[0m";
        }

        //Füllt die Leeren Felder zwischen weiß und Schwarz
        for (int i = 2; i <= arrchess.length - 2; i++) {
            for (int j = 0; j < arrchess.length; j++) {
                arrchess[i][j][0] = "      ";

            }
        }


        arrchess[7][0][0] = "Rook  ";
        arrchess[7][1][0] = "Knight";
        arrchess[7][2][0] = "Bishop";
        arrchess[7][3][0] = "Queen ";
        arrchess[7][4][0] = "King  ";
        arrchess[7][5][0] = "Bishop";
        arrchess[7][6][0] = "Knight";
        arrchess[7][7][0] = "Rook  ";
        for (int i = 0; i < arrchess[6].length; i++) {
            arrchess[6][i][0] = "Pawn  ";
        }


        for (int i = 0; i < arrchess[7].length; i++) {
            arrchess[0][i][1] = "black";
            arrchess[1][i][1] = "black";
        }

        for (int i = 0; i < arrchess[7].length; i++) {
            arrchess[7][i][1] = "white";
            arrchess[6][i][1] = "white";
        }


        System.out.print("[");
        for (int i = 0; i < arrchess[0].length - 1; i++) {
            System.out.print(arrchess[0][i][0] + " | ");
        }
        System.out.println(arrchess[0][7][0] + "]");
        System.out.print("[");
        for (int i = 0; i < arrchess[1].length - 1; i++) {
            System.out.print(arrchess[1][i][0] + " | ");
        }
        System.out.println(arrchess[1][7][0] + "]");


        for (int i = 2; i < arrchess[2].length; i++) {
            System.out.print("[");
            for (int j = 0; j < arrchess[2].length - 1; j++) {
                System.out.print(arrchess[i][j][0] + " | ");
            }

            System.out.println(arrchess[i][7][0] + "]");
        }


        System.out.println("");

        for (int i = 0; i < arrchess.length; i++) {
            for (int j = 0; j < arrchess.length; j++) {
                if (arrchess[i][j][1] != null) {
                    System.out.println(arrchess[i][j][1] + " " + arrchess[i][j][0] + " on " + field[i] + (j + 1));
                }
            }
        }


    }


    public void ricekorn() {

        long[][] arrrice = new long[8][8];

        long corn = 1;


        for (int i = 0; i < arrrice.length; i++) {

            arrrice[i][0] = corn;
            corn = corn * 2;
            //  System.out.println(arrrice[i][0]);

        }

        for (int i = 0; i < arrrice.length; i++) {

            arrrice[i][1] = corn;
            corn = corn * 2;
            //System.out.println(arrrice[i][1]);

        }

        for (int i = 0; i < arrrice.length; i++) {

            arrrice[i][2] = corn;
            corn = corn * 2;
            //System.out.println(arrrice[i][2]);

        }
        for (int i = 0; i < arrrice.length; i++) {

            arrrice[i][3] = corn;
            corn = corn * 2;
            //System.out.println(arrrice[i][3]);

        }
        for (int i = 0; i < arrrice.length; i++) {

            arrrice[i][4] = corn;
            corn = corn * 2;
            //System.out.println(arrrice[i][4]);

        }
        for (int i = 0; i < arrrice.length; i++) {

            arrrice[i][5] = corn;
            corn = corn * 2;
            //System.out.println(arrrice[i][5]);

        }
        for (int i = 0; i < arrrice.length; i++) {

            arrrice[i][6] = corn;
            corn = corn * 2;
            //System.out.println(arrrice[i][6]);

        }
        for (int i = 0; i < arrrice.length; i++) {

            arrrice[i][7] = corn;
            corn = corn * 2;
            //System.out.println(arrrice[i][7]);

        }


    }

    public void dameProblem() {
        String[][] arrdame = new String[8][8];



        int count1 = 0;
        int count2 = 0;
        int x = 0;
        int y = 0;


        for (int i = 0; i < arrdame.length; i++) {
            if (arrdame[0][i] == null) {

                count1++;

            }
            if (arrdame[i][0] == null) {
                count2++;

            }


        }
        if(count1 == 8 && count2 == 8){

            arrdame[x][y] = "Dame";
            x++;
            y++;

        }

        System.out.println(Arrays.toString(arrdame[0]));
        System.out.println(Arrays.toString(arrdame[1]));
        System.out.println(Arrays.toString(arrdame[2]));
        System.out.println(Arrays.toString(arrdame[3]));
        System.out.println(Arrays.toString(arrdame[4]));
        System.out.println(Arrays.toString(arrdame[5]));
        System.out.println(Arrays.toString(arrdame[6]));
        System.out.println(Arrays.toString(arrdame[7]));


    }


    public void faust() throws FileNotFoundException {


        File faust = new File("src/faust.txt");
        System.out.println(faust.getAbsolutePath());
        if (faust.exists() && faust.canRead()) {
            System.out.println("File exists and can be read");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        Scanner scanner = new Scanner(faust);

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben sie bitte einen Buchstaben a-z ein");
        String input = scan.next();

        String text;
        int counter = 0;
        String temp;
        while (scanner.hasNextLine()) {
            text = scanner.next();
            for (int i = 0; i < text.length(); i++) {
                temp = text.substring(i, i + 1);
                if (temp.equals(input)) {
                    counter++;
                }

            }


        }
        System.out.println("Der Buchstabe " + input + " existiert " + counter + " mal");


    }


    public static void main(String[] args) throws FileNotFoundException {

        exercise4 a = new exercise4();
        //a.arrays(10);
        //a.sumAVG(10);
        //a.index(10);
        //a.isPrim(100);
        //a.primFactor();
        //a.primFactor3(0);
        //a.day2();
        //a.getZip("01067");
        //a.getbackery();
        //a.chess1();
        //a.ricekorn();
        a.dameProblem();
        //a.faust();

    }

}
