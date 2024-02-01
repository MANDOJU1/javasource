package condition;

/* 제어문 - 1) 조건문 2) 반복문
 * 1) 조건문 : 조건에 따라 다음 문장 수행 여부 결정
 *    if, switch
 */

public class IfEx2 {

  public static void main(String[] args) {
    // 점수가 90이상이면 A, F
    int score = 95;

    if (score > 90) {
      System.out.println("A");
    } else {
      System.out.println("F");
    }
  }
}
