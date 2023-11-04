package org.example.datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1975, Month.JULY, 10);

        Period p = Period.between(birthday, today);
        long p2 = ChronoUnit.DAYS.between(birthday, today);
//        System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
//                " months, and " + p.getDays() +
//                " days old. (" + p2 + " days total)");

        LocalDateTime todayTime = LocalDateTime.now();
        System.out.println("Вам виповнилося " + p.getYears() + " років, " + p.getMonths() +
                " місяці, " + p.getDays() + " днів, " + todayTime.getHour() + " години " +
                todayTime.getMinute() + " хвилин " + todayTime.getSecond() + " секунд.");
    }
}
