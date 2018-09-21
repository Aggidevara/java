package Collections.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {

        Student stu1 = new Student("s1", "aabbcc", 6);
        Student stu2 = new Student("s2", "abc", 6);
        Student stu3 = new Student("s3", "aa", 6);
        Student stu4 = new Student("s4", "abcd", 6);
        Student stu5 = new Student("s5", "abc", 6);

            List<Student> studentType = new ArrayList<Student>();
            studentType.add(stu1);
            studentType.add(stu2);
            studentType.add(stu3);
            studentType.add(stu4);
            studentType.add(stu5);
            Collections.sort(studentType, new StudentSorter());
            System.out.println(studentType.toString());

    }
}