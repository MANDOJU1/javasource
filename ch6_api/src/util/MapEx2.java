package util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MapEx2 {

  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();

    map.put("myId", "1234");
    map.put("asdf", "1111");
    map.put("asdf", "1234");

    Set<String> keys = map.keySet();
    System.out.println(keys); // [myId, asdf]

    // key가 중복이면 나중에 저장된 값이 출력됨
    Collection<String> values = map.values();
    System.out.println(values); // [1234, 1234]

    Scanner sc = new Scanner(System.in);

    // 아이디와 비밀번호를 입력 받아서 Map 에 들어 있는지 확인
    while (true) {
      System.out.println("아이디와 비밀번호를 입력하세요 >> ");
      System.out.print("아이디 : ");
      String id = sc.nextLine().trim();
      System.out.print("비밀번호 : ");
      String password = sc.nextLine().trim();

      // 키 값 중 아이디와 일치하는지 확인
      if (!map.containsKey(id)) {
        System.out.println(
          "입력하신 id 는 존재하지 않습니다. 다시 입력해 주세요"
        );
        continue;
      } else {
        // value 값 중 비밀번호가 일치하는지 확인
        if (!map.get(id).equals(password)) {
          // 일치하지 않는다면 "입력하신 비밀번호는 존재하지 않습니다. 다시 입력해 주세요"
          System.out.println(
            "입력하신 비밀번호는 존재하지 않습니다. 다시 입력해 주세요"
          );
        } else {
          // 일치한다면 while문 종료
          System.out.println("아이디와 비밀번호는 일치합니다.");
          break;
        }
      }
    }
  }
}
