
import java.util.ArrayList;
import java.util.Scanner;

public class backend {

    private static ArrayList<backend> BackendList = new ArrayList<>();

    private int Productcode;
    private String Productname;
    private String ProductCategory;
    private int ProductWarranty;
    private int Productprice;
    private int Productlevel;
    private String productSupplier;
    private int productprice2;
    private int productlevel2;
    private int productwarranty2;

    public backend(int Productprice, int Productlevel, int Productcode, String productSupplier, String Productname,
            String ProductCategory, int ProductWarranty, int productprice2, int productlevel2, int productwarrenty2) {
        this.Productcode = Productcode;
        this.Productname = Productname;
        this.ProductCategory = ProductCategory;
        this.ProductWarranty = ProductWarranty;
        this.Productprice = Productprice;
        this.Productlevel = Productlevel;
        this.productSupplier = productSupplier;
        this.productprice2 = productprice2;
        this.productlevel2 = productlevel2;
        this.productwarranty2 = productwarrenty2;

    }

    public static void saveProduct() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Capture a new product");
        System.out.println("***************************************************************");
        System.out.println("Enter the Product code(0000): ");
        int Productcode = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Product name: ");
        String Productname = sc.nextLine();

        System.out.println("Select the product Category");
        System.out.println("(1) Desktop Computer");
        System.out.println("(2) laptop");
        System.out.println("(3) Tablet");
        System.out.println("(4) Printer");
        System.out.println("(5) Gaming Console");
        int num3 = sc.nextInt();
        String ProductCategory;
        if (num3 == 1) {
            ProductCategory = "Desktop Computer";
        } else if (num3 == 2) {
            ProductCategory = "Laptop";
        } else if (num3 == 3) {
            ProductCategory = "Tablet";
        } else if (num3 == 4) {
            ProductCategory = "Printer";
        } else if (num3 == 5) {
            ProductCategory = "Gaming Console";
        } else {
            System.out.println("Pleas enter the provided number: ");
            return;
        }

        System.out.println("***************************************************************");
        System.out.print("Indicate the producr warrantly.");
        System.out.println("Enter (1) for 6 months or any other key for 2 year. ");
        int num4 = sc.nextInt();
        int ProductWarranty = (num4 == 1) ? 6 : 24;

        System.out.println("Enter the Price for the product: ");
        int ProductPrice = sc.nextInt();

        System.out.println("Enter the level of the product (1 to 5): ");
        int ProductLevel = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter the supplier for the product: ");
        String ProductSupplier = sc.nextLine();

        System.out.println("Product details has been saved Successfully!!!");

        backend newbackend = new backend(ProductPrice, ProductLevel, Productcode, ProductSupplier, Productname,
                ProductCategory, ProductWarranty, ProductLevel, ProductLevel, ProductLevel);
        BackendList.add(newbackend);

    }

    public static void searchProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the produc code to search: ");
        int Code = sc.nextInt();
        for (backend s : BackendList) {
            if (s.Productcode == (Code)) {
                System.out.println("**************************************************************");
                System.out.println("PRODUCT SEARCH RESULTS");
                System.out.println("***************************************************************");
                System.out.println(s);
                System.out.println("***************************************************************");
                return;

            }
        }
    }

    public static void printReport() {
        System.out.println("***************************************************************");
        System.out.println("PRODUCT REPORT");
        System.out.println("***************************************************************");

        if (BackendList.isEmpty()) {
            System.out.println("No saved products available.");
            return;
        }

        int total = 0;

        for (backend product : BackendList) {
            System.out.println(product);
            System.out.println("***************************************************************");
            total += product.Productprice;
        }

        double mean = (double) total / BackendList.size();

        System.out.println("TOTAL PRODUCT PRICE: R" + total);
        System.out.println("AVERAGE PRODUCT PRICE: R" + mean);
    }

    public static void DeletingProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the code of the product: ");
        int Code1 = sc.nextInt();

        for (int i = 0; i < BackendList.size(); i++) {
            if (BackendList.get(i).Productcode == Code1) {
                BackendList.remove(i);
                System.out.println("Product deleted successfully.");
                return;
            }

            System.out.println("Product not found.");
        }
        System.out.println("Invalid code, Product not found.");
    }

    public static void Updateproduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the code of the product: ");
        int Code1 = sc.nextInt();

        for (backend s : BackendList) {
            if (s.Productcode == Code1) {
                System.out.println("Do you want to update the warranty?");
                System.out.println("Yes");
                System.out.println("No");
                String wrd1 = sc.next();
                if (wrd1.equals("Yes")) {
                    System.out.println("Enter (1) for 6 months or any other key for 2 year. ");
                    int num4 = sc.nextInt();
                    s.ProductWarranty = (num4 == 1) ? 6 : 24;
                    System.out.println("Warranty updated successfully.");
                } else {
                    System.out.println("Warranty will not be updated");
                }

                System.out.println("Do you want to update the product price?");
                System.out.println("Yes");
                System.out.println("No");
                String wrd2 = sc.next();
                if (wrd2.equals("Yes")) {
                    System.out.println("Enter the updated product price: ");
                    s.Productprice = sc.nextInt();
                    System.out.println("Price updated successfully.");
                } else {
                    System.out.println("Product price will not be updated");
                }

                System.out.println("Do you want to update the product level?");
                System.out.println("Yes");
                System.out.println("No");
                String wrd3 = sc.next();
                if (wrd3.equals("Yes")) {
                    System.out.println("Enter the updated product level (1 to 5): ");
                    s.Productlevel = sc.nextInt();
                    System.out.println("Level updated successfully.");
                } else {
                    System.out.println("Product level will not be updated");
                }

                System.out.println("Product details have been updated successfully!!!");
                return;
            }
        }
        System.out.println("Product with code " + Code1 + " not found.");
    }

    @Override
    public String toString() {
        return "Product Code: " + Productcode + "\n"
                + "Product Name: " + Productname + "\n"
                + "Product Category: " + ProductCategory + "\n"
                + "Product Warranty: " + ProductWarranty + " months\n"
                + "Product Price: " + "R" + Productprice + "\n"
                + "Product Level: " + Productlevel + "\n"
                + "Product Supplier: " + productSupplier;
    }

}