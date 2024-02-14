package interfacetest;

public interface Calc {
  // public static final 이 붙어 있음 (기본)
  double PI = 3.14;
  int ERROR = -9999999;

  // public abstract 이 붙어 있음 (기본)
  int add(int num1, int num2);
  int substract(int num1, int num2);
  int times(int num1, int num2);
  int divide(int num1, int num2);
}
