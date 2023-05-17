package tobyspring.playground;

import java.sql.Date;

public class SomeBadCode {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        // This is a bad code example.
        // It is not a good idea to use java.sql.Date.
        // It is better to use java.util.Date or java.time.LocalDate.
        Date date = new Date(2021, 8, 1);
        System.out.println(date);

        // This is a bad code example.
    }
}
