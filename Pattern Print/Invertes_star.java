import java.util.*;

public class Invertes_star{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

     System.out.println("Enter the number of rows of star : ");
     int n = sc.nextInt();
      for(int i=0;i<=n;i++){
        for(int j = n-i; j>0;j--){
            System.out.print( " * ");
        }
      System.out.println();
      }
    }
}