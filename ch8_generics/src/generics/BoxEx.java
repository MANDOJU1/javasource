package generics;

// T, E : 객체

public class BoxEx {

  public static void main(String[] args) {
    Box box = new Box();

    box.setItem(new String("홍길동"));
    String name = (String) box.getItem();

    box.setItem(Integer.valueOf(10));
    Integer i = (Integer) box.getItem();

    box.setItem(Float.valueOf(3.14f));
    Float f = (Float) box.getItem();

    Box2<String> box2 = new Box2<>();
    box2.setItem("홍길동");
    box2.setItem("김유신");
    String str = box2.getItem();

    Box2<Integer> box3 = new Box2<>();
    Box2<Float> box4 = new Box2<>();
    Box2<Double> box5 = new Box2<>();

    Box3<Fruit> furitBox = new Box3<>();
    Box3<Apple> appleBox = new Box3<>();
    Box3<Grape> grapeBox = new Box3<>();
    Box3<Toy> toyBox = new Box3<>();

    // 부모 타입으로 설정 시 자식 객체 담는 것 허용
    furitBox.add(new Fruit());
    furitBox.add(new Apple());
    furitBox.add(new Grape());
    // furitBox.add(new Toy());

    appleBox.add(new Apple());
    // appleBox.add(new Fruit()); // 부모 담지 못함
    // appleBox.add(new Grape()); // 부모와 같은 상속을 받는 다른 객체도 받지 못함

    grapeBox.add(new Grape()); // Fruit, Apple 담지 못함

    toyBox.add(new Toy());

    FruitBox<Fruit> fruitBox2 = new FruitBox<>();
    fruitBox2.add(new Fruit());
    fruitBox2.add(new Apple());
    fruitBox2.add(new Grape());
    // fruitBox2.add(new toy());

    System.out.println(juicer.makeJuice(fruitBox2));
  }
}
