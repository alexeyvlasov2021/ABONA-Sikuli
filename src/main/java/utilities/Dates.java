package utilities;

import org.sikuli.script.Key;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Dates {
    static public String getCurrentDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDateTime now = LocalDateTime.now();
        String date = dtf.format(now);
//        System.out.println(date);
        return date;
    }

    static public String getTomorrowDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime tomorrow = now.plusDays(1);
        String date = dtf.format(tomorrow);
//        System.out.println(date);
        return date;
    }

    static public String getCurrentWeek(){
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("w");
//        LocalDateTime now = LocalDateTime.now();
//        String date = dtf.format(now);
//        return date;

        // Получаем текущую дату
        LocalDate currentDate = LocalDate.now();
        // Получаем номер недели, начиная с 1 января
        int customWeekNumber = currentDate.getDayOfYear() / 7 + 1;

        return Integer.toString(customWeekNumber);
    }

    static public String getCurrentYear(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");
        LocalDateTime now = LocalDateTime.now();
        String date = dtf.format(now);
        return date;
    }

    public static void main(String[] args) {

        System.out.println(Dates.getCurrentWeek());
        System.out.println(Dates.getCurrentYear());

    }

}
