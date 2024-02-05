package array;

import java.util.Scanner;

public class ArrayEx17 {

  public static void main(String[] args) {
    String[][] words = {
      { "chair", "의자" },
      { "computer", "컴퓨터" },
      { "integer", "정수" },
    };

    // 문자열 비교 == (X) / equals() ==> "name".equals("nam")
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < words.length; i++) {
      System.out.printf("Q%d ) %s 의 의미는? \n", (i + 1), words[i][0]);

      String answer = sc.nextLine();

      if (words[i][1].equals(answer)) {
        System.out.println("정답입니다");
      } else {
        System.out.printf("틀렸습니다. 정답은 %s 입니다\n", words[i][1]);
      }
    }
  }
}
