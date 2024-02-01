package condition;

// Math.rancom() : 0.0 <= Math.rancom() < 1.0

public class IfEx6 {

  public static void main(String[] args) {
    System.out.println(Math.random()); // 0.8114167675381176
    System.out.println((int) (Math.random() * 6)); // 0 ~ 5
    System.out.println((int) (Math.random() * 6) + 1); // 0 ~ 5 => 1 ~ 6

    int dice = (int) (Math.random() * 6) + 1;

    // 주사위 1 번 나옴

    if (dice == 1) {
      System.out.println("주사위 1 번이 나옴");
    } else if (dice == 2) {
      System.out.println("주사위 2 번이 나옴");
    } else if (dice == 3) {
      System.out.println("주사위 3 번이 나옴");
    } else if (dice == 4) {
      System.out.println("주사위 4 번이 나옴");
    } else if (dice == 5) {
      System.out.println("주사위 5 번이 나옴");
    } else {
      System.out.println("주사위 6 번이 나옴");
    }
  }
}
