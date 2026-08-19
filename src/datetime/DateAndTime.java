package datahour;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

    public static void main(String[] args) {

        // Defines custom formats for date and date-time values
        DateTimeFormatter firstFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter secondFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


        // Gets the current local date
        LocalDate day1 = LocalDate.now();
        System.out.println("Local date:\n " + day1);

        // Gets the current local date and time
        LocalDateTime day2 = LocalDateTime.now();
        System.out.println("\nLocal date-time:\n " + day2);

        // Gets the current moment in UTC
        Instant day3 = Instant.now();
        System.out.println("\nInstant:\n " + day3);

        // Parses an ISO 8601 date string into a LocalDate.
        LocalDate day4 = LocalDate.parse("2026-08-27");
        System.out.println("\nText ISO 8601 to date:\n" + day4);

        // Parses an ISO 8601 date-time string into a LocalDateTime
        LocalDateTime day5 = LocalDateTime.parse("2026-08-27T15:45");
        System.out.println("\nISO 8601 text to date-time:\n" + day5);

        // Parses an ISO 8601 date-time with an offset and converts it to UTC
        Instant day6 = Instant.parse("2026-08-27T16:10:00-03:00");
        System.out.println("\nISO 8601 GMT-3:00 text to Zulu time:\n" + day6);

        // Parses a date string using a custom format
        LocalDate day8 = LocalDate.parse("27/08/2026", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("\nCustom text to date:\n" + day8);

        // Parses a date-time string using a custom format
        LocalDateTime day9 = LocalDateTime.parse("27/08/2026 05:30", secondFormat);
        System.out.println("\nCustom text to date-time with minute:\n" + day9);

        // Creates a LocalDateTime manually from individual date and time values
        LocalDateTime day10 = LocalDateTime.of(2007, 5, 7, 20, 00);
        System.out.println("\nCreating a date-time manually: \n" + day10);

    }
}
