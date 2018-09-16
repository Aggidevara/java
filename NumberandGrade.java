
    import java.util.Arrays;
    public class NumberandGrade {
        public String numberandgrade(int[] input) {

            int[] numofstu = input;
            int avg=0,sum=0;
            int[] grades = new int[numofstu.length];
            for(int i=0;i<numofstu.length;i++){
            if (numofstu[i]>= 0 && numofstu[i]<=100) {

                    sum=sum+numofstu[i];
                }
                else
                return "Number should be in between 0-100";
            }
            avg=sum/numofstu.length;
            Arrays.sort(numofstu);

            return "Avg of stude - "+ avg +" Min grade of students - "+ grades[0] +"max grade of students - "+grades[numofstu.length-2];

        }

    }

