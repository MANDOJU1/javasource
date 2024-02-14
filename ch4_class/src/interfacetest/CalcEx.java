package interfacetest;

public class CalcEx {

  public static void main(String[] args) {
    // 참조 변수가 사용할 수 있는 범위 제한
    CompleteCalc calc = new CompleteCalc();
    System.out.println(" calc add " + calc.add(10, 2));
    System.out.println(" calc divide " + calc.divide(15, 5));
    System.out.println(" calc substract " + calc.substract(25, 10));
    System.out.println(" calc times " + calc.times(3, 5));
    calc.showInfo();

    Calculator calc2 = new CompleteCalc();
    System.out.println(" calc2 add " + calc2.add(10, 2));
    System.out.println(" calc2 divide " + calc2.divide(15, 5));
    System.out.println(" calc2 substract " + calc2.substract(25, 10));
    System.out.println(" calc2 times " + calc2.times(3, 5));
    // calc2.showInfo();

    Calc calc3 = new CompleteCalc();
    System.out.println(" calc3 add " + calc3.add(10, 2));
    System.out.println(" calc3 divide " + calc3.divide(15, 5));
    System.out.println(" calc3 substract " + calc3.substract(25, 10));
    System.out.println(" calc3 times " + calc3.times(3, 5));
    // calc3.showInfo();
  }
}
