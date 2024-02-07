package ch4;

public class TvEx2 {

  public static void main(String[] args) {
    // Tv 인스턴스 3개 생성
    // Tv tv1 = new Tv("black", false, 3);
    // Tv tv2 = new Tv("white", false, 5);
    // Tv tv3 = new Tv("gray", false, 4);
    Tv tvarr[] = new Tv[3]; // int arr[] = new int[3];
    tvarr[0] = new Tv("black", false, 3); // arr [0] = 10
    tvarr[1] = new Tv("white", false, 5);
    tvarr[2] = new Tv("gray", false, 4);

    // int arr[] = {10, 12, 13};
    Tv tvarr2[] = {
      new Tv("black", false, 3),
      new Tv("white", false, 5),
      new Tv("gray", false, 4),
    };

    // 첫번째 tv 전원 켜기
    // tv1.setPower(true);
    // tv1.setChannel(15);
    tvarr[0].setPower(true);
    tvarr[0].setChannel(15);

    // 세번째 tv
    // tv3.setPower(true);
    // tv3.setChannel(20);
    tvarr[2].setPower(true);
    tvarr[2].setChannel(20);
  }
}
