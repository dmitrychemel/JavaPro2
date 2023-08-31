package lesson5_date_time.task2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar);
        int result = calendar.get(Calendar.YEAR);
        System.out.println(result);

        result = calendar.get(Calendar.WEEK_OF_MONTH);
        System.out.println(result);

        calendar.set(2020, Calendar.SEPTEMBER, 12, 14, 28, 53);

        result = calendar.get(Calendar.MINUTE);
    }


}
