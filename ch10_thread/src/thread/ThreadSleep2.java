package thread;

public class ThreadSleep2 extends Thread {

  @Override
  public void run() {
    for (int i = 0; i < 30; i++) {
      System.out.printf("%s", new String("|"));
    }
  }
}
