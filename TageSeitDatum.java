import java.time.LocalDate; // Importiere die LocalDate-Klasse für die Datumsmanipulation
import java.time.format.DateTimeParseException; // Importiere die DateTimeParseException-Klasse für die Behandlung ungültiger Datumsformate
import java.time.temporal.ChronoUnit; // Importiere die ChronoUnit-Enumeration für Zeitmessungen
import java.util.Scanner; // Importiere die Scanner-Klasse für die Benutzereingabe

public class TageSeitDatum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Erstelle ein Scanner-Objekt zur Eingabe von Benutzerdaten

        // Eingabe und Validierung des ersten Datums
        LocalDate datum1 = null;
        do {
            System.out.println("Geben Sie das erste Datum ein (Tag Monat Jahr): ");
            try {
                int tag1 = scanner.nextInt(); // Lese den Tag des ersten Datums
                int monat1 = scanner.nextInt(); // Lese den Monat des ersten Datums
                int jahr1 = scanner.nextInt(); // Lese das Jahr des ersten Datums
                datum1 = LocalDate.of(jahr1, monat1, tag1); // Erstelle ein LocalDate-Objekt für das erste Datum
            } catch (DateTimeParseException e) {
                System.out.println("Ungültiges Datum! Bitte geben Sie das Datum im Format Tag Monat Jahr ein.");
                scanner.nextLine(); // Verwerfe die aktuelle Zeile, um einen Endlosschleifenfehler zu vermeiden
            }
        } while (datum1 == null);

        // Eingabe und Validierung des zweiten Datums
        LocalDate datum2 = null;
        do {
            System.out.println("Geben Sie das zweite Datum ein (Tag Monat Jahr): ");
            try {
                int tag2 = scanner.nextInt(); // Lese den Tag des zweiten Datums
                int monat2 = scanner.nextInt(); // Lese den Monat des zweiten Datums
                int jahr2 = scanner.nextInt(); // Lese das Jahr des zweiten Datums
                datum2 = LocalDate.of(jahr2, monat2, tag2); // Erstelle ein LocalDate-Objekt für das zweite Datum
            } catch (DateTimeParseException e) {
                System.out.println("Ungültiges Datum! Bitte geben Sie das Datum im Format Tag Monat Jahr ein.");
                scanner.nextLine(); // Verwerfe die aktuelle Zeile, um einen Endlosschleifenfehler zu vermeiden
            }
        } while (datum2 == null);

        // Berechnen der Anzahl von vergangenen Tagen zwischen den beiden Daten
        long tage = ChronoUnit.DAYS.between(datum1, datum2); // Berechne die Anzahl der vergangenen Tage zwischen den beiden Daten

        // Ausgabe der Anzahl von vergangenen Tagen
        System.out.println("Anzahl der vergangenen Tage: " + tage);
    }
}
