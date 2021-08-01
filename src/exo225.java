import java.util.Scanner;

public class exo225 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int a;
        int mod;

        System.out.print("Enter a number: ");
        a = input.nextInt();

        mod = a % 2;

        if (mod == 0)
            System.out.printf("%d is an Even number.%n", a);
        if (mod >= 1)
            System.out.printf("%d is an Odd numnber.%n", a );
        
            input.close();

    }
}
