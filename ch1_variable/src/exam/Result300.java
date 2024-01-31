package exam;

public class Result300 {

  public static void main(String[] args) {
    int value = 356;
    // 출력 결과가 300이 나올 수 있도록 산술 연산 기호 사용

    int result = value - 56;
    System.out.println(result);
    System.out.printf("value = %d", (value / 300 * 300));

    int num = 24;
    // 변수 num 의 값보다 크면서도 가장 가까운 10 배수에서 변수 num 의 값을 뺀
    // 나머지를 구하시오. 예를 들어 24의 가장 크면서도 가장 가까운 10배수는 30이고
    // 19의 경우 20이고, 81의 경우 90이다.
    // 30 - 24 = 6 , 90 - 81 =9

    System.out.println(10 - (num % 10));

    int num2 = 333;
    // num2 의 값 중에서 일의 자리를 1로 바꾸는 프로그램 작성
    // 예를 들어 num의 값이 333 이라면 331 이 되고, 777이라면 771 이 된다.
    int result3 = (num2 / 10) * 10 + 1;
    System.out.println(result3);
    System.out.println(num2 / 10 * 10 + 1);
  }
}
