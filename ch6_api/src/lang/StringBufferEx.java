package lang;

// java.lang.StringBuffer : mutable (변경 가능한) 클래스, thread-safe
// java.lang.StringBuilder : mutable (변경 가능한) 클래스
public class StringBufferEx {

  public static void main(String[] args) {
    StringBuffer sb1 = new StringBuffer("Hello");
    StringBuffer sb2 = new StringBuffer("Hello");

    // equals() : 주소비교, toString()

    // String 으로 변환해서 equals() 사용하기
    // 방법 1) 생성자, 2)메소드

    // 1) 생성자로 만드는 방법
    // String str1 = new String(sb1);
    // String str2 = new String(sb2);

    // 2) 메소드로 만드는 방법
    // String str1 = sb1.toString();
    // String str2 = sb2.toString();

    System.out.println(sb1.equals(sb2) ? "같음" : "다름"); // 다름 (equals : 오버라이딩 안됨)
    System.out.println(sb1 == sb2 ? "같음" : "다름"); // 다름
    System.out.println(sb1); // Hello (toString : 오버라이딩 됨) / java.lang.StringBffer@
  }
}
