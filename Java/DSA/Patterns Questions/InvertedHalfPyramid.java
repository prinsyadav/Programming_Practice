import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of half pyramid:");
        int n = sc.nextInt();

        for(int i=1; i <= n; i++){
            for(int j = n; j >= i; j--){
            System.out.print("*");
            };
            System.out.println("");
        }
    }
}
