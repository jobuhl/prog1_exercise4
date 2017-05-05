import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rackenrotz on 05.05.15.
 */
public class fourthewin {


    private String[][] four = new String[6][7];
    private String[] col = {"1", "2", "3", "4", "5", "6", "7"};
    private String gamer1;
    private String gamer2;
    boolean win1 = false;
    boolean win2 = false;
    private int column;


    // erstellt die Felder für das 4 Gewinnt und Füllt diese mit Leerstellen
    public fourthewin() {

        Scanner scan = new Scanner(System.in);
        // Spieler 1 wird erstellt
        System.out.println("Spieler 1 Name Eingeben: ");
        gamer1 = scan.nextLine();

        // Spieler 2 wird erstellt
        System.out.println("Spieler 2 Name Eingeben: ");
        gamer2 = scan.nextLine();

        // füllt die Felder mit einer Leerstelle
        for (int i = 0; i < four.length; i++) {
            for (int j = 0; j < four[1].length; j++) {
                four[i][j] = " ";
            }
        }
    }

    public void bestoffour1() {


        Scanner scan = new Scanner(System.in);


        System.out.println(Arrays.toString(four[0]));
        System.out.println(Arrays.toString(four[1]));
        System.out.println(Arrays.toString(four[2]));
        System.out.println(Arrays.toString(four[3]));
        System.out.println(Arrays.toString(four[4]));
        System.out.println(Arrays.toString(four[5]));
        System.out.println("---------------------");
        System.out.println(Arrays.toString(col));
        System.out.println(gamer1 + "          bitte geben sie eine Spalte ein (1-7) wo ihr chip rein soll ");

        column = scan.nextInt() - 1;

        if (column >= 0 && column <= 6) {

            for (int i = 5; i >= 0; i--) {

                if (four[i][column].equals(" ")) {
                    four[i][column] = "x";
                    break;
                } else if (!four[0][column].equals(" ")) {
                    System.out.println("Diese Reihe ist voll bitte noch einmal");
                    bestoffour1();
                }
            }
            checkWinner1();
        } else {
            System.out.println("Bitte eine gültige Zahl eingeben");
            bestoffour1();
        }


    }

    public void bestoffour2() {
        Scanner scan = new Scanner(System.in);


        System.out.println(Arrays.toString(four[0]));
        System.out.println(Arrays.toString(four[1]));
        System.out.println(Arrays.toString(four[2]));
        System.out.println(Arrays.toString(four[3]));
        System.out.println(Arrays.toString(four[4]));
        System.out.println(Arrays.toString(four[5]));
        System.out.println("---------------------");
        System.out.println(Arrays.toString(col));
        System.out.println(gamer1 + "          bitte geben sie eine Spalte ein (1-7) wo ihr chip rein soll ");

        column = scan.nextInt() - 1;

        if (column >= 0 && column <= 6) {

            for (int i = 5; i >= 0; i--) {

                if (four[i][column].equals(" ")) {
                    four[i][column] = "o";
                    break;
                } else if (!four[0][column].equals(" ")) {
                    System.out.println("Diese Reihe ist voll bitte noch einmal");
                    bestoffour2();
                }
            }
            checkWinner2();
        } else {
            System.out.println("Bitte eine gültige Zahl eingeben");
            bestoffour2();
        }


    }

    public void checkWinner1() {


        // i zählt die Länge
        for (int i = 0; i < four[0].length; i++) {

            // j zählt die Höhe
            for (int j = 0; j < four.length; j++) {


                if (four[j][i].equals("x") && i <= 4) {

                    if (four[j][i + 1].equals("x")) {

                        if (four[j][i + 2].equals("x")) {

                            if (four[j][i + 3].equals("x")) {

                                win1 = true;


                            } // 4 If
                        }//3 If
                    }//2 If


                }

                if (four[j][i].equals("x") && j < 3) {

                    if (four[j + 1][i].equals("x")) {

                        if (four[j + 2][i].equals("x")) {

                            if (four[j + 3][i].equals("x")) {

                                win1 = true;


                            } // 4 If
                        }//3 If
                    }//2 If


                }

                if (four[j][i].equals("x") && j < 3 && i < 4) {

                    if (four[j + 1][i + 1].equals("x")) {

                        if (four[j + 2][i + 2].equals("x")) {

                            if (four[j + 3][i + 3].equals("x")) {

                                win1 = true;


                            } // 4 If
                        }//3 If
                    }//2 If

                }

                if (four[5 - j][i].equals("x") && j < 3 && i < 4) {

                    System.out.println(j);
                    System.out.println(i);
                    if (four[5 - j - 1][i + 1].equals("x")) {
                        System.out.println(j);
                        System.out.println(i);
                        if (four[5 - j - 2][i + 2].equals("x")) {

                            if (four[5 - j - 3][i + 3].equals("x")) {

                                win1 = true;


                            } // 4 If
                        }//3 If
                    }//2 If

                }
            }


        }

        if (win1 == false) {
            bestoffour2();
        } else {
            winner();

        }

    }

    public void checkWinner2() {


        // i zählt die Länge
        for (int i = 0; i < four[0].length; i++) {

            // j zählt die Höhe
            for (int j = 0; j < four.length; j++) {


                if (four[j][i].equals("o") && i <= 4) {

                    if (four[j][i + 1].equals("o")) {

                        if (four[j][i + 2].equals("o")) {

                            if (four[j][i + 3].equals("o")) {

                                win2 = true;


                            } // 4 If
                        }//3 If
                    }//2 If


                }

                if (four[j][i].equals("o") && j < 3) {

                    if (four[j + 1][i].equals("o")) {

                        if (four[j + 2][i].equals("o")) {

                            if (four[j + 3][i].equals("o")) {

                                win2 = true;


                            } // 4 If
                        }//3 If
                    }//2 If


                }

                if (four[j][i].equals("o") && j < 3 && i < 4) {

                    if (four[j + 1][i + 1].equals("o")) {

                        if (four[j + 2][i + 2].equals("o")) {

                            if (four[j + 3][i + 3].equals("o")) {

                                win2 = true;


                            } // 4 If
                        }//3 If
                    }//2 If

                }

                if (four[5 - j][i].equals("o") && j < 3 && i < 4) {

                    System.out.println(j);
                    System.out.println(i);
                    if (four[5 - j - 1][i + 1].equals("o")) {
                        System.out.println(j);
                        System.out.println(i);
                        if (four[5 - j - 2][i + 2].equals("o")) {

                            if (four[5 - j - 3][i + 3].equals("o")) {

                                win2 = true;


                            } // 4 If
                        }//3 If
                    }//2 If

                }
            }


        }

        if (win2 == false) {
            bestoffour1();
        } else {
            winner();

        }

    }

    public void winner() {

        if (win1 == true) {

            System.out.println(Arrays.toString(four[0]));
            System.out.println(Arrays.toString(four[1]));
            System.out.println(Arrays.toString(four[2]));
            System.out.println(Arrays.toString(four[3]));
            System.out.println(Arrays.toString(four[4]));
            System.out.println(Arrays.toString(four[5]));
            System.out.println("---------------------");
            System.out.println(Arrays.toString(col));

            System.out.println(gamer1 + " hat gewonnen");
        } else if (win2 == true)

        {
            System.out.println(Arrays.toString(four[0]));
            System.out.println(Arrays.toString(four[1]));
            System.out.println(Arrays.toString(four[2]));
            System.out.println(Arrays.toString(four[3]));
            System.out.println(Arrays.toString(four[4]));
            System.out.println(Arrays.toString(four[5]));
            System.out.println("---------------------");
            System.out.println(Arrays.toString(col));

            System.out.println(gamer2 + " hat gewonnen");
        }
    }


    public static void main(String[] args) {
        fourthewin a = new fourthewin();

        a.bestoffour1();


    }

}
