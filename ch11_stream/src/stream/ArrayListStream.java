package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStream {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<>();
        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Jack");

        Stream<String> stream = sList.stream();
        stream.forEach(s -> System.out.println(s));

        Stream<String> stream2 = sList.stream();
        stream2.sorted().forEach(s -> System.out.println(s));
    }

}
