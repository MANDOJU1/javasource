package lambda;

// 함수형 인터페이스
// 람다식을 포함할 수 있음 (추상 메서드는 하나만 사용 할 수 있음)
// 람다식 == 익명 클래스 객체

@FunctionalInterface
public interface MyFunction1 {
  void method(); // public abstract 생략되어있음
}
