import java.util.Scanner;

public class arithmetics215 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int product;
        int sum;
        int quotient;
        int difference;

        System.out.print("Enter a number: ");
        x = input.nextInt();

        System.out.print("Enter a number: ");
        y = input.nextInt();

        sum = x + y;
        product = x * y;
        quotient = x / y;
        difference = x - y;

        System.out.printf("Their sum is %d.%nTheir product is %d.%nTheir quotient is %d.%nAnd their difference is %d.%n", sum, product, quotient, difference);

        input.close();
    }
}
