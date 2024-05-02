package io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("output.txt", true);
        try (fos) {
            byte[] bs = new byte[26];
            byte data = 65; // 'A'의 아스키 값
            for (int i = 0; i < bs.length; i++) {
                bs[i] = data;
                data++;
            }
            fos.write(bs); // 배열 한꺼번에 출력
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("출력 완료");

    }
}
