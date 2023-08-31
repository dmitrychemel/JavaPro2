package lesson5_date_time.task1;

import java.util.Date;

public class DateTest2 {
    public static void main(String[] args) {

        Date date1 = new Date(100, 4, 12);
        Date current = new Date();
        Date date2 = new Date(110, 9, 27);
        Date date3 = new Date(100, 4, 12);


        boolean result = date1.before(date2);
        System.out.println("Date 1 before date2 - " + result);

        result = date1.after(date2);
        System.out.println("Date 1 after date2 - " + result);

        result = date1.before(current);
        System.out.println("Date 1 after current - " + result);

        int result1 = date1.compareTo(date3);
        System.out.println("Result date1.compareTo(date3) - " + result1);

        result1 = date1.compareTo(current);
        System.out.println("Result date1.compareTo(current) - " + result1);

        System.out.println(date1.equals(date3));
        System.out.println(current.equals(date2));
    }
}
