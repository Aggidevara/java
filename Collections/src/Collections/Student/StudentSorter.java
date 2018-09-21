package Collections.Student;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
         if(o1.getAge()==o2.getAge()){
             if(o1.getName().equals(o2.getName())){
                return o1.getId().compareTo(o2.getId());
             }
             return o1.getName().compareTo(o2.getName());
         }
         return o1.getAge()-o2.getAge();
        }

}
