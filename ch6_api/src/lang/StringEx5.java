package lang;

public class StringEx5 {

  public static void main(String[] args) {
    System.out.println(count("12345AB12AB345AB", "AB"));
    System.out.println(count("12345", "AB"));
  }

  public static int count(String src, String target) {
    // src 에 taget 문자가 몇 번 나오는지 세어서 반환
    int cnt = 0, pos = 0;

    // System.out.println("indexOf " + src.indexOf(target, 0)); // 5 + taget.length
    // System.out.println("indexOf " + src.indexOf(target, 7)); // 9 + taget.length
    // System.out.println("indexOf " + src.indexOf(target, 11)); // 14 + taget.length

    // while (true) {
    //   pos = src.indexOf(target, pos);
    //   if (pos != -1) {
    //     cnt++;
    //     pos = pos + target.length();
    //   } else {
    //     break;
    //   }
    // }

    while ((pos = src.indexOf(target, pos)) != -1) {
      cnt++;
      pos += target.length();
    }

    return cnt;
  }
}
