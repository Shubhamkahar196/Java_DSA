public class hollowReactangle {
    //function
   public static void hollow_Reactangle(int totRows, int topCols) {
     //outer loop
     for(int i=1;i<=totRows;i++){
         //inner loop-column
            for(int j=1; j<=topCols; j++){
                // cell (i,j)
                if(i==1 || i==totRows || j==1 || j==topCols){
                    //boundary cells
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }


    public static void main(String args[]){
         hollow_Reactangle(4,5);

    }
}