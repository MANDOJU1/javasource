package ch4;

//  singleton 패턴
// 단 하나의 객체만을 생성할 수 있도록 하는 패턴

public class Singleton {

  private static Singleton singleton = new Singleton();

  private Singleton() {
  }

  public static Singleton getInstance() {
    if (singleton == null) {
      singleton = new Singleton();
    }
    return singleton;
  }
}
