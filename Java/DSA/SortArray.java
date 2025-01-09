
import java.util.Scanner;

class SortArray {

    public static int[] sortArrays(int arr[]) {
        int n = arr.length;

        for (int j = 0; j <n - 1; j++) {
            for (int i = 0; i < n - j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

            }
        }

        // for (int i = 0; i < n - 1; i++) {
        //     for (int j = 0; j < n - i - 1; j++) {
        //         if (arr[j] > arr[j + 1]) {
        //             int temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //         }
        //     }
        // }

        return arr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");

        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int[] resArray = sortArrays(array);

        System.out.print("This is sorted array:");
        for (int num : resArray) {
            System.out.print(num+"");
        }

        sc.close();
    }
}
