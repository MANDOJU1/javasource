package study;

public class StudentEx {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("1001", "James");
        students[1] = new Student("1002", "Tomas");
        students[2] = new Student("1003", "Edward");

        for (Student student : students) {
            student.showStudentinfo();
        }
    }

}
