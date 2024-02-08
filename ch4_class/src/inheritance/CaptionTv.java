package inheritance;

public class CaptionTv extends Tv {

  // CaptionTv() {super();}

  boolean caption;

  public CaptionTv(boolean power, int channel, boolean caption) {
    super(power, channel);
    this.caption = caption;
  }

  public CaptionTv(boolean caption) {
    this.caption = caption;
  }

  void displayCaption(String text) {
    // if(caption!=true) == i(!caption)
    // if(caption == true)
    if (caption) {
      System.out.println(text);
    }
  }
}
