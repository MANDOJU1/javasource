package account;

// 은행 + 체크카드
public class CheakingAccount extends Account {

  public String cardNo;

  public CheakingAccount(
    String accountNo,
    String owner,
    int balance,
    String cardNo
  ) {
    super(accountNo, owner, balance);
    this.cardNo = cardNo;
  }

  // pay(String cardNo, int amount)
  // cardNO가 일치하는지 확인, 사용금액이 잔액보다 적은지 확인
  // 일치하지 않으면 지불 불가
  // 일치하고, 금액이 작으면 잔액 - 사용금액

  void pay(String cardNo, int amount) throws Exception {
    if (!this.cardNo.equals(cardNo) || getBalance() < amount) {
      throw new Exception("지불 불가");
      // System.out.println("지불 불가");
    }
    // 잔액 = 잔액 - 사용액
    // setBalance(getBalance() - amount);
    withdraw(amount);
  }
}
