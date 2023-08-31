package lesson5_date_time.task3;

import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale locale = new Locale("ru");

        Date current = new Date();

        String date = String.format(locale,"%tc", current);
    }
}
