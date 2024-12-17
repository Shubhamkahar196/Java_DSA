public class Copy_Constructor{

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

    //copy constructor
    Student(Student S1){
        marks = new int[3];
        this.name = S1.name;
        this.roll = S1.roll;
        this.marks = S1.marks;  //shallow copy

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

//deep copy

// public class Copy_Constructor {

//     public static void main(String[] args) {
//         Student S1 = new Student();
//         S1.name = "Shubham Kahar";
//         S1.roll = 118;
//         S1.password = "abcd";
//         S1.marks = new int[]{100, 99, 85};

//         Student S2 = new Student(S1);
//         S2.password = "xyz";

//         for (int i = 0; i < 3; i++) {
//             System.out.println(S2.marks[i]);
//         }
//     }
// }

// class Student {
//     String name;
//     int roll;
//     String password;
//     int[] marks;

//     // Copy constructor
//     Student(Student S1) {
//         this.name = S1.name;
//         this.roll = S1.roll;
//         this.password = S1.password;
//         this.marks = new int[S1.marks.length];
//         System.arraycopy(S1.marks, 0, this.marks, 0, S1.marks.length);
//     }

//     Student() {
//         System.out.println("Copy Constructor ...");
//     }

//     Student(String name) {
//         this.name = name;
//         this.marks = new int[3];
//     }

//     Student(int roll) {
//         this.roll = roll;
//         this.marks = new int[3];
//     }
// }


