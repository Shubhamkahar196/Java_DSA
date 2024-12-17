import java.util.Scanner;

public class Basic_2D{

    static void printArr(int[][] arr){
        for(int i= 0; i<arr.length;i++){
            for(int j =0 ;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thr row ");
        int r = sc.nextInt();
        System.out.println("Enter the column ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];   // 2D Array Initialize 

        //taking input element from user
        System.out.println("Enter " + r*c + " the element of array ");
        for(int i = 0; i<r;i++){
            for(int j = 0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        printArr(arr);


    }
}