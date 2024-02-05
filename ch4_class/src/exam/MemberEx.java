package exam;

public class MemberEx {

  public static void main(String[] args) {
    // 회원 객체 생성 ==> 생성자 호출
    // 이름, 아이디, 비밀번호 필수
    Member member1 = new Member("abc", "abc", "홍길동");

    // 이름, 아이디, 비밀번호, 나이, 직업
    Member member2 = new Member("member", "member", "성춘향", 27, "회사원");
    // 생성자 default 꼭 필요한게 아닌 이유
    // Member member3 = new Member(); // 아이디, 비밀번호, 이름 없이 가입하려는 사람들이 있기 때문

    // grade, point => 마트 규칙에 따라 변경

  }
}
