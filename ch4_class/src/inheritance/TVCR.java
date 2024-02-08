package inheritance;

// 관계 : 1. 상속 2. 포함
// TV+VCR
public class TVCR extends Tv {

  VCR vcr = new VCR(); // 포함관계를 사용/ Tv와 VCR 두개의 클래스 가져오고 싶을 때 한개는 extends
  int counter = vcr.counter;

  void play() {
    vcr.play();
  }

  void stop() {
    vcr.stop();
  }
}
