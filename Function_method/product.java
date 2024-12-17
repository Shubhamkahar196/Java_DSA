import java.util.*;

public class product{

    public static int multiply(int num1,int num2){
        int result = num1*num2;
        return result;
    }

    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of a : ");
    int a = sc.nextInt();
    System.out.println("Enter the number of b : ");
    int b = sc.nextInt();
     int result =  multiply(a,b);
     System.out.println("The product of a and b is "+ result);

    }
}