import java.util.Scanner;

public class printNatural{

    static void printNaturalNumber(int n){ // 1,2,3,4,5....
        if(n==1){
            System.out.println(n);
            return;
        }
        printNaturalNumber(n-1);  // 1,2,3...n-1
        System.out.println(n);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNaturalNumber(n);
    }
} 