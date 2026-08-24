public class Percentages {
    public static void main(String[] args) {
        double num1 = 100.0;
        double num2 = 1000.0;

        computePercent(num1, num2);
    }

    public static void computePercent(double num1, double num2) {
        double percent = (num1 / num2) * 100;
        System.out.println("The percent is :" + percent);
    }
}
