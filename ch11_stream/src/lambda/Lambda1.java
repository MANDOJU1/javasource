package lambda;

// 람다식 (Lambda Expression) : 자바스크립트, 파이썬도 사용
// 메소드(함수)를 하나의 식으로 표현한 것

// 반환타입 메소드명(매개변수 선언){}

// (매개변수 선언)->{}

public class Lambda1 {

  // 메소드 선언 방식(기본)
  int max(int num1, int num2) {
    return num1 > num2 ? num1 : num2;
  }

  // 람다식
  // (int num1, int num2) -> { return num1 > num2 ? num1 : num2; }
  // (int num1, int num2) -> num1 > num2 ? num1 : num2;
  // (num1, num2) -> num1 > num2 ? num1 : num2;

  void print(String name, int i) {
    System.out.println(name + "=" + i);
  }

  // 람다식 (실행할 구문 한개면 {} 생략 가능)
  // (String name, int i) -> System.out.println(name + "=" + i);
  // (name, i) -> System.out.println(name + "=" + i);

  int square(int x) {
    return x * x;
  }

  // 람다식
  // (x) -> x * x

  int roll() {
    return (int) (Math.random() * 6);
  }

  // 람다식
  // () ->  (int) (Math.random() * 6);

  int sumArr(int[] arr) {
    int sum = 0;
    for (int i : arr) {
      sum += i;
    }
    return sum;
  }
  // 람다식 여러줄일때
  // (int[] arr) -> {
  //     int sum = 0;
  //     for (int i : arr) {
  //       sum += i;
  //     }
  //     return sum;
  // }

}
