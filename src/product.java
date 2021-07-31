import java.util.Scanner;

public class product {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int answer;

        System.out.print("Enter a number: ");
        number1 = input.nextInt();

        System.out.print("Enter a number: ");
        number2 = input.nextInt();

        System.out.print("Enter a number: ");
        number3 = input.nextInt();

        answer = number1 * number2 * number3;

        System.out.printf("The product of %d, %d and %d is %d%n.", number1, number2, number3, answer);
    }
}
