public class inverted_half_pyramid{
        
     public static void inverted_half_pyramid(int n){
            //outer loop
            for(int i=1; i<=n;i++){
                //space
                for(int j=1; j<=n-i;j++){
                    System.out.print(" ");
                }
                //star
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                }

                System.out.println();
            }
        }


    public static void main( String args[]){
      inverted_half_pyramid(4);
    }
    
}