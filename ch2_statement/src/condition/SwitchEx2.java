package condition;

import java.util.Scanner;

// if ~ else if 처리 대체
public class SwitchEx2 {

  public static void main(String[] args) {
    // 월 을 입력받아 계절 출력
    // 345 봄 => 현재 계절은 봄입니다. / 678 여름 / 91011 가을 / 1212 겨울

    Scanner sc = new Scanner(System.in);

    System.out.println("월을 입력하세요");
    int month = sc.nextInt();

    // month == 3 || month == 4 || month == 5
    // break : switch블럭 빠져나가기

    switch (month) {
      case 3:
      case 4:
      case 5:
        System.out.println("현재 계절은 봄입니다.");
        break;
      case 6:
      case 7:
      case 8:
        System.out.println("현재 계절은 여름입니다.");
        break;
      case 9:
      case 10:
      case 11:
        System.out.println("현재 계절은 가을입니다.");
        break;
      case 12:
      case 1:
      case 2:
        System.out.println("현재 계절은 겨울입니다.");
        break;
      default:
        System.out.println("월을 확인해 주세요.");
        break;
    }

    // if else 구문으로 만들어보기
    if (month == 3 || month == 4 || month == 5) {
      System.out.println("현재 계절은 봄입니다.");
    } else if (month == 6 || month == 7 || month == 8) {
      System.out.println("현재 계절은 여름입니다.");
    } else if (month == 9 || month == 10 || month == 11) {
      System.out.println("현재 계절은 가을입니다.");
    } else if (month == 12 || month == 1 || month == 2) {
      System.out.println("현재 계절은 겨울입니다.");
    } else {
      System.out.println("월을 확인해 주세요.");
    }

    // if else 구문으로 만들어보기
    String season = " ";
    if (month == 3 || month == 4 || month == 5) {
      season = "봄";
    } else if (month == 6 || month == 7 || month == 8) {
      season = "여름";
    } else if (month == 9 || month == 10 || month == 11) {
      season = "가을";
    } else if (month == 12 || month == 1 || month == 2) {
      season = "겨울";
    } else {
      System.out.println("월을 확인해 주세요.");
    }

    System.out.println("현재 계절은 " + season + " 입니다.");
  }
}
