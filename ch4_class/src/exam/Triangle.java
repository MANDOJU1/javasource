package exam;

public class Triangle {

  // 밑변(baseline), 높이(height)
  private int baseline;
  private int height;

  // 메소드 getArea()
  // 밑변 * 높이 / 2

  double getArea() {
    return baseline * (double) height / 2;
  }

  // 생성자
  public Triangle() {}

  public Triangle(int baseline, int height) {
    this.baseline = baseline;
    this.height = height;
  }
}
