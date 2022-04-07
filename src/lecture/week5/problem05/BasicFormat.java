package lecture.week5.problem05;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author 2017112095 Junho Choi
 * @apiNote 문제 5번, SimpleDateFormat, DecimalFormat, MessageFormat 등 다양한 포매팅 클래스들을 활용하여, 우리가 원하는 형태의 포매팅 클래스를 퍼싸드 패턴을 통해 구현
 * 
 * Specifies basic formatting for dates, integers, money, and people
 */
public class BasicFormat {
    public static String formatDate(Date date) {
        // BODY
        // Date 매개변수에 대해 SimpleDateFormate의 API를 통해 우리가 원하는 형식으로 반환하는 기능
        return new SimpleDateFormat("d MMM yyyy").format(date);
    }

    /**
     * Formats a date
     *
     * @param year  Full integral value of the year, e.g. 1945, 2008
     * @param month Zero-based month index, e.g. 0 is January, 6 is July
     * @param day   One-based day of the month
     */
    public static String formatDate(int year, int month, int day) {
        // BODY
        // Date 매개변수에 대해 SimpleDateFormate의 API를 통해 우리가 원하는 패턴의 형식, "d MMM yyyy"으로 반환하는 기능
        return new SimpleDateFormat("d MMM yyyy").format(new GregorianCalendar(year, month, day).getTime());
    }

    public static String formatLong(long number) {
        // BODY
        // long 형 매개변수에 대해 DecimalFormat API를 통해 우리가 원하는 패턴의 형식, "#, ###"으로 반환하는 기능
        return new DecimalFormat("#,###").format(number);
    }

    public static String formatMoney(double amount) {
        // BODY
        // double 형 매개변수에 대해 DecimalFormat API를 통해 우리가 원하는 패턴의 형식, "$ #,##0.##"으로 반환하는 기능
        return new DecimalFormat("$ #,##0.##").format(amount);
    }

    public static String formatPerson(String firstName, String lastName, String userName) {
        // BODY
        // String형 매개변수들에 대해 MessageFormat API를 통해 우리가 원하는 패턴의 형식, ""{0}, {1} [{2}]"으로 반환하는 기능
        return new MessageFormat("{0}, {1} [{2}]").format(new Object[]{firstName, lastName, userName});
    }
}
