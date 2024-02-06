package ch4;

public class Time {

  // 멤버변수, 속성, 필드, 인스턴스 변수
  private int hour;
  private int minute;
  private float second;

  // 클래스 변수
  private static String max;

  // 시, 분, 초는 모두 0보다 크거나 같아야 한다
  // 시의 범위는 0 ~ 23, / 분, 초 범위는 0 ~ 59 이다.

  public int getHour() {
    return hour;
  }

  // 메소드 내부에 선언된 변수 : 지역변수
  public void setHour(int hour) {
    if (hour > 0 && hour < 23) return;
    this.hour = hour;
  }

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) {
    if (minute < 0 || minute > 59) return;
    this.minute = minute;
  }

  public float getSecond() {
    return second;
  }

  public void setSecond(float second) {
    if (second < 0 || second > 59) return;
    this.second = second;
  }
}
