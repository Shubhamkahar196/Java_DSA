public class ShallowAndDeep{

    public static void main(String args[]){
        Student S1 =  new Student();
        S1.name = " Shubham kahar";
        S1.roll = 118;
        S1.password = "abcd";
        S1.marks = new int[3];
        S1.marks[0] = 100;
        S1.marks[1] = 99;
        S1.marks[2] = 85;


        Student S2 = new Student(S1);
        S2.password = "xyz";
        S1.marks[2] = 100;
        for(int i=0;i<3;i++){
            System.out.println(S2.marks[i]);
        }

    }
}


class Student {
    String name;
    int roll;
    String password;
    int[] marks;

    // shallow copy constructor
    // Student(Student S1){
    //     marks = new int[3];
    //     this.name = S1.name;
    //     this.roll = S1.roll;
    //     this.marks = S1.marks;  //shallow copy

    // }

    //deep copy constructor
    Student(Student s1){
        marks = new int [3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i] =s1.marks[i];
        }
    }


    Student(){
        System.out.println("Copy Constructor ...");
    }

    Student(String name){
        this.name = name;
          marks = new int[3];
    }

    Student(int roll){
        
        this.roll = roll;
          marks = new int[3];
    }
}
