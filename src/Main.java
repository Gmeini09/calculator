// Titel: Aufgabe 2 – Taschenrechner (Mehrfachverzweigung)
// Autor Philipp Gmeinbauer / 04.5.2026

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Zahl 1: ");
        double zahl1 = sc.nextDouble();

        System.out.print("Zahl 2: ");
        double zahl2 = sc.nextDouble();

        System.out.print("Operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double ergebnis;

        switch (operator) {
            case '+':
                ergebnis = zahl1 + zahl2;
                break;
            case '-':
                ergebnis = zahl1 - zahl2;
                break;
            case '*':
                ergebnis = zahl1 * zahl2;
                break;
            case '/':
                if (zahl2 != 0) {
                    ergebnis = zahl1 / zahl2;
                } else {
                    System.out.println("Fehler: Division durch 0!");
                    sc.close();
                    return;
                }
                break;

            default:
                System.out.println("Ungültiger Operator!");
                sc.close();
                return;
        }

        System.out.println("Ergebnis: " + ergebnis);

        sc.close();
    }
}