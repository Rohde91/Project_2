package main;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


public class something {
    public static void main(String[] args) {
        int hour = 11;
        int minute = 59;
        int second = 23;

        String day = "sunday ";
        String date = "5 th ";
        String month = "sep ";
        String year = "2021\n";
        // \n kan kun laves i String i ""

        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.println(".");

        System.out.println("American format:");
        System.out.print(date);
        System.out.print(day);
        System.out.print(month);
        System.out.println(year + "\n");

        System.out.println("European format:");
        System.out.println(day+date+month+year);
        System.out.println("Made whit a different print style!");

        System.out.print("Seconds since midnight: ");
        System.out.println(hour * 60 * 60 + minute * 60 + second);

        System.out.print("Seconds left of the day: ");
        System.out.println(24 * 60 * 60 - hour * 60 * 60 - minute * 60 - second);
        System.out.print("Percent left of the day:");
        System.out.println((hour * 60 * 60 - minute * 60 - second - 24 * 3600) / 100 + "%");
        //something wrong

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

    }
}
