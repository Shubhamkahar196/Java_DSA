import java.util.*;

public class factorial{

    public static int fact(int num){
        int f = 1;

        for(int i =1; i<=num;i++){
            f = f*i;
        }
        return f;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number you want to factorial of that number ");
       int a = sc.nextInt();
       int factorial = fact(a);
       System.out.println("The factorial of a " + factorial);
    }
}