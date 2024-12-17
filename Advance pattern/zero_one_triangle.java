public class zero_one_triangle{
     
     //function
     public static void zero_one_triangle(int n){
        //outer
       
        for(int i=1;i<=n;i++){
          //inner-
          for(int j=1;j<=i;j++){
            if((i+j)%2==0){  //even
                System.out.print("1");
            }else{   //odd
                System.out.print("0");
            }
          }
          System.out.println();
        }
     }


    public static void main(String args[]){
        zero_one_triangle(5);
    }
}