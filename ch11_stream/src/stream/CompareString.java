package stream;

import java.util.function.BinaryOperator;

public class CompareString implements BinaryOperator<String> {

    // BinaryOperator 인터페이스를 상속 받으면 apply() 메서드를 반드시 구현해야 함
    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length >= s2.getBytes().length)
            return s1;
        else
            return s2;

    }

}
