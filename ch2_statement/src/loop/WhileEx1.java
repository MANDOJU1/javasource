package loop;

public class WhileEx1 {

  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.println("I can do it.");
    }

    int i = 0;
    while (i < 5) {
      System.out.println("I can do it.");
      i++;
    }

    // FOR문 WHILE 문으로 바꾸기
    // int sum = 0;
    // for (int i = 1; i <= 10; i++) {
    //   sum += i; // sum = sum + i;
    // }

    i = 0;
    int sum = 0;
    while (i <= 10) {
      sum += i;
      i++;
    }
    System.out.println("1 ~ 10까지 합 " + sum);
  }
}
