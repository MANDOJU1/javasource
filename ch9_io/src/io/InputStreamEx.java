package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

// java.io.* : io(input, output)
// 기본 input : keyborad
// 기본 output : 화면

// 스트림 : 입출력을 수행할 때 어느 한 족에서 다른 쪽으로 데이터 전달시 두 대상을 연결하는 통로 같은 개념
//          단반향만 가능(입력, 출력 => 2개의 스트림 필요)
// 1. 바이트 기반 스트림 (문자, 이미지, 동영상, ...)
//     InputStream(추상 클래스) : 입력 스트림 부모
//     OutputStream(추상 클래스) : 출력 스트림 부모

// 2. 문자 기반 스트림 (문자)
//      Reader(추상)
//      Writer(추상)

public class InputStreamEx {

  public static void main(String[] args) {
    InputStream in = System.in;
    // in.read(); : 한 바이트씩 읽어오기 int 로 리턴 ( 한글은 3byte이기 때문에 깨져서 나옴 )
    // in.read(byte[] b); : byte 배열로 읽어와서 읽어온 byte 를 int 로 리턴
    // in.read(byte[] b, 0, 100); : 입력 스트림에서 100byte 읽어와서 0번 위치부터 저장

    OutputStream out = System.out;
    // out.write(int);
    // out.write(byte[] b);
    // out.write(byte[] b, 0, 0);

    try {
      // 한 바이트만 입력 시
      //   int intput = in.read();
      //   out.write(intput); // a => a (형변환 필요없이 a로 출력됨)
      //   int input = in.read();
      //   System.out.println((char) input); // abcd => a

      // 여러 바이트 입력 시
      //   int input = 0;
      //   while ((input = in.read()) != -1) {
      //     //   System.out.println((char) input);} // abcd => a,b,c,d
      //     out.write(input);
      //   }

      byte b[] = new byte[100];
      in.read(b);
      //   System.out.println(Arrays.toString(b)); // abcd => [97, 98, 99, 100, 13, 10, 0, 0, 0, ... , 0]
      out.write(b);

      in.close();
      out.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
