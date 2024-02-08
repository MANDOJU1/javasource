package account;

public class CheakingAccountEx {

  public static void main(String[] args) {
    // CheakingAccount cAccount = new CheakingAccount(
    //   "220-11",
    //   "홍길동",
    //   100000,
    //   "111-11"
    // );

    // try {
    //   cAccount.pay("111-11", 50000);
    //   System.out.println("현재 잔액 " + cAccount.getBalance());
    // } catch (Exception e) {
    //   e.printStackTrace();
    // }

    // CheakingTrafficCardAccount ctTrafficCardAccount = new CheakingTrafficCardAccount(
    //   "220-11",
    //   "홍길동",
    //   100000,
    //   "111-11",
    //   true
    // );

    // try {
    //   ctTrafficCardAccount.payTrafficCard("111-11", 1800);
    //   System.out.println("현재 잔액 " + ctTrafficCardAccount.getBalance());
    // } catch (Exception e) {
    //   e.printStackTrace();
    // }

    // CheakingTrafficCardAccount ctTrafficCardAccount2 = new CheakingTrafficCardAccount(
    //   "220-11",
    //   "홍길동",
    //   90000,
    //   "111-12",
    //   true
    // );

    // try {
    //   ctTrafficCardAccount2.payTrafficCard("111-11", 1800);
    //   System.out.println("현재 잔액 " + ctTrafficCardAccount2.getBalance());
    // } catch (Exception e) {
    //   e.printStackTrace();
    // }

    CreditLineAccount creditLineAccount = new CreditLineAccount(
      "111-15",
      "김호진",
      10000,
      5000000
    );

    try {
      creditLineAccount.withdraw(2500000);
      System.out.println(
        creditLineAccount.getOwner() +
        " 현재 잔액 " +
        creditLineAccount.getBalance()
      );
    } catch (Exception e) {
      e.printStackTrace();
    }

    BonusPointAccount bonusPointAccount = new BonusPointAccount(
      "110-11",
      "이순신",
      0,
      0
    );
    System.out.printf(
      "%s 님의 보너스 포인트는 %d\n",
      bonusPointAccount.getOwner(),
      bonusPointAccount.getBonusPoint()
    );
  }
}
