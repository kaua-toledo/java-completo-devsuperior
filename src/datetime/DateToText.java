package datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateToText {

    static void main(String[] args) {

        // Creating date and time objects from ISO-formatted strings
        LocalDate d01 = LocalDate.parse("2026-08-27");
        LocalDateTime d02 = LocalDateTime.parse("2026-08-27T15:45");
        Instant d03 = Instant.parse("2026-08-27T01:30:26Z");

        // Custom and predefined formatters for converting date/time objects into text
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;


        // Formatting LocalDate using different approaches
        System.out.println("d01: " + d01.format(fmt1));
        System.out.println("d01: " + fmt1.format(d01));
        System.out.println("d01: " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        // Formatting LocalDateTime with custom and ISO patterns
        System.out.println("\nd02: " + d02.format(fmt1));
        System.out.println("d02: " + d02.format(fmt2));
        System.out.println("d02: " + d02.format(fmt4));

        // Formatting Instant using the system time zone and ISO standard
        System.out.println("\nd03: " + fmt3.format(d03));
        System.out.println("nd03: " + fmt5.format(d03)); // ou System.out.println("nd03: " + d03.toString());

    }
}
