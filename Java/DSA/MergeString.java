import java.util.Scanner;

public class MergeString {

    public static String mergeString(String str1, String str2) {
        String resStr;

        resStr = str1 + " " + str2;
        return resStr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the name: ");
        String name = sc.nextLine();

        System.out.print("Enter the surname: ");
        String surname = sc.nextLine();

        String result = mergeString(name, surname);
        System.out.println(result);
    }
}
