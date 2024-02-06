package ch4;

// 멤버 변수는 private으로 설정 (없어도 되지만 거의 대부분 사용함)

public class Person {

  private String name;

  @Override
  public String toString() {
    return "Person [name=" + name + "]";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
