import java.util.Scanner;

public class exo228 {
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);

        int r;
        
      System.out.print("Enter the radius of the circle: ");
      r = input.nextInt();

    System.out.printf("The diameter of the circle is %d, its circumference is %f and its area is %f.%n", 2 * r, 2 * Math.PI * r, Math.PI * r * r);
    input.close();
    }
}
