import java.util.Scanner;

public class Extreme {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("BRIGHT FUTURE TECHNOLOGIES APPLICATION");
        System.out.println("Enter 1 to continue and any other number to continue");
        int num = input.nextInt();
        if (num == 1) {
            while (true) {
                System.out.println("Please select one of the following menu items: ");
                System.out.println("(1) Capture a new product.");
                System.out.println("(2) Search for a product. ");
                System.out.println("(3) Update a product. ");
                System.out.println("(4) Delete a product. ");
                System.out.println("(5) Print Report. ");
                System.out.println("(6) Exit Application. ");
                int Num2 = input.nextInt();

                switch (Num2) {
                    case 1:
                        backend.saveProduct();
                        break;
                    case 2:
                        backend.searchProduct();
                        break;
                    case 3:
                        backend.Updateproduct();
                        break;
                    case 4:
                        backend.DeletingProduct();
                        break;
                    case 5:
                        backend.printReport();
                        break;
                    case 6:
                    default:
                }
            }
        } else {
            System.out.println("Thank you for using Extreme IT");
            System.exit(0);
        }

    }
}
