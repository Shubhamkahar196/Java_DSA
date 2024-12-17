import java.util.*;
// Bill of items
public class Bill{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the price of pen : ");
       float pen = sc.nextFloat();
       System.out.println("Enter the price of pencil : ");
       float pencil = sc.nextFloat();
       System.out.println("Enter the price of eraser : ");
       float earser = sc.nextFloat();

       float total = pen+pencil+earser;

       System.out.println("Total price of items " + total);

       //adding 18% gst

       float newTotal = total*(0.18f*total);
       System.out.println("After adding gst of 18% the total bill is " + newTotal);

   

    }
}
