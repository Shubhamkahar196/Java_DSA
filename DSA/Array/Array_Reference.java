
import java.util.Scanner;


public class Array_Reference{

    static int occurence(int[] arr, int x){
        int count = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }

    public static void printArray(int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
      
    //   int[] arr = new int[5];
    //   arr[0] = 5;
    //   arr[1] = 3;
    //   arr[2] = 4;
    //   arr[3] = 6;
    //   arr[4] = 9;

    //   int[] arr_2 = arr;

    //   System.out.print("Original arr ");
    //   printArray(arr);

    //   System.out.print("Original arr_2 : ");
    //   printArray(arr_2);

    //   arr_2[0] = 0;
    //   arr_2[1] = 0;

    //   System.out.print("Original arr after updating arr_2 : ");
    //   printArray(arr);


    //   System.out.print("After updating arr_2 :");
    //   printArray(arr_2);


    //   System.out.print("If you make changes in arr_2 and not updating in arr so we can use clone method : ");

    //   int[] arr_2 = arr.clone();

    //     System.out.print("Original arr ");
    //   printArray(arr);

    //   System.out.print("Original arr_2 : ");
    //   printArray(arr_2);

    //   arr_2[0] = 0;
    //   arr_2[1] = 0;

    //   System.out.print("Original arr after updating arr_2 : ");
    //   printArray(arr);


    //   System.out.print("After updating arr_2 :");
    //   printArray(arr_2);


// occurence question

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of array : ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.print("Enter the element of array : ");
    for(int i = 0; i< n; i++){
        arr[i] = sc.nextInt();
    }

    System.out.print("Enter the element you want to find occurence : ");
    int x = sc.nextInt();

    System.out.println(occurence(arr, x));

    }
}