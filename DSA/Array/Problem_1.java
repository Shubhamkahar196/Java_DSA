import java.util.*;
public class Problem_1{

    static int targetSum(int[] arr, int target){
      int ans = 0;
      for(int i = 0; i < arr.length; i++){
        for(int j = i+1; j< arr.length; j++){
          if(  arr[i] + arr[j] == target){
                ans++;
          }
           
        }
      }
      return ans;

    }


    public static void main(String[] args){
        System.out.print("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            int[] arr = new int[n];

        System.out.print("Enter the element of Array : ");
        for(int i = 0; i<n;i++){
           arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target  number : ");
        int target = sc.nextInt();

        System.out.print("Target pairs number : " + targetSum(arr,target) );
    }
}