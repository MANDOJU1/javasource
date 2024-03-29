package operator;

// 단항 연산자 : 부호 => 양수, 음수, 증감연산자 => ++, --
//               ++ => 변수 + 1, -- => 변수 - 1
public class IncDecEx1 {

  public static void main(String[] args) {
    int x = 10, y = 20;
    System.out.println("x = " + (x++)); // x = x; 먼저실행 -> x = x+1; 결과 : x = 10
    System.out.println("y = " + (y++)); // y = 20

    System.out.printf("x = %d, y = %d\n", x, y); // x = 11, y = 21

    System.out.println("x = " + (++x)); // x = x+1; 먼저실행 x = 12
    System.out.println("y = " + (++y)); // y = 22
    System.out.printf("x = %d, y = %d\n", x, y); // x = 12, y = 22
  }
}
