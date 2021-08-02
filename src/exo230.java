import java.util.Scanner;

public class exo230 {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int a;
    int i = 0;
    int ii = 0;
    int iii = 0;
    int iv = 0;
    int v = 0;
   
    System.out.print("Enter a 5 digit number: ");
    a = input.nextInt();
   
    i = a/10000;
    ii = (a % 10000) / 1000;
    iii = (( a % 10000)%1000) / 100;
    iv = (((a %10000)%1000)% 100) / 10;
    v = (((a % 10000)%1000)%100)%10;
   
   
    System.out.printf("%d   %d   %d   %d   %d%n", i, ii, iii, iv, v);
    input.close();
    }
}
