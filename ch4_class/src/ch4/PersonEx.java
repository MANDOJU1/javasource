package ch4;

public class PersonEx {

  public static void main(String[] args) {
    // Person person = new Person();
    // person.setName("홍길동");
    // System.out.println(person.getName());
    // System.out.println(person); // ch4.Person@5ca881b5

    // Person person2 = new Person();
    // person2.setName("성춘향");
    // System.out.println(person2.getName());

    Person person = new Person("홍길동", "Korea");
    // nation 은 바꿀 수 없음 (수정 불가)
    person.setName("김길동");

    Person person2 = new Person("장길동", "Korea");
    person2.setName("김길동");

    // Person.PI = 142623
    System.out.println(Person.getPi());

    System.out.println(person == person2); //false
  }
}
