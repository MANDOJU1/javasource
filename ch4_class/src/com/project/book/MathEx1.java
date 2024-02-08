package com.project.book;

// java.lang 패키지는 기본 import 상태임

// Math 클래스는 모든 요소가 static 임
import static java.lang.Math.*;

public class MathEx1 {

  public static void main(String[] args) {
    // Math
    System.out.println(Math.PI);
    System.out.println(Math.E);
    System.out.println(Math.random());
    System.out.println(Math.ceil(3.4));

    System.out.println(PI);
    System.out.println(E);
    System.out.println(random());
    System.out.println(ceil(3.4));
  }
}
