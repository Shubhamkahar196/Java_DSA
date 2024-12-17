
import java.util.Scanner;


public class Pattern_Prefix_sum_Problem {

    
         
    static int findArraySum(int[] arr){
        int totalSum = 0;
        for(int i = 0; i<arr.length;i++){
            totalSum += arr[i];
        }
        
        return totalSum;

    }

    static boolean arrayEqualPartition(int[] arr){
        int totalSum = findArraySum(arr);
        int prefixSum =  0;
        
        for(int i = 0; i<arr.length;i++){
            prefixSum += arr[i];

            int suffixSum = totalSum - prefixSum;
            if(suffixSum == prefixSum)
            return true;
        }
        return false;

    }
    
    static int[] prefixSum(int[] arr){
        for(int i = 1; i<arr.length;i++){
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }

    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
         System.out.print("Enter the size of array : ");
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] arr = new int[n+1];  // 1 based indexing
         System.out.println("Enter  element of array  ");
         for(int i = 1; i<=n;i++){   // we put <=n because they follow 1 based indexing   
            arr[i] = sc.nextInt();
         }
           
        //    System.out.print("Enter the range : ");
        //    int l = sc.nextInt();
        //    int r = sc.nextInt();

        //  System.out.println("Original array ");  
        //  printArr(arr);
        //  System.out.println("Prefix sum array");
        //  prefixSum(arr);
    //    System.out.println(arrayEqualPartition(arr)) ;
        int[] prefixSum = prefixSum(arr);
        System.out.print("Enter the number of queries : ");
        int q = sc.nextInt();

        while(q-- > 0){
            System.out.println("Enter the range ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefixSum[r] - prefixSum[l-1];
            System.out.println("Sum : " + ans);
        }
         
    }
}
