package exam;

import java.util.Scanner;

public class Bank {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean run = true;
    while (run) {
      System.out.println("---------------------------------");
      System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
      System.out.println("---------------------------------");
      System.out.println("메뉴 선택 >>");

      int menu = sc.nextInt();
      int balance = 0;
      switch (menu) {
        case 1:
          // 예금액 입력 받은 후 잔액 추가
          System.out.print("예금액을 입력해주세요.");
          balance += sc.nextInt();
          break;
        case 2:
          // 출금액 입력 받은 후 잔액 감소
          System.out.print("출금액을 입력해주세요");
          balance -= sc.nextInt();
          break;
        case 3:
          // 잔액 출력
          System.out.println("잔액 >> " + balance);
          break;
        case 4:
          System.out.println("프로그램 종료");
          run = false;
          break;
        //     case 1:
        //       // 예금액 입력 받은 후 잔액 추가
        //       System.out.print("예금액을 입력해주세요.");
        //       int money = sc.nextInt();
        //       account = account + money;
        //       System.out.println("현재 금액 : " + account);
        //       break;
        //     case 2:
        //       // 출금액 입력 받은 후 잔액 감소
        //       System.out.println("출금액을 입력해주세요");
        //       int money1 = sc.nextInt();
        //       account = account - money1;
        //       System.out.println("현재 금액 : " + account);
        //       break;
        //     case 3:
        //       // 잔액 출력
        //       System.out.println(account);
        //       break;
        //     case 4:
        //       System.out.println("프로그램 종료");
        //       run = false;
        //       break;

      }
    }
  }
}
