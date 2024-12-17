import java.util.*;

public class pos_neg{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int x = sc.nextInt();

        if(x<0){
            System.out.println("This is negative number : "+x );
        }else{
            System.out.println("this is positive number :" + x);
        }
    }
}