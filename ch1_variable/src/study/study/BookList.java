package study;

import java.util.ArrayList;

public class BookList {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<Book>();

        library.add(new Book("태백산맥", "조정래"));
        library.add(new Book("데미안", "헤르만 헤세"));
        library.add(new Book("어떻게 살 것인가", "유시민"));

        // for 문 사용
        for (int i = 0; i < library.size(); i++) {
            Book book = library.get(i);
            book.showBookInfo();
        }

        // 향상된 for 문 사용
        for (Book book : library) {
            book.showBookInfo();
        }

    }

}
