
    class Member{
        public String name;
        public int age;
        public Double salary;





    }
    class Member_Variable {

        Member var=new Member();
        Member_Variable(String name,int age,Double sal){
            var.name=name;
            var.age=age;
            var.salary=sal;
        }
        public void display(){
            System.out.println("Member name - "+var.name);
            System.out.println("Member name - "+var.age);
            System.out.println("Member name - "+var.salary);
        }


    }

    public class DisplayValueMember {
        public static void main(String[] args){
            Member_Variable obj=new Member_Variable("swetha",23, (double) 35000);
            obj.display();
        }
    }

