package operator;

// 연산자
// 대입 연산자 : =
// 단항 연산자 : 부호 => 양수, 음수, 증감연산자 => ++, --
// 산술 연산자 : +, -, *, /, %(나머지)
// 관계(비교) 연산자 : >, <, >=, <\, !=, ==
// 논리 연산자 : &&(AND) , ||(OR), !(NOT)
// 조건 연산자 : 조건식? 식1:식2;
// 복합 대입 연산자

public class SignoOpEx1 {

  public static void main(String[] args) {
    int x = -100;

    int result = +x;
    int result2 = -x;
    System.out.printf("result1 = %d, result = %d", result, result2);
  }
}
