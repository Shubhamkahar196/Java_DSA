public class basic {
    public static void main (String args[]){
      Fish Shark = new Fish("Blue");
      Shark.eat();
      System.out.println("Shark color is " + Shark.color);

      dog mydog = new dog("black");
      mydog.eat();
      mydog.run();
      System.out.println("My dog color is " + mydog.color);

    }
}

//parent / base class

class Animal {
    String color;
    //function 
    void eat(){
        System.out.println("Eats");
    }
    //function
    void breathe(){
        System.out.println("Breathe");
    }
}

//subclass /child class/ derived class

class Fish extends Animal {
    int fins;


    // Constructor to set the color of the fish
    Fish(String color) {
        this.color = color;
    }
    //function 

    void swim(){
        System.out.println("Swim");
    }
}

class dog extends Animal {
    int leg;
      
      dog(String color){
        this.color =  color;
      }
    //function
    void run(){
        System.out.println("Dog run");
    }
}