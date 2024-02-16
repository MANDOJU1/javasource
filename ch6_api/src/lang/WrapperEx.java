package lang;

// Wrapper 클래스
// 기본형 값들을 객체로 사용할 때가 있음
// java.lang.Byte ==> byte 의 객체
// java.lang.Short ==> Short
// java.lang.Character ==> Character
// java.lang.Integer ==> Integer
// java.lang.Long ==> Long
// java.lang.Float ==> Float
// java.lang.Double ==> Double
// java.lang.Boolean ==> Boolean

public class WrapperEx {

  public static void main(String[] args) {
    int i = 10; // 기본형으로 선언

    // 객체로 선언 ( 2가지 방법 )
    Integer i2 = 10;
    Integer i3 = Integer.valueOf(20);

    // intValue() : Integer => int ( 2가지 방법 )
    int result = i2.intValue();
    int result2 = i2; // 자동으로 Integer => int로 바뀜
  }
}
