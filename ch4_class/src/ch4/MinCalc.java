package ch4;

public class MinCalc {

  int plus(int x, int y) {
    return x + y;
  }

  double avg(int x, int y) {
    int sum = plus(x, y);
    return (double) sum / 2;
  }

  void execute() {
    System.out.println("실행결과 : " + avg(7, 10));
  }

  void println(String message) {
    System.out.println(message);
  }
}
