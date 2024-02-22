package thread;

// Thread(스레드)
// 프로세스 : 실행 중인 프로그램(OS 로부터 실행에 필요한 자원(메모리) 할당받아 실행)
// 프로세스 : 프로그램을 수행하는 데 필요한 데이터 + 자원 + 스레드(실제로 작업을 수행)
// 모든 프로세스는 최소한 하나 이상의 스레드가 존재 => 둘 이상의 스레드를 가진 프로세스를 멀티스레드 프로세스

// 멀티 스레드 구현
// Ex) 카카오톡 (채팅과 같이 문자를 보내면서 파일전송까지해야 함)
// 1) Runnable 구현하는 클래스 작성
//    - 1) run() 오버라이딩
//    - 2) 객체 생성

// 2) Thread 상속받는 클래스 작성

public class BigLetters2 {

  public static void main(String[] args) {
    Thread t = new SmallLetters2();
    t.start();

    for (char ch = 'A'; ch < 'Z'; ch++) {
      System.out.print(ch + " ");
    }
  }
}
