package util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * Iterator 인터페이스
 * 컬렉션에 저장된 요소를 접근하는 데 사용되는 인터페이스
 */

public class IteratorEx {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    // list 요소 접근
    // 방법 1)
    for (int i = 0; i < list.size(); i++) {
      String item = list.get(i);
    }
    // 방법 2)
    for (String string : list) {
      // item
    }

    Set<String> set = new HashSet<>();

    // set 요소 접근
    // 방법 1)
    for (int i = 0; i < set.size(); i++) {
      // 순서에 개념이 없는 set 에서는 get() 불가
      // String item = set.get(i);
    }
    // 방법 2)
    for (String string : set) {
      // item
    }

    // Map : get(key)

    // 데이터를 담는 구조에 따라 접근하는 방법이 다르다
    // 컬렉션 요소를 읽어오는 방법 표준화 => Iterator

    // list
    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    // set
    iterator = set.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
