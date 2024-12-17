
import java.util.Scanner;
import java.util.*;
public class Basic_Problem {

       public static int last(int[]arr, int x){
        
        int last_index = -1;

        for(int i = 0; i < arr.length;i++){
            if(arr[i]==x){
                last_index = i;
            }
        }
        return last_index;

     }

     static int strictlyGreater(int[] arr, int x){
        int count = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] > x){
                count++;
            }
        }
        return count;
     }

     static boolean isSorted(int[] arr){
        boolean check = true;
        for(int i = 1 ; i< arr.length; i++){
            if(arr[i] < arr[i-1]){    
                // not sorted
                check = false;        
                break;
            }
        }
        return check;
     }

     static int[] smallestAndLargestElement(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length-1]};
        return ans;
     }

     static int[] kthIndex(int[]arr ,int k){
        Arrays.sort(arr);
        int[] ans = {arr[(k-1)], arr[arr.lenth-1-k]};
        return ans;
     }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of array : ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.print("Enter the element of array : ");
    for(int i = 0; i< n; i++){
        arr[i] = sc.nextInt();
    }

    // System.out.print("Enter the element you want to find occurence : ");
    // int x = sc.nextInt();

    // System.out.println("Last Occurence Of index " + last(arr, x));

    //    System.out.println("Strictly greater number : " + strictlyGreater(arr,x));

    //    System.out.println("Is sorted : " + isSorted(arr));

    // int[] ans = smallestAndLargestElement(arr);

    //    System.out.println("Smallest Element : " + ans[0]);
    //    System.out.println("Largest Element : " + ans[1]);

     int[] ans = kthIndex(arr,k);
     System.out.println("\n" + k + "th" +"Smallest element " + ans[0]);
     System.out.println("\n" + k + "th" +"Largest element " + ans[1]);

    }
}
