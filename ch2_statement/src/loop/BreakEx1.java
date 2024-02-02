package loop;

// continue 이후의 구문 건너뛰게 함
public class BreakEx1 {

  public static void main(String[] args) {
    // break; => switch

    int sum = 0, i = 0;
    while (true) {
      if (sum > 100) break;
      ++i;
      sum += i;
    }
    System.out.printf("i=%d, sum=%d\n", i, sum);
  }
}
