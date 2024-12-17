public class Pen_Oops {
    
    public static void main (String args[]){
        
        Pen p1 = new Pen();   // create  a object of pen
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        // p1.setColor("Yellow");   //you can also do like this without calling function
        p1.color = "Red";
        System.out.println(p1.color);
    }
}

class Pen {
    String color;
    int tip;

    // function
    void setColor (String newColor){
        color = newColor;
    }

    //function
    void setTip(int newTip){
        tip =  newTip;
    }
}