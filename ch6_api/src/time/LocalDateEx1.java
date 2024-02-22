package time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// 날짜 시간 객체
// 처음부터 제공되던 클래스 => 단점 존재
// 1.8 => java.time 패키지 추가

public class LocalDateEx1 {

  public static void main(String[] args) {
    Date date = new Date();
    System.out.println(date); // Thu Feb 22 14:37:22 KST 2024

    SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
    System.out.println(sdf.format(date)); // 24-02-22

    Calendar calender = Calendar.getInstance();
    System.out.println("년도" + calender.get(Calendar.YEAR)); // 2024
    System.out.println("월(0~11), 0 :1월 " + calender.get(Calendar.MONTH)); // 1
    System.out.println(
      "이 달의 몇 째 주" + calender.get(Calendar.WEEK_OF_MONTH)
    ); // 4
    System.out.println("이 달의 몇 일 " + calender.get(Calendar.DATE)); // 22
    System.out.println("이 달의 몇 일 " + calender.get(Calendar.DAY_OF_MONTH)); // 22
    System.out.println("이 해의 몇 일 " + calender.get(Calendar.DAY_OF_YEAR)); // 53
    System.out.println("시간(0~11) " + calender.get(Calendar.HOUR)); // 2
    System.out.println("시간(0~23) " + calender.get(Calendar.HOUR_OF_DAY)); // 14
    System.out.println("분(0~59) " + calender.get(Calendar.MINUTE)); // 45
    System.out.println("초(0~59) " + calender.get(Calendar.SECOND)); // 20
  }
}
