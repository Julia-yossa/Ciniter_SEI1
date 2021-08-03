import java.util.Scanner;

public class exo233 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int weight;
        int height;
        int bmi = 0;
        System.out.println("Welcome to the body mass index(BMI) calculator.\nEnter your weight in kilogram: ");
        weight = input.nextInt();
        System.out.println("Enter your height in meters: ");
        height = input.nextInt();

        bmi = weight / (height * height);
        System.out.printf("Your BMI is %d%n", bmi);
        System.out.printf("BMI VALUES %nUnderweight: less than 18.5 %nNormal: between 18.5 and 24.9 %nOverweight: between 25 and 29.9 %nObese: 30 /or greather");
        input.close();
    }
}
