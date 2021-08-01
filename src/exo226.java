import java.util.Scanner;

public class exo226 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int mod =0;

        System.out.print("Enter an interger: ");
        a = input.nextInt();
        System.out.print("Enter an interger: ");
        b = input.nextInt();

        mod = a % b;

        if( mod == 0)
            System.out.printf("%d is a multiple of %d.%n", a, b);
        if (mod > 0 )
            System.out.printf("%d is not a multiple of %d.%n", a, b);

        input.close();
    }
}
