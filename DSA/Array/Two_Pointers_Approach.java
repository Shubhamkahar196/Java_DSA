import java.util.*;
public class Two_Pointers_Approach{

    static void zerosOnes(int[] arr){
        int left = 0;
        int right = arr.length-1;
         while(left< right){
            if(arr[left] == 1 && arr[right] == 0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left] ==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
    }

    static void evenOdd(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            if(arr[left]%2==1 && arr[right]%2==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
    }

static void swap(int[] arr,int i, int j){

    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

static void print(int[]arr){
    for(int i = 0; i< arr.length;i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}
    public static void main(String[] args){
        System.out.print("Enter the size of Array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

               int[] arr = new int[n];
        System.out.print("Enter the element of array : ");
         for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
         }
        
      
      System.out.println("Original array ");
      print(arr);
      System.out.println("Sorted array");
    //  zerosOnes(arr);
    evenOdd(arr);
     print(arr);

    }
}