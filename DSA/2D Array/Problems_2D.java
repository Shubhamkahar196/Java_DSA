import java.util.Scanner;

public class Problems_2D{

  static void add(int[][] a, int r , int c , int[][] b, int r1, int c1){
     if(r!=r1 || c!=c1){
        System.out.println("Wrong input - Addition not possible");
        return ;
     }

     int[][] sum = new int[r][c1];   //we can also write [r1][c1]
       for(int i =0; i<r;i++){
         for(int j =0; j<c;j++){
            sum[i][j] = a[i][j] + b[i][j];
         }
       }
       printArr(sum);
  }

  static void Mul(int[][] a, int r , int c , int[][] b, int r1, int c1){
     if( c !=r1){
        System.out.println(" Multiplication not possible - wrong dimension");
        return ;
     }

     int[][] mul = new int[r][c1];   //we can also write [r1][c1]
       for(int i =0; i<r;i++){
         for(int j =0; j<c1;j++){
            // mul[i][j] = a[i][j] * b[i][j];
            for(int k = 0; k<c; k++){
                mul[i][j] += (a[i][k] * b[k][j]);
            }
         }
       }
       System.out.println("Multiplication of 2 Matrix");
       printArr(mul);
  }
   
   // 2D array reverse elemet
  static void reverseArr(int[][] arr) {
    
    // Reverse array
       for (int[] row : arr) {
        int left = 0;
        int right = row.length - 1;
        while (left < right) {
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }

    System.out.println("Reversed Array:");
    printArr(arr);
  }

  static void reverseSingleArr(int[] arr){
    int left = 0;
    int right = arr.length-1;
    while(left< right){
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }
  }
  

  // static void transpose(int[][] arr){
  //   for(int i = 0; i< arr.length;i++){
  //       for(int j = 0; j<arr[i].length;j++){
  //          System.out.print( arr[j][i] + " ");
  //       }
  //       System.out.println();
  //   }
  // }

  static void transpose(int[][] arr,int r, int c){

    for(int i =0; i<c; i++){
      for(int j = i; j<r; j++){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;

      }
    }
  }

  static void rotate(int[][] arr,int r, int c){
      transpose(arr,r,c);
      // reverse each row of transposed matrix

      for(int i = 0; i<arr.length;i++){
        reverseSingleArr(arr[i]);
      }
      
    }




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
        System.out.println("Enter thr row of 1 matrix");
        int r = sc.nextInt();
        System.out.println("Enter the column of 1 matrix");
        int c = sc.nextInt();

       


        int[][] a = new int[r][c];   // 2D Array Initialize 

        //taking input element from user
        System.out.println("Enter " + r*c + " the element of 1st Matrics ");
        for(int i = 0; i<r;i++){
            for(int j = 0; j<c; j++){
                a[i][j] = sc.nextInt();
            }
        }

        //  System.out.println("Enter thr row of 2nd matrix ");
        // int r1 = sc.nextInt();
        // System.out.println("Enter the column of 2nd column ");
        // int c1 = sc.nextInt();

        // int[][] b = new int[r1][c1];
        
        // System.out.println("Enter " + r1*c1 + " the element of 2nd Matrics ");
        // for(int i = 0; i<r1;i++){
        //     for(int j = 0; j<c1; j++){
        //         b[i][j] = sc.nextInt();
        //     }
        // }
        // printArr(arr);
        // System.out.println("Matrix 1");
        // printArr(a);
        // System.out.println("Matrix 2");
        // printArr(b);
        //  System.out.println("Addition of two matrix");
        // add(a,r,c,b,r1,c1);
         
        // Mul(a,r,c,b,r1,c1);
       
       System.out.println("Original Array ");
        printArr(a);
        // reverseArr(a);
        // System.out.println("Transpose array ");
        // transpose(a);
           
           rotate(a,r,c);
       System.out.println("Rotatation of array ");
        printArr(a);
     
      // printArr(a);
        
        



  }
}