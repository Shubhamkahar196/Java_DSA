import java.util.*;

public class Square{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square : ");
        float side = sc.nextFloat();
        float square = side*side;

        System.out.println("The square of side " + square);
    }

}