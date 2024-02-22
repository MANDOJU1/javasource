package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

// java.time.LocalDate : 날짜
// java.time.LocalTime : 시간
// java.time.LocalDateTime : 날짜시간

public class LocalDateEx2 {

  public static void main(String[] args) {
    // 오늘 날짜
    LocalDate today = LocalDate.now();
    // 현재 시간
    LocalTime now = LocalTime.now();

    System.out.println(today); // 2024-02-22
    System.out.println("윤년/평년 " + today.isLeapYear());
    System.out.println(now); // 15:00:44.956323

    // 특정 날짜 지정
    LocalDate birth = LocalDate.of(1999, 1, 15);
    // 특정 시간 지정
    LocalTime birthtime = LocalTime.of(23, 11, 58);

    // 날짜 덧셈
    System.out.println(birth.plusDays(1)); // 1999-01-16
    // birth.plusMonths(0);
    // birth.plusWeeks(0);
    // birth.plusYears(0);

    // 날짜 뺄셈
    System.out.println(birth.minusDays(1));
    // birth.minusMonths(0);
    // birth.minusWeeks(0);
    // birth.minusYears(0);

    // 현재 날짜 시간
    LocalDateTime date = LocalDateTime.now();
    System.out.println(date); // 2024-02-22T15:10:05.695902700(ISO-8601)
    System.out.println(date.getHour()); // 15
    System.out.println(date.getMinute()); // 13
    System.out.println(date.getSecond()); // 10
    System.out.println(date.getYear()); // 2024
    System.out.println(date.getMonth()); // FEBRUARY
    System.out.println(date.getMonth().getValue()); // 2
    System.out.println(date.getDayOfMonth()); // 22
  }
}
