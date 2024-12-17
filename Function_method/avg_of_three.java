import java.util.*;

public class avg_of_three{
   
   public static int avg(int a,int b,int c){
    int avg_of_three = (a+b+c)/3;
    return avg_of_three;
   } 


    public static void main(String  args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the 1st number ");
      int x =sc.nextInt();
       System.out.println("Enter the 2nd number ");
      int y =sc.nextInt();
       System.out.println("Enter the 3rd number ");
      int z =sc.nextInt();
      
      int result = avg(x,y,z);
      System.out.print("The avg of three number are " + result);

    }
}