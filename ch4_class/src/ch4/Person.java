package ch4;

// 멤버 변수는 private으로 설정 (없어도 되지만 거의 대부분 사용함)

public final class Person {

  // 멤버변수에 final 이 붙은 경우
  // 초기화(선언 or 생성자)를 반드시 해야함.
  // 수정불가
  // 상수 개념

  // 클래스에 final 이 붙은 경우 - 상속 금지
  // 메소드에 final 이 붙은 경우 - 오버라이딩 금지

  private String name;
  private final String nation;

  // 객체끼리 공유하는 상수
  // 상수는 대문자로 표현
  private static final double PI = 3.141592;

  // private final static double PI = 3.141592;

  public static double getPi() {
    return PI;
  }

  public Person(String name, String nation) {
    this.name = name;
    this.nation = nation;
  }

  @Override
  public final String toString() {
    return "Person [name=" + name + "]";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
