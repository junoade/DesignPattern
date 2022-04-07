package lecture.week5.problem05;

import java.util.GregorianCalendar;

import static lecture.week5.problem05.BasicFormat.*;

public class BasicFormatTest {
    public static void main(String[] args) {
        System.out.println("Date: " + formatDate(2005, 7, 4));
        System.out.println("Integer: " + formatLong(1234567));
        System.out.println("Integer: " + formatLong(Math.round(67.7f)));
        System.out.println("Money: " + formatMoney(9812345.678));
        System.out.println("Money: " + formatMoney(9812345));
        System.out.println("Money: " + formatMoney(.78));
        System.out.println("Person: " + formatPerson("Weinman", "Jerod", "weinman"));
    }
}
