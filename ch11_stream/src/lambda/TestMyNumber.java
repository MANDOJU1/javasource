package lambda;

public class TestMyNumber {
    public static void main(String[] args) {
        // 람다식을 인터페이스형 max 변수에 대입
        MyNumber max = (x, y) -> (x >= y) ? x : y;
        // 인터페이스형 변수로 메서드 호출
        System.out.println(max.max(10, 20));

        PrintString lamStr = s -> System.out.println(s);
        lamStr.showString("hello");
        showMyString(lamStr);

        PrintString reSTr = returnString();
        reSTr.showString("hello3");
    }

    public static void showMyString(PrintString p) {
        p.showString("hello2");
    }

    public static PrintString returnString() {
        return s -> System.out.println(s + " world");
    }
}
