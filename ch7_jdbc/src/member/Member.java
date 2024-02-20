package member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// ~ DTO : 생성자, getter, setter, toString
// @Data : tostring, Getter, Setter, defalt 생성자, equals

// @Data
@Getter
@Setter
@ToString
@NoArgsConstructor // defalut 생성자
@AllArgsConstructor // 멤버 변수 모두 포함 생성자
public class Member {

  private String id;
  private String name;
  private String password;
}
