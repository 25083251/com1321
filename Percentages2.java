import java.util.Scanner;

public class Percentages2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        computePercent(num1, num2);

    }

    public static void computePercent(double num1, double num2) {
        double percent = (num1 / num2) * 100;
        System.out.println("the percent is :" + percent);
    }
}
