package io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output3.txt")) {
            byte[] bs = new byte[26];
            byte data = 65;
            for (int i = 0; i < bs.length; i++) {
                bs[i] = data;
                data++;
            }
            fos.write(bs, 2, 10); // 배열의 3번째 위치부터 10개 바이트 출력
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("출력 완료"); // CDEFGHIJKL

    }
}
