package exam2;

public class OddEx {

  public static void main(String[] args) {
    Odd odd = new Odd(10);
    // OddDetector odd = new Odd(10) 해도 가능
    System.out.println(odd.isOdd());
  }
}
