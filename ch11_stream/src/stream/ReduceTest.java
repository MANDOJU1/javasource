package stream;

import java.util.Arrays;

public class ReduceTest {
    public static void main(String[] args) {
        String[] greeting = { "안녕하세요~~~", "hello", "Good morning", "반갑습니다^^" };
        System.out.println(Arrays.stream(greeting).reduce("", (s1, s2) -> {
            if (s1.getBytes().length >= s2.getBytes().length)
                return s1;
            else
                return s2;
        }));

        // 왜 get() 으로 받는지 apply가 아니라
        String str = Arrays.stream(greeting).reduce(new CompareString()).get();
        System.out.println(str);
    }

}
