import java.util.*;

public class Average{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the value of 1st number : ");
         float a = sc.nextFloat();
         System.out.println("Enter the value of 2nd number : ");
         float b = sc.nextFloat();
         System.out.println("Enter the value of 3rd number : ");
         float c = sc.nextFloat();

         float avg = (a + b + c )/ 3;

         System.out.print("The average of three number is : "+avg);
    }
}