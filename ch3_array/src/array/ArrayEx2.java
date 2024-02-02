package array;

public class ArrayEx2 {

  public static void main(String[] args) {
    int score[] = new int[5]; // 길이가 5인 int 배열(인덱스 0부터 시작) + 초기값은 0

    // 배열의 초기값 변경
    score[0] = 98;
    score[1] = 88;
    score[2] = 78;
    score[3] = 68;
    score[4] = 58;

    // 배열 값 확인
    // System.out.println(score[0]);
    // System.out.println(score[1]);
    // System.out.println(score[2]);
    // System.out.println(score[3]);
    // System.out.println(score[4]);
    // System.out.println(score.length); // 배열의 길이를 확인할 수 있음.

    // 배열은 For문과 함께 사용
    for (int i = 0; i < score.length; i++) {
      System.out.println(score[i]);
    }

    System.out.println();

    // 더 간단한 방법 : foreach
    for (int i : score) {
      System.out.println(i);
    }
  }
}
