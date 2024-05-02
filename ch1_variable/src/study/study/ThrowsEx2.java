package study;

import java.io.FileNotFoundException;

public class ThrowsEx2 {
    public static void main(String[] args) {
        ThrowsException test = new ThrowsException();

        // try/multi-catch 사용 => 한번에 예외사항 처리하기
        
        try {
            test.loadClass("a.txt", "java.lang.String");
        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // try-catch 사용 => 각각 예외사항처리하기

        try {
            test.loadClass("q.txt", "java.lang.String");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {  
            e.printStackTrace();
        }
    }
}