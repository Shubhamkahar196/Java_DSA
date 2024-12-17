
class ArraysExample {

    void demoArrays() {
        int[] ages = new int[3];
        float[] weight = new float[5];

        ages[0] = 34;
        ages[1] = 21;
        ages[2] = 23;
//
//        System.out.println(ages[0]);
//        System.out.println(ages[2]);
//        System.out.println(ages[2]);
//        System.out.println(ages.length);

        for (int age : ages) {
            System.out.println(age);
        }

        weight[0] = 2;
        System.out.println(weight[0]);
    }

    void multiArrays() {
//        int[][] arr = new int[2][2];
        int[][] arr = {{55, 45}, {35, 43}};

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][1]);
    }

    void sum() {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    void maxOfArray() {

        int[] arr = {8, 5, 3, 2, 9};
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        System.out.println(ans);

    }

    void searchArray() {
        int[] arr = {8, 4, 5, 2, 9};
        int x = 2;
        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
                break;
            }
        }
        if (ans == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found " + x + " at index " + ans);
        }

    }
}

public class Array_1 {

    public static void main(String[] args) {
        ArraysExample obj = new ArraysExample();
//        obj.demoArrays();
//        obj.multiArrays();

        // obj.sum();
        // obj.maxOfArray();
        obj.searchArray();
    }
}
