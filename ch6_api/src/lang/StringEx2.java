package lang;

import java.util.Date;

public class StringEx2 {

  public static void main(String[] args) {
    // 생성자
    String str1 = new String("Hello");
    char[] chars = { 'H', 'e', 'l', 'l', 'o' };
    String str2 = new String(chars);

    String str3 = "Hello";

    // 메소드
    // return type => 변수 담기 or sout
    char ch = str1.charAt(0);

    // charAt() : 인덱스 위치 문자 반환
    System.out.println("charAt(0) : " + ch);
    System.out.println("charAt(3) : " + str2.charAt(3));

    // concat : 문자열 뒤에 연결
    String result = str1.concat("World");
    System.out.println("concat() " + result); // HelloWorld

    // compareTo() : 0, -1, 1 리턴해줌
    // 문자열과 사전 순서로 비교
    // 같으면 0, 사전순으로 이전이면 음수, 이후면 양수
    // a 97, b 98 (97-98 = -1)
    System.out.println("compareTo() " + str1.compareTo(str3)); // 0
    System.out.println("compareTo() " + "aaa".compareTo("bbb")); // -1
    System.out.println("compareTo() " + "bbb".compareTo("aaa")); // 1
    System.out.println("compareTo() " + "bbb".compareTo("baa")); // 1

    // contains() : 지정된 문자열이 포함되어 있는지 검사
    System.out.println("contains() " + str1.contains("e")); // true

    // endsWith() : 지정된 문자열로 끝나는지 검사
    System.out.println("endWith() " + str3.endsWith("t")); // false
    System.out.println("endWith() " + "Hello.txt".endsWith("txt")); // true

    // startsWith() : 지정된 문자열로 시작하는지 검사
    System.out.println("startWith() " + str3.startsWith("H")); // true

    // equals() / equalsIgnoreCase() : 대소문자 구별하지 말고 비교
    // Hello == HELLO (문자 대소문자 구별 함)
    System.out.println("equalsIgnoreCase() " + str1.equalsIgnoreCase("HELLO")); // true
    System.out.println("equals() " + str1.equals("HELLO")); // false

    // indexOf() : 주어진 문자가 문자열에 존재하는지 확인하여 위치 반환
    //             있으면 위치 인덱스, 없으면 -1
    System.out.println("indexOf() " + str1.indexOf("s")); // -1
    System.out.println("indexOf() " + str1.indexOf('s')); // -1
    System.out.println("indexOf() " + str1.indexOf('e')); // 1
    // 2번을 시작위치로 지정
    System.out.println("indexOf() " + str1.indexOf('3', 2));

    // lastIndexOf() : 지정된 문자를 문자열의 오른쪽 끝에서부터 찾아서 위치 반환
    String str4 = "java.lang.String";
    System.out.println("lastIndexOf() " + str4.lastIndexOf(".")); // 9
    System.out.println("IndexOf() " + str4.indexOf(".")); // 4

    // length() : 문자열 길이 반환

    // replace() : 문자를 새로운 문자로 바꾼 문자열 반환
    String replaceStr = str1.replace('H', 'h');
    System.out.println("replace() " + replaceStr); // hello
    str2 = str2.replace('H', 'h');
    System.out.println(str2); // hello
    str2 = str2.replace("ll", "LL");
    System.out.println(str2); // heLLo
    str4 = "Hellollo";
    System.out.println("replce() " + str4.replace("ll", "LL")); // HeLLoLLo
    System.out.println("replceAll() " + str4.replaceAll("ll", "LL")); // HeLLoLLo
    System.out.println("replceFirst() " + str4.replaceFirst("ll", "LL")); // HeLLollo

    // sprit() : 문자열 분리(기준에따라)한 후 배열로 리턴
    String[] strArr = str1.split("");
    for (String string : strArr) {
      System.out.println(string); // "H", "e", "l"...
    }
    str4 = "dog,car,bear";
    strArr = str4.split(",");
    for (String string : strArr) {
      System.out.println(string); // "dog", "car", "bear"
    }
    // 문자열 전체를 지정된 숫자로 자른다
    strArr = str4.split(",", 2);
    for (String string : strArr) {
      System.out.println(string); // "dog", "car,bear"
    }

    // substring() : 시작위치부터 끝 위치에 포함된 문자열 추출
    //               끝 위치는 포함하지 않음
    System.out.println("substring() " + str1.substring(1));
    System.out.println("substring() " + str1.substring(1, 4));

    // toLowerCase : 모든 문자를 소문자로 반환
    // toUpperCase : 모든 문자를 대문자로 반환
    System.out.println("toLowerCase() " + str1.toLowerCase());
    System.out.println("toUpperCase() " + str1.toUpperCase());

    //toString() :
    System.out.println(str1); // Hello
    System.out.println(str1.toString()); // Hello

    // 공백 하나는 문자 하나
    // trim() : 앞, 뒤 공백 제거
    // "Hello" == "Hello " (다름)
    str4 = "  Hello     World      ";
    System.out.println("trim() 전 " + str4); // trim() 전   Hello     World
    System.out.println("trim() 후 " + str4.trim()); // trim() 후 Hello     World

    // valueOf : 지정된 값을 문자열로 변환하여 반환
    int num = Integer.parseInt("100"); // String => int
    String num1 = String.valueOf(100); // int => String
    System.out.println(num1);
    num1 = String.valueOf(1.3); // double => String
    System.out.println(num1);
    num1 = String.valueOf(1.3f);
    System.out.println(num1);
    num1 = String.valueOf(1000L);
    System.out.println(num1);
    num1 = String.valueOf('c');
    System.out.println(num1);
    Date d = new Date();
    num1 = String.valueOf(d);
    System.out.println(num1);

    int i = 100;
    String type = String.valueOf(i); // "100"
    type = i + "";

    // String.valueOf(10) <=> Integer.parseInt("10") or Integer.valueOf("10")
    // String.valueOf(10.3) <=> Double.parseDouble("10.3") or Double.valueOf("10.3")
    // "10.3f" => 10.3f

    double d1 = Double.parseDouble("10.3");
    float f1 = Float.parseFloat("10.3f");
    long l1 = Long.parseLong("10L");
  }
}
