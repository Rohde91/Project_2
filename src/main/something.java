package main;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


public class something {
    public static void main(String[] args) {
        int hour = 11;
        int minute = 59;
        int second = 23;

        double secsincemidnight = hour * 60 * 60 + minute * 60 + second;
        double daysec = 24*3600;

        String day = "sunday ";
        String date = "5 th ";
        String month = "sep ";
        String year = "2021\n";
        // \n kan kun laves i String i ""

        System.out.print("The current time is ");
        System.out.println(hour + ":" + minute + ".");
        /*System.out.print(":");
        System.out.print(minute);
        System.out.println(".");
        */
        //Functions in the same way

        System.out.println("American format:");
        System.out.print(date);
        System.out.print(day);
        System.out.print(month);
        System.out.println(year + "\n");

        System.out.println("European format:");
        System.out.println(day+date+month+year);
        System.out.println("Made whit a different print style!");

        System.out.println("Seconds since midnight: " + secsincemidnight);

        System.out.println("Seconds left of the day: " + (daysec - secsincemidnight));
        System.out.println("Percent left of the day: " + secsincemidnight / daysec * 100 + "%");
        //something wrong

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));


    }
}
