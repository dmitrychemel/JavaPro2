package lesson5_date_time.task4;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateTast {
    public static void main(String[] args) {
        ZonedDateTime date = ZonedDateTime.now();

        ZoneId zoneId = ZoneId.systemDefault();

        System.out.println(date);

        ZonedDateTime date1 = ZonedDateTime.of(2015,5,21,
                22,0,0,0, zoneId);
        System.out.println(date1);
    }
}
