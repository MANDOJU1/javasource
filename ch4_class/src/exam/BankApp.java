package exam;

import java.util.Scanner;

public class BankApp {

  static Scanner sc = new Scanner(System.in);
  static Account accArr[] = new Account[100];

  public static void main(String[] args) {
    boolean run = true;

    while (run) {
      System.out.println("-------------------------------------------------");
      System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
      System.out.println("-------------------------------------------------");
      System.out.print("메뉴 선택 >> ");

      int menu = Integer.parseInt(sc.nextLine());

      switch (menu) {
        case 1:
          createAccount();
          break;
        case 2:
          accountList();
          break;
        case 3:
          deposit();
          break;
        case 4:
          withraw();
          break;
        case 5:
          run = false;
          break;
        default:
          break;
      }
    }
  }

  static void createAccount() {
    System.out.print(" 계좌번호 >>> ");
    String accountNum = sc.nextLine();
    System.out.print(" 계좌주 >>> ");
    String name = sc.nextLine();
    System.out.print(" 잔액 >>> ");
    int money = Integer.parseInt(sc.nextLine());

    for (int i = 0; i < accArr.length; i++) {
      if (accArr[i] == null) {
        accArr[i] = new Account(accountNum, name, money);
        System.out.println("계좌가 생성되었습니다.");
        break;
      }
    }
  }

  static void accountList() {
    // 생성된 계좌목록 보여주기
    for (int i = 0; i < accArr.length; i++) {
      if (accArr[i] != null) {
        System.out.println(accArr[i]);
      }
    }
  }

  // foreach [다른방법]
  //  for (Account account : accArr) {
  //    if(account !=null) {
  //      System.out.println(account);
  //   }
  //  }
  // }

  // 예금하다
  // 계좌번호
  // 예금액
  static void deposit() {
    System.out.print("계좌번호 >>> ");
    String accountNum = sc.nextLine();
    System.out.print("예금액 >> ");
    int money = Integer.parseInt(sc.nextLine());

    // 배열에서 입력받은 계좌번호와 일치한 배열 요소 찾기
    Account account = findAccount(accountNum);
    // 찾은 요소의 잔액 + 예금액
    if (account != null) {
      System.out.println("현재 잔액 " + account.deposit(money));
    }
  }

  // 출금하다
  // 계좌번호
  // 출금액
  static void withraw() {
    System.out.print("계좌번호 >>> ");
    String accountNum = sc.nextLine();
    System.out.print("출금액 >> ");
    int money = Integer.parseInt(sc.nextLine());
    // 배열에서 입력받은 계좌번호와 일치한 배열 요소 찾기
    Account account = findAccount(accountNum);
    // 찾은 요소의 잔액 - 출금액
    if (account != null) {
      System.out.println("현재 잔액 : " + account.withraw(money));
    }
  }

  // This method must return a result of type Account (if구문에 맞지 않은 건 어디로가야해 ?라는 뜻)
  static Account findAccount(String accountNum) {
    for (Account account : accArr) {
      if (account != null) {
        if (account.getAccountNum().equals(accountNum)) {
          return account;
        }
      }
    }
    return null;
  }
}
