package ch1;

import java.util.Scanner;

public class ScannerEx1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("숫자 입력");
    int num = sc.nextInt();
    System.out.printf("입력된 숫자 %d", num);
  }
}
