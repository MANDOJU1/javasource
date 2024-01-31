package exam;

import java.util.Scanner;

public class Degrees {

  public static void main(String[] args) {
    // 화씨온도 => 섭씨온도
    // (32°F − 32) * 5/9 = 0°C
    Scanner sc = new Scanner(System.in);

    System.out.println("화씨 온도 입력");
    int fahr = sc.nextInt();

    double cel = (fahr - 32) * (5 / 9.0);
    System.out.println("섭씨온도 : " + cel);
  }
}
