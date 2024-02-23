package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class LambdaEx5 {

  public static void main(String[] args) {
    List<Student> list = new ArrayList<>();
    list.add(new Student("홍길동", 100, 98));
    list.add(new Student("김길동", 80, 78));
  }

  static void printString(Function<Student, String> function) {}

  static void printInt(ToIntFunction<Student> function) {}
}
