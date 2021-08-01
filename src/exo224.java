import java.util.Scanner;

public class exo224 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;
        int d;
        int e;
        int smallest;
        int largest;

        System.out.print("Enter a number: ");
        a = input.nextInt();

        System.out.print("Enter another number: ");
        b = input.nextInt();

        System.out.print("Enter another: ");
        c = input.nextInt();

        System.out.print("Enter another: ");
        d = input.nextInt();

        System.out.print("Enter another: ");
        e = input.nextInt();

        
        smallest = a;
        
        if (b < smallest){
            smallest = b;
        }
        if (c < smallest){
            smallest = c;
        }
        if (d < smallest){
            smallest = d;
        }
        if (e < smallest){
            smallest = e;
        }
        largest = a;

        if (b > largest){
            largest = b;
        }
        if (c > largest)
            largest = c;
        if (d > largest)
            largest = d;
        if(e > largest)
            largest = e;

        System.out.printf("%d is smallest.%n", smallest);
        System.out.printf("%d is the largest.%n", largest);
        
        input.close();
    }
}
