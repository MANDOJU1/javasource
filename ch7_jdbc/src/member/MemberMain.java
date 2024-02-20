package member;

import java.util.List;
import java.util.Scanner;

public class MemberMain {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean run = true;

    MemberDAO memberDao = new MemberDAO();

    while (run) {
      System.out.println("============================");
      System.out.println("1. 전체 회원 조회");
      System.out.println("2. 개별 회원 조회");
      System.out.println("3. 회원 추가");
      System.out.println("4. 회원 수정");
      System.out.println("5. 회원 삭제");
      System.out.println("6. 종료");
      System.out.println("============================");

      System.out.print("메뉴 입력 >> ");
      int menu = Integer.parseInt(sc.nextLine());
      switch (menu) {
        case 1:
          System.out.println("\n**** 전체 회원 조회 ****");
          System.out.println("아이디\t비밀번호\t이름\t이메일");
          System.out.println("===========================================");
          List<MemberDTO> list = memberDao.getRows();
          for (MemberDTO memberDTO : list) {
            System.out.println(memberDTO.getUserId() + "\t");
            System.out.println(memberDTO.getPassword() + "\t");
            System.out.println(memberDTO.getName() + "\t");
            System.out.println(memberDTO.getEmail());
          }
          break;
        case 2:
          // 아이디, 비밀번호 입력받은 후 DAO 메소드 호출 결과 출력
          System.out.println("\n**** 회원 조회 ****");
          System.out.print("ID 입력 >> ");
          String userId = sc.nextLine();
          System.out.print("PASSWORD 입력 >> ");
          String password = sc.nextLine();

          MemberDTO readDto = new MemberDTO();
          readDto.setUserId(userId);
          readDto.setPassword(password);

          // MemberDTO row = memberDao.getRow(readDto); // 방법 2의 방식
          MemberDTO row = memberDao.getRow(userId, password); // 방법 1의 방식

          System.out.println("\n\n==== 조회 회원 정보 ====");
          System.out.println("아이디 : " + row.getUserId());
          System.out.println("비밀번호 : " + row.getPassword());
          System.out.println("이름 : " + row.getName());
          System.out.println("이메일 : " + row.getEmail());
          System.out.println();
          break;
        case 3:
          System.out.println("\n**** 회원 추가 ****");
          System.out.print("ID >> ");
          String newId = sc.nextLine();
          System.out.print("PASSWORD >> ");
          String newPassword = sc.nextLine();
          System.out.print("NAME >> ");
          String newName = sc.nextLine();
          System.out.print("EMAIL >> ");
          String newEmail = sc.nextLine();

          MemberDTO insertDto = new MemberDTO(
            newId,
            newPassword,
            newName,
            newEmail
          );
          System.out.println(
            memberDao.insert(insertDto) > 0 ? "입력성공" : "입력실패"
          );
          break;
        case 4:
          System.out.println("\n**** 회원 정보 수정 ****");
          System.out.print("ID >> ");
          String updateId = sc.nextLine();
          System.out.println("기존 PASSWORD ");
          String updatePassword = sc.nextLine();

          // 아이디와 기존비밀번호로 조회시 회원이 존재하면 수정
          MemberDTO rowMem = memberDao.getRow(updateId, updatePassword);
          if (rowMem == null) {
            System.out.println("입력한 아이디와 비밀번호를 확인해 주세요");
          } else {
            System.out.print("변경 PASSWORD >> ");
            String changePassword = sc.nextLine();

            int result = memberDao.update(updateId, changePassword);
            System.out.println(result > 0 ? "수정 성공" : "수정 실패");
          }
          break;
        case 5:
          // 아이디와 비밀번호 입력받고 일치 시 삭제
          System.out.println("\n**** 회원 정보 삭제 ****");
          System.out.print("ID >> ");
          String id = sc.nextLine();
          System.out.println("기존 PASSWORD ");
          String delPassword = sc.nextLine();

          MemberDTO rowDel = memberDao.getRow(id, delPassword);
          if (rowDel == null) {
            System.out.println("입력한 아이디와 비밀번호를 확인해 주세요");
          } else {
            int result = memberDao.delete(id);
            System.out.println(
              result > 0 ? "회원 탈퇴 성공" : "회원 탈퇴 실패"
            );
          }
          break;
        case 6:
          run = false;
          break;
        default:
          break;
      }
    }
  }
}
