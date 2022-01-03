package java8;

import java.time.*;
import java.util.Date;

public class LocalDateAndTime {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        System.out.println(System.currentTimeMillis());
        Date date1 = new Date(1641192466035L);
        System.out.println(date1);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getYear());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.minusDays(1));
        System.out.println(localDate.plusDays(1));
        System.out.println(localDate.plusMonths(1));

        ZoneId zoneId = ZoneId.of("Australia/Darwin");
        System.out.println(zoneId);

        LocalDate localDate1 = LocalDate.now(zoneId);
        System.out.println(localDate1);

        LocalTime localTime = LocalTime.now(zoneId);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate from = LocalDate.of(2021,12,20);
        LocalDate to = LocalDate.of(2022,1,3);

        Period period = Period.between(from,to);
        System.out.println(period);

        LocalDateTime fromDate = LocalDateTime.of(2021,12,20,12,12,12);
        LocalDateTime toDate = LocalDateTime.of(2022,1,3,12,12,12);
        Duration duration = Duration.between(fromDate,toDate);
        System.out.println(duration.toDays());

    }
}
