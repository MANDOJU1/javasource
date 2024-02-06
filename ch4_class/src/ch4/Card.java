package ch4;

public class Card {

  private String kind; // 무늬(스페이드, 하트, 클로버, 다이아몬드)
  private int number; // 숫자

  // 클래스 변수 : 공유
  static int width = 100;
  static int height = 150;

  public Card(String kind, int number) {
    this.kind = kind;
    this.number = number;
  }
}
