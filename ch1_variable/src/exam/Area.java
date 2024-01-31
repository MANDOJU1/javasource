package exam;

public class Area {

  public static void main(String[] args) {
    // 사다리꼴의 넓이를 구한 후 출력
    // 윗변 + 아랫변 * 높이 / 2
    // 소수점 2자리까지 출력

    int hiwiddh = 5;
    int lowwidth = 8;
    int height = 9;

    double result = (double) (hiwiddh + lowwidth) * height / 2; //58.50
    System.out.printf("사다리꼴 넓이 : %.2f", result); //58.50
  }
}
