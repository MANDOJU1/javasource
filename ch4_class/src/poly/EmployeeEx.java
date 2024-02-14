package poly;

public class EmployeeEx {

  public static void main(String[] args) {
    Employee employee = new Employee("홍길동", "사원");
    // employee.work(); // 홍길동 이(가) 일한다.
    work(employee);

    // employee = new Ceo("김유신", "회장");
    // employee.work(); // 회장 : 김유신
    Ceo ceo = new Ceo("김유신", "회장");
    // ceo.work();
    work(ceo); // employee = ceo;

    // employee = new Admin("김동호", "관리자");
    // employee.work(); // 관리자 : 김동호 열심히 일을 합니다.
    Admin admin = new Admin("김동호", "관리자");
    // admin.work();
    work(admin); // employee = admin;

    // employee = new PartTime("정우성", "아르바이트");
    // employee.work(); // 정우성 아르바이트 주어진 시간동안 일을 합니다.
    PartTime partTime = new PartTime("정우성", "아르바이트");
    // partTime.work();
    work(partTime); // employee = partTime;
  }

  public static void work(Employee employee) {
    // work 전용 메소드
    employee.work();
  }
  //   public static void work(Admin employee) {
  //     // work 전용 메소드
  //     employee.work();
  //   }
}
