
import java.util.Scanner;

public class RemoveOutermost {

    public static void rectangle(int n, int m) {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == m || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width of rectangle:");
        int x = sc.nextInt();

        System.out.print("Enter the height of rectangle:");
        int y = sc.nextInt();

        rectangle(x, y);
    }
}
