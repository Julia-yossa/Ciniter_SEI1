import java.util.Scanner;

public class exo217 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int z;
        int product;
        int sum;
        int average;
        int smallest = 0;
        int largest = 0;

        System.out.print("Enter a number: ");
        x = input.nextInt();

        System.out.print("Enter a number: ");
        y = input.nextInt();

        System.out.print("Enter a number: ");
        z = input.nextInt();

        sum = x + y + z;
        product = x*y*z;
        average = product / sum;

        if(x < y && x < z){
            smallest = x;    
        }
        if(x > y && x > z){
            largest = x;
        }
        if(x < y && x > z){
            largest = y;
            smallest = z;
        }
        if(x > y && x < z){
            largest = z;
            smallest = y;
        }

        System.out.printf("Their sum is %d, product is %d, average is %d.%nThe largest number is %d and the smallest is %d.%n", sum, product, average, largest, smallest);
        input.close();
    }
}
