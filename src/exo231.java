import java.util.Scanner;

public class exo231 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int a, b, c, d, e;

        System.out.println("Enter a number: ");
        a = input.nextInt();
        System.out.println("Enter a number: ");
        b = input.nextInt();
        System.out.println("Enter a number: ");
        c = input.nextInt();
        System.out.println("Enter a number: ");
        d = input.nextInt();
        System.out.println("Enter a number: ");     
        e = input.nextInt();
        
        input.close();
        int pos = 0;
        int zer = 0;
        int neg = 0;
        
        if (a == 0){
            zer++;
           
        }
        if (b == 0){
            zer++;
        }
        if (c == 0){
            zer++;
        }
        if (d == 0){
            zer++;
        }
        if (e == 0){
            zer++;
        }
        if (a < 0) {
            neg++;

        }
        if (b < 0) {
            neg++;
        }
        if (c < 0) {
            neg++;
        }
        if (d < 0) {
            neg++;
        }
        if (e < 0) {
            neg++;
        }
        if (a > 0) {
            pos++;

        }
        if (b > 0) {
            pos++;
        }
        if (c > 0) {
            pos++;
        }
        if (d > 0) {
            pos++;
        }
        if (e > 0) {
            pos++;
        }
    
    if (zer > 0){ 
        System.out.printf("There is %d zero's%n", zer);
    }   
    if (pos > 0){ 
        System.out.printf("There are %d positive numbers%n", pos);
    }
    if (neg > 0) {
        System.out.printf("There are %d negative numbers%n", neg);
    }    

    }
}