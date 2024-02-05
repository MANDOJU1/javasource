package exam;

import java.time.LocalDateTime;

public class Board {

  // 번호, 제목, 내용, 작성자, 작성날짜, 수정날짜
  private int num;
  private String title;
  private String content;
  private String writer;
  private LocalDateTime regDate;
  private LocalDateTime lastModifedDate;

  // 생성자 만들기 (default, 4개 멤버변수만)
  public Board() {}

  public Board(int num, String title, String content, String writer) {
    this.num = num;
    this.title = title;
    this.content = content;
    this.writer = writer;
  }
}
