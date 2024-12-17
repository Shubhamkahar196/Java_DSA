import java.util.*;

public class AreaOfCircle{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        float r = sc.nextInt(); // r is radius of circle
        float AreaOfCircle = 3.14f*r*r;
        System.out.println(AreaOfCircle);
    }

}