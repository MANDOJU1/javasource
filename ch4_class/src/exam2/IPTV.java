package exam2;

public class IPTV extends ColorTv {

  private String ip;

  public IPTV(int size, int color, String ip) {
    super(size, color);
    this.ip = ip;
  }

  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  @Override
  void printProperty() {
    System.out.println(
      "나의 IPTV는 " +
      ip +
      " 주소의 " +
      getSize() +
      "인치 " +
      getColor() +
      "컬러"
    );
  }
}
