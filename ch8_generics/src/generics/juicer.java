package generics;

public class juicer {

  static Juice makeJuice(FruitBox<Fruit> box) {
    String temp = "";
    for (Fruit f : box.getList()) {
      temp += f + " ";
    }
    return new Juice(temp);
  }
}
