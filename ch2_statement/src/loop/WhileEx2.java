package loop;

public class WhileEx2 {

  public static void main(String[] args) {
    // 구구단 출력
    // 3 * 1 = 3
    // 3 * 2 = 6
    for (int i = 1; i < 10; i++) {
      System.out.printf("%d * %d = %2d\n", 3, i, (3 * i));
    }

    System.out.println();

    int i = 1;
    while (i < 10) {
      System.out.printf("%d * %d = %2d\n", 3, i, (3 * i));
      i++;
    }
    // While 문 안에 While 문 가능
    // while (condition) {
    //   while (condition) {

    //   }
    // }
  }
}
