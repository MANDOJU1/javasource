package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Collections 클래스
// 컬렉션(List, set, Map)과 관련된 메소드 제공
// static 요소로 구성
// 동기화, fill(), copy(), sort(), binarySearch() 유용한 메소드 제공

// Collection 인터페이스 <> Collections 클래스

public class CollectionsEx {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    // rotate() : 오른쪽으로 distance만큼 이동
    Collections.rotate(list, 2); // 오른쪽으로 두 칸씩 이동 [4, 5, 1, 2, 3]
    System.out.println(list);

    // swap() : 자리 바꿈
    Collections.swap(list, 0, 2); // 0번과 2번 자리 바꿈 [1, 5, 4, 2, 3]
    System.out.println(list);

    // sort() : 정렬
    // list.sort(Comparator.reverseOrder());
    Collections.sort(list, Comparator.naturalOrder()); // 내림차순
    System.out.println(list); // [5, 4, 3, 2, 1]

    // binarySearch()
    System.out.println(
      "3이 저장된 위치 : " + Collections.binarySearch(list, 6)
    ); // 3이 저장된 위치 : 2
    System.out.println("최대값 : " + Collections.max(list));
    System.out.println("최소값 : " + Collections.min(list));

    // fill() : 리스트를 하나의 값으로 채울 때
    Collections.fill(list, 9);
    System.out.println(list); // [9, 9, 9, 9, 9]
  }
}
