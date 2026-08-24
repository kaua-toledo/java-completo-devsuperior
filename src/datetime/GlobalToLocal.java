package datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class GlobalToLocal {

    public static void main(String[] args) {

        LocalDate localD = LocalDate.parse("2007-05-07");
        LocalDateTime localDT = LocalDateTime.parse("2007-05-07T20:00:07");
        Instant globalDT = Instant.parse("2026-08-27T01:30:26Z");


        // Parsing global date-time to local date-time
        // global date time (timezone) -> local date time
        LocalDate r1 = LocalDate.ofInstant(globalDT, ZoneId.systemDefault());
        LocalDateTime r2 = LocalDateTime.ofInstant(globalDT, ZoneId.of("Portugal"));

        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);


        // Getting data from a local date-time
        // date time -> year, month, day, time
        System.out.println("\nLocal Date (DoM): " + localD.getDayOfMonth());
        System.out.println("Local Date (MonthValue): " + localD.getMonthValue());
        System.out.println("Local Date (Year): " + localD.getYear());
        System.out.println("Local Date-time (Hour): " + localDT.getHour());
        System.out.println("Local Date-time (Minute): " + localDT.getMinute());


        // Calculating with date-time
        LocalDate pastWeekLocalD = localD.minusDays(7);
        LocalDate nextWeekLocalD = localD.plusDays(7);
        LocalDateTime pastWeekLocalDT = localDT.minusDays(4);
        LocalDateTime nextWeekLocalDT = localDT.plusDays(5);
        Instant pastWeekInstant = globalDT.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = globalDT.plus(7, ChronoUnit.DAYS);
        Duration t1 = Duration.between(pastWeekLocalDT, localDT);
        Duration t2 = Duration.between(pastWeekLocalD.atTime(0, 0), localD.atTime(0, 0));

        System.out.println("\npastWeekLocalDate: " + pastWeekLocalD);
        System.out.println("nextWeekLocalDate: " + nextWeekLocalD);

        System.out.println("\npastWeekLocalDateTime: " + pastWeekLocalDT);
        System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDT);

        System.out.println("\npastWeekInstant: " + pastWeekInstant);
        System.out.println("nextWeekInstant: " + nextWeekInstant);

        System.out.println("\nT1 dias = " + t1.toDays());
        System.out.println("T2 dias = " + t2.toDays());


    }
}
