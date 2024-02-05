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
  String color;
  boolean power;
  int channel;

  void channelUp() {
    channel++;
  }

  void channelDown() {
    channel--;
    // 생성자 //생성자 호출 (자동)
    // Tv(){}

  }
}
