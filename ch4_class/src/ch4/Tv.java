package ch4;

// 멤버변수 초기값
// String : null
// int, ling : 0
// float, double : 0.0
// char : ' '
// boolean : false

// 클래스 : 설계도
// 객체 : 실제 존재(사용)

public class Tv {

  // 색상(검정,흰색), 전원상태(on,off), 채널(6,7,8,...), 볼륨(11,12,13...), 크기(인치)(50,46,...)...
  private String color;
  private boolean power;
  private int channel;

  void channelUp() {
    channel++;
  }

  void channelDown() {
    channel--;
  }

  // 생성자 오버로딩
  // Tv(){}

  public Tv() {}

  public Tv(String color, boolean power, int channel) {
    this.color = color;
    this.power = power;
    this.channel = channel;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isPower() {
    return power;
  }

  public void setPower(boolean power) {
    this.power = power;
  }

  public int getChannel() {
    return channel;
  }

  public void setChannel(int channel) {
    this.channel = channel;
  }
}
