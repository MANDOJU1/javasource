package exam;

public class Account {

  // 은행계좌번호(110-11-12345),계좌주 이름(홍길동), 잔액(100000)
  private String accountNum;
  private String name;
  private int money;

  //예금하다
  // deposit
  // 잔액 = 잔액 + 예금액
  int deposit(int amount) {
    money += amount;
    return money;
  }

  // 출금하다
  // withraw
  int withraw(int amount) {
    money -= amount;
    return money;
  }

  // 생성자
  public Account() {}

  public Account(String accountNum, String name, int money) {
    this.accountNum = accountNum;
    this.name = name;
    this.money = money;
  }
}
