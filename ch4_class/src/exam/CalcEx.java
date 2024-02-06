package exam;

public class CalcEx {

  public static void main(String[] args) {
    // 객체 생성
    Calc calc = new Calc();

    // 덧셈
    int result = calc.add(15, 59);
    System.out.println("덧셈 결과 " + result);

    // 곱셈
    System.out.println("곱셈 결과 " + calc.multiply(3, 5));

    // 나눗셈
    int result2 = calc.divide(8, 4);
    System.out.println("나눗셈 결과 " + result2);
  }
}
