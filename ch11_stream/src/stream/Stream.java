package stream;

import java.util.Arrays;

public class Stream {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        Arrays.stream(arr).forEach(n -> System.out.println(n));
    }

}
