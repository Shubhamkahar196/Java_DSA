public class Solid_Rhombus {
     
     //function
    public static void solid_rhombus(int n){
    
        //outer
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
      


    public static void main(String args[]){
          solid_rhombus(5);
    }
}

