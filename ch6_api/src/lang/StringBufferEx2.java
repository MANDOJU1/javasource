package lang;

public class StringBufferEx2 {

  public static void main(String[] args) {
    StringBuffer sb1 = new StringBuffer("Hello");
    // String sb2 = "Hello";  ( X )

    //append() : 원본 문자열 뒤에 추가
    System.out.println("append() " + sb1.append("World")); // append() HelloWorld
    // String str1 = "Hello"; str1 += "123";, str += 456;
    sb1.append("123").append(456).append(12.3f);
    System.out.println(sb1); // HelloWorld12345612.3

    //charAt()
    System.out.println(sb1.charAt(3)); // l

    // delete() : 끝 위치의 문자 제외
    sb1.delete(3, 6); // 3, 4, 5 만 지움 6은 지우지 않음
    System.out.println(sb1); // Helorld12345612.3

    sb1.deleteCharAt(5);
    System.out.println(sb1); // Helord12345612.3

    // insert() : 내용을 삽입함
    sb1.insert(4, " 012345 ");
    System.out.println(sb1); // Helo 012345 rd12345612.3

    // length()

    // replace()
    sb1.replace(0, 3, "AB");
    System.out.println(sb1); // ABo 012345 rd12345612.3

    String str2 = "0123456789";
    // 9876543210 출력하기
    // System.out.println(str2.charAt(9));
    // System.out.println(str2.charAt(8));
    // System.out.println(str2.charAt(7));

    for (int i = (str2.length() - 1); i >= 0; i--) {
      System.out.print(str2.charAt(i));
    }

    System.out.println();

    StringBuffer sb3 = new StringBuffer("0123456789");
    System.out.println(sb3.reverse());

    // String => StringBuffer
    StringBuffer sb4 = new StringBuffer(str2);
    System.out.println(sb4.reverse());

    sb1.setCharAt(1, 'K');
    System.out.println(sb1); // AKo 012345 rd12345612.3

    StringBuilder sBuilder1 = new StringBuilder("Hello");
  }
}
