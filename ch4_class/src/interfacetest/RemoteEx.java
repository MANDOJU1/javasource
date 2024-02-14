package interfacetest;

public class RemoteEx {

  public static void main(String[] args) {
    Television tv = new Television();
    tv.trunOn();
    tv.setVolume(9);
    tv.trunOff();

    Audio audio = new Audio();
    audio.trunOn();
    audio.setVolume(15);
    audio.trunOff();

    exec(new Television());
    exec(new Audio());
  }

  public static void exec(RemoteControl rc) {
    rc.trunOn();
    rc.setVolume(15);
    rc.trunOff();
  }
}
