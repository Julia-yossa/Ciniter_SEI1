import java.util.Scanner;

public class exo216 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int x;
        int y;

        System.out.print("Enter a number: ");
        x = input.nextInt();
        System.out.print("Enter a number: ");
        y = input.nextInt();

        if (x == y){
            System.out.print("These numbers are equal.%n");
        }
        if (x > y){
            System.out.printf("%d is larger.%n", x);
        }
        if (x < y){
            System.out.printf("%d is larger.%n", y);
        }

        input.close();
    }
}
