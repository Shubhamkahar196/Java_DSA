public class Getter_Setters_This {
    
    public static void main (String args[]){
        
        Pen p1 = new Pen();   // create  a object of pen
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

        // p1.setColor("Yellow");   //you can also do like this without calling function
        p1.setColor("Red");
        System.out.println(p1.getColor());
    }
}

class Pen {
   private String color;
    private  int tip;


   //getters
    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    //Setters

    void setColor (String newColor){
        this.color = newColor;
    }

    void setTip(int tip){
      this.tip =  tip;
    }
}