package util;

import java.util.StringTokenizer;

public class StringTokenEx2 {

  public static void main(String[] args) {
    String str = "This is a test";

    // 기준을 주지 않을 경우 : 스페이스바 한번을 기준으로 잘라 줌
    StringTokenizer st = new StringTokenizer(str);
    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }

    str = "x=100*(200+300)/2";
    StringTokenizer st2 = new StringTokenizer(str, "=*/+()", true);
    while (st2.hasMoreTokens()) {
      System.out.println(st2.nextToken());
    }

    str = "1,김천재,100,100,100|2,박수재,95,80,90|3,이자바,80,90,90";
    StringTokenizer str3 = new StringTokenizer(str, ",|");
    while (str3.hasMoreTokens()) {
      System.out.println(str3.nextToken());

      System.out.println();

      str3 = new StringTokenizer(str, "|");
      while (str3.hasMoreTokens()) {
        String token = str3.nextToken(); // // 1,김천재,100,100,100 ...

        StringTokenizer st4 = new StringTokenizer(token, ",");
        while (st4.hasMoreTokens()) {
          System.out.println(st4.nextToken());
        }
      }
      System.out.println("----------------------");
    }
  }
}
