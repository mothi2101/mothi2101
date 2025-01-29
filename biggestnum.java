import java.util.Scanner;
public class biggest {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if (num1 > num2) {
            System.out.println("num1 is grater number ");
        } else {
            System.out.println("num2 is grater number ");
        }

    }
}
