import java.util.ArrayList;
import java.util.List;

public class Problem13 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student("학생1","10","남자");
        Student s2 = new Student("학생2","20","여자");
        Student s3 = new Student("학생3","30","남자");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        ResponseDto r = new ResponseDto(s1);
        System.out.println(r.age);


    }
}
class Student{
 public String name;
 public String age;
 public String gender;

    public Student(String name, String age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

}

class ResponseDto{
    public String name;
    public String age;

    public ResponseDto(Student student) {
        this.name = student.name;
        this.age = student.age;
    }

}