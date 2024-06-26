package study;

public class Student {
    private String studentId;
    private String name;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public void showStudentinfo() {
        System.out.println(studentId + name);
    }
}
