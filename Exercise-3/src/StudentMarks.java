
 public class StudentMarks {
    int numOfStudents;
    int[] stuGrades;

    StudentMarks(int numOfStudents, int[] grades) {
        this.numOfStudents = numOfStudents;
        stuGrades = grades;
    }
    public String checkGradeValue(){
        boolean value = false;
        for (int i = 0; i < numOfStudents; i++) {
            if (stuGrades[i] >= 0 && stuGrades[i] <= 100) {
                value = true;
            }
            else value=false;
            if (!value) {
                try {
                    throw new MyException("Error:value in index - 1 should be in between 0 to 100");
                }
                catch (MyException e) {
                    String str= String.valueOf(e);
                    return str;
                }
            }
        }
        return null;
    }
}

 class MyException extends Exception {
     public MyException(String msg) {
         super(msg);
//        System.out.println("Myexception********");
     }
 }


