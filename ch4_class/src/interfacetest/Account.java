package interfacetest;

// interface
// 모든 멤버 변수는 public static final 이어야 함
// 모든 멤버 메소드는 public abstract 임 (abstract 생략 가능)
// 추상화가 높은 상태 (기본 설계도)
// body 를 가진 메소드는 static, default 만 가능 (1.8 버전 추가)
// 여러 개 구현 가능
// public class Bonus implements Account, CheakingAccount
// public class Bonus extends CreditLine implements Account, CheakingAccount

public interface Account {
  // 멤버변수
  // accountNo; only public, static & final
  // private String accountNo; // 멤버변수 선언 불가

  public static final int SPADE = 4; // 상수만 가능

  // Abstract methods do not specify a body
  // public void deposit(){}

  // body로 들어올 수 있는 경우
  public void deposit();

  static void getCardKind() {}

  default void getCard() {}
}
