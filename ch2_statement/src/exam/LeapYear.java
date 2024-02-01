package exam;

import java.util.Scanner;

public class LeapYear {

  public static void main(String[] args) {
    // 년도를 입력 받은 후 윤년, 평년인지 출력
    // 윤년 : 해당 년도를 4로 나눈 나머지가 0과 같고, 100으로 나눈 나머지가 0이 아니거나
    //        400으로 나는 나머지가 0 이면 윤년

    System.out.println("년도를 입력 >>> ");

    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();

    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
      System.out.println("윤년");
    } else {
      System.out.println("평년");
    }
  }
}
