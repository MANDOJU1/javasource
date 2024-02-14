package interfacetest;

// interface 클래스를 상속받는 추상클래스 만들기 가능 (abstract)
public abstract class Calculator implements Calc {

  // times, divide 추상메소드
  @Override
  public int add(int num1, int num2) {
    return num1 + num2;
  }

  @Override
  public int substract(int num1, int num2) {
    return num1 - num2;
  }
}
