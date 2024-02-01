package condition;

import java.util.Scanner;

/* 제어문 - 1) 조건문 2) 반복문
 * 1) 조건문 : 조건에 따라 다음 문장 수행 여부 결정
 *    if, switch
 */

public class IfEx3 {

  public static void main(String[] args) {
    // 점수가 90이상이면 A, F
    // 점수 입력 받은 후 짝수인지 홀수인지 출력

    Scanner sc = new Scanner(System.in);

    System.out.println("숫자 입력");
    int score = sc.nextInt();

    if (score % 2 == 0) {
      System.out.println("짝수");
    } else System.out.println("홀수");
  }
}
