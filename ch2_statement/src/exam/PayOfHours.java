package exam;

import java.util.Scanner;

public class PayOfHours {

  public static void main(String[] args) {
    // 근무 시간 입력 받은 후
    // 시간 당 9800
    // 8시간이 넘어가는 시간은 원래 받는 금액의 1.5%
    // ex ) 오늘 받는 임금은 15000
    System.out.println("근무시간 입력하세요");

    Scanner sc = new Scanner(System.in);
    int hour = sc.nextInt();

    int fee = hour * 9800;
    if (hour <= 8) {
      System.out.println("오늘 받는 임금은 " + fee + "입니다.");
    } else if (hour > 8) {
      System.out.println("오늘 받는 임금은 " + fee * 1.5 + "입니다.");
    }

    switch (hour) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
        System.out.println("오늘 받는 임금은 " + hour * 9800 + "입니다.");
        break;
      default:
        System.out.println("오늘 받는 임금은 " + hour * 9800 * 1.5 + "입니다.");
        break;
    }

    int pay = 0, rate = 9800;
    if (hour > 8) {
      pay = (int) ((hour - 8) * rate * 1.5) + (rate * 8);
    } else {
      pay = hour * rate;
    }
    System.out.println("오늘 받는 임금은 " + pay);
  }
}
