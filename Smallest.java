import java.util.Scanner;

public class SmallestAmongThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        System.out.print("Enter the fourth number: ");
        int num4 = scanner.nextInt();


        int smallest = findSmallest(num1, num2, num3, num4);

        System.out.println("The smallest number among " + num1 + ", " + num2 + ", and " + num3 +  num4 + is: " + smallest);

        scanner.close();
    }

    public static int findSmallest(int a, int b, int c int d) {
        return Math.min(Math.min(a, b), c);
    }
}
