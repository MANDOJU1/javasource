package interfacetest;

public class DataEx {

  public static void main(String[] args) {
    // DataAccessObject obj = new Oracle();
    // dbWork(obj);
    // obj = new MySql();
    // dbWork(obj);

    dbWork(new Oracle());
    dbWork(new MySql());

    // 익명(anonymous) 클래스 : 일회용 클래스 (선언과 생성 동시에)
    DataAccessObject object = new DataAccessObject() {
      @Override
      public void select() {
        System.out.println("postgreSQL 검색");
      }

      @Override
      public void insert() {
        System.out.println("postgreSQL 삽입");
      }

      @Override
      public void update() {
        System.out.println("postgreSQL 수정");
      }

      @Override
      public void delete() {
        System.out.println("postgreSQL 삭제");
      }
    };

    dbWork(object);
  }

  public static void dbWork(DataAccessObject dao) {
    dao.select(); // Oracle DB에서 검색 or Mysql DB에서 검색
    dao.insert(); // Oracle DB에서 삽입 or Mysql DB에서 삽입
    dao.update(); // Oracle DB에서 수정 or Mysql DB에서 수정
    dao.delete(); // Oracle DB에서 삭제 or Mysql DB에서 삭제
  }
}
