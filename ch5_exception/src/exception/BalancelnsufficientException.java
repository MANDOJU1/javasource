package exception;

// 사용자 정의 예외
public class BalancelnsufficientException extends Exception {

  public BalancelnsufficientException() {
    super();
  }

  public BalancelnsufficientException(String message) {
    super(message);
  }
}
