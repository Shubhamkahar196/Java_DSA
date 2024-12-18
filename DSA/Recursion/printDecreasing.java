import java.util.*;
public class printDecreasing {
    
    static void pd(int n){
       //base case
        if(n==1){
            System.out.println(1);
            return;
        }
        // selfwork 
        System.out.println(n);
        // recursive work
        pd(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pd(n);
    }
}
