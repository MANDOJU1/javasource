package account;

// 은행 : Account
// 은행 + 체크카드 : CheakingAccount
// 은행 + 체크카드 + 교통카드 : CheakingTrafficCardAccount
// 은행 + 마이너스 통장
// 은행 + 보너스 포인트

public class BonusPointAccount extends Account {

  // 보너스포인트
  private int bonusPoint;

  // 생성자
  public BonusPointAccount(
    String accountNo,
    String owner,
    int balance,
    int bonusPoint
  ) {
    super(accountNo, owner, balance);
    this.bonusPoint = bonusPoint;
  }

  // 예금하다 오버라이딩
  @Override
  public void deposit(int amount) {
    super.deposit(amount);
    this.bonusPoint += (int) (amount * 0.001);
  }

  public int getBonusPoint() {
    return bonusPoint;
  }
}
