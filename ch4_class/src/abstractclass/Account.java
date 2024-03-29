package abstractclass;

// 추상 클래스
// 미완성 설계도 => 자식 클래스에서 완성하는 개념
// 추상 메소드를 가지고 있음
// 인스턴스 생성 불가

// 클래스 : 완성 설계도

public abstract class Account {

  // 멤버 변수
  private String accountNo;

  // 생성자
  public Account() {}

  public Account(String accountNo) {
    this.accountNo = accountNo;
  }

  // 멤버 메소드
  public void deposit() {}

  // 추상 메소드 => { } 가 없음
  public abstract void print();
}
