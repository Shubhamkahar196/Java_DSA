import java.util.*;
public class Array_Manipulation{

    static int unique(int[] arr){
        for(int i  = 0; i< arr.length;i++){
            for(int j = i+1; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        int ans = -1;
        for(int i=0; i<arr.length;i++){
            if(arr[i] >0){
                ans = arr[i];
            }
        }
        return ans;
    }

   static int FirstMax(int[] arr){

    int mx = Integer.MIN_VALUE;
    for(int i = 0; i< arr.length;i++){
        if(arr[i] > mx){
            mx = arr[i];
        }
    }
    return mx;
   }


   static int secondMax(int[] arr){
    int mx = FirstMax(arr);

    for(int i = 0; i< arr.length;i++){
        if(arr[i]== mx){
            arr[i] = Integer.MIN_VALUE;
        }
    }
     int secondMax = FirstMax(arr);
     return secondMax;
   }

   static int firstUnique(int[] arr){
    for(int i = 0; i<arr.length;i++){   
        for(int j = i + 1; j<arr.length;j++){
            if(arr[i]==arr[j]){
                return arr[i];
           }
        }
    }
    return -1;
   }

   static void reverse(int[] arr){
    for(int i = arr.length-1; i>=0; i--){
        System.out.print(arr[i] + " ");
    }
    System.out.println(" ");
   }
     
    public  static void main(String[] args){
        System.out.print("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            int[] arr = new int[n];

        System.out.print("Enter the element of Array : ");
        for(int i = 0; i<n;i++){
           arr[i] = sc.nextInt();
        }

        // System.out.print("Unqiue number is : " + unique(arr));
        // System.out.print("First number  is : " + FirstMax(arr) + " Second Number : " + secondMax(arr));
        // System.out.print("First Unique number is : " + firstUnique(arr));
        reverse(arr);
    }
}