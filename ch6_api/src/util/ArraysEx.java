package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Arrays : 배열을 다루는데 유용한 메소드가 정의되어 있음
// static 요소로 구성

public class ArraysEx {

  public static void main(String[] args) {
    int[] arr = { 3, 2, 1, 0, 4, 5 };
    System.out.println(arr); // [I@7a81197d
    System.out.println(Arrays.toString(arr)); // [3, 2, 1, 0, 4, 5]

    int[] arr2 = new int[6];
    Arrays.fill(arr2, 9);
    System.out.println(Arrays.toString(arr2)); // [9, 9, 9, 9, 9, 9]

    System.out.println("배열 요소 비교 " + Arrays.equals(arr, arr2)); // 배열 요소 비교 false

    // Arrays.asList(배열) : 배열을 List 구조로 변경
    List<Integer> list = Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 });
    List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);

    // UnsupportedOperationException : 반환된 List 크기를 변경할 수 없음 (asList 구조로 변경된 배열은 불가능 하다는 뜻)
    // list.add(6); // 오류가 뜸

    // 기존 배열 + 새로 추가
    List<Integer> list3 = new ArrayList<>(
      Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 })
    );
    list3.add(6);

    // sort : 오름차순 정렬
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr)); // [0, 1, 2, 3, 4, 5]

    // linear search : 순차검색(첫 번째 요소부터 하나씩 검색 / 정렬상관없음)
    // binarySearch() : 이진검색 (정렬(오름차순)된 상태여야 함)
    System.out.println("2의 위치 " + Arrays.binarySearch(arr, 2)); // 2의 위치 2

    // 내림차순
    // T[] : 배열이 객체 타입이라는 의미
    // Map<K,V> : K, V ==> 객체 타입
    // Collection<E> ==> 객체 타입
    // int => Integer
    Integer arr3[] = { 27, 55, 15, 6, 9, 75 };
    Arrays.sort(arr3, Comparator.reverseOrder());

    String[] strArr = { "cat", "Dog", "lion", "tiger", "apple", "zoo" };
    Arrays.sort(strArr);
    System.out.println(Arrays.toString(strArr)); // [apple, cat, dog, lion, tiger, zoo] // [Dog, apple, cat, lion, tiger, zoo]
    Arrays.sort(strArr, Comparator.reverseOrder()); // 내림차순
    System.out.println(Arrays.toString(strArr)); // [zoo, tiger, lion, cat, apple, Dog]
  }
}
