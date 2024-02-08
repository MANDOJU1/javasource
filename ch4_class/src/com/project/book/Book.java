// 패키지 문
package com.project.book;

// import 구문 => 다른 패키지에 있는 클래스 사용 시
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
// import java.util.Date;
// import java.util.Scanner;
import java.util.*;

// 클래스 선언
public class Book {

  public static void main(String[] args) {
    Date date = new Date();
    System.out.println(date.toString()); // Thu Feb 08 16:52:22 KST 2024
    System.out.println(date); // Thu Feb 08 16:52:22 KST 2024
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"); // 2024/02/08
    System.out.println(sdf.format(date));

    LocalDateTime dateTime = LocalDateTime.now();
    System.out.println(dateTime); //2024-02-08T16:52:22.256130600

    Scanner sc = new Scanner(System.in);
  }
}
