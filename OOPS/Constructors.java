public class Constructors {

    public static void main(String args[]){
        // Student s1 = new Student("Shubham");
        Student s1 = new Student();
        Student s2 = new Student("sk");
        // System.out.println(s1.name);
         
        //  NonParameterized n1 = new Student();
        //  Parameterized n2 = new Student("sk");
    }
}

// class NonParameterized {
//     String name;
//     int roll;
//     Student() {  //non parameterized beacuase they not have argument
//     System.out.println("Non parameterized");
//     }
// }

// class Parameterized{
//     String name;
//     int roll;

//     Student(String name){  //parameterized because they hava argument
//         this.name = name;
//          System.out.println(" parameterized");
//     }
// }

class Student {
    String name;
    int roll;

    // Student(){
    // Student(String name){
        // this.name = name;
    //     System.out.println("Constructor is called....");
    // }

    Student() {  //non parameterized beacuase they not have argument
    System.out.println("Non parameterized");
    }

     Student(String name){  //parameterized because they hava argument
        this.name = name;
        System.out.println("Parameterized");
    }
}