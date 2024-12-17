import java.util.*; 

public class binomial_coeficient{

    // creating function for factorial
      public static int fact(int n){
        int f = 1 ;
         for(int i=1;i<=n;i++){
            f =f *i;
         }
         return f;
      }

      // creating function of binomial 

      public static int bino_coe(int n ,int r){
        int fact_n = fact(n);  // finding n factorial
        int fact_r = fact(r);  // finding r factorial 
        int fact_nmr = fact(n-r);  // finding n-r factorail

        int binomial = fact_n / (fact_r * fact_nmr);

        return binomial;
      }



    public static void main(String args[]){
   System.out.println(bino_coe(5,2));  // calling function
    }
}