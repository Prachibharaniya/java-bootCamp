public class FirstProgram {

    public static String productName = "PUMA Shoes";

   public static void main(String[] args) {

       System.out.println("Hello, World!");

       String collegeName = "Suresh Gyan Vihar University";
       // alpha numeric
       String address = "121, jagatpura, Jaipur, Rajasthan - 302017";
       int age = 99; // non-decimal values
       // decimal value data types
       float perc = 98.99F;
       float f1 = 10;
       double value = 10.23;

       String productName = "Motorola G5S";
       double productPrice = 16999;
       float productRating = 4.5F;
       double productMRP = 20999;
       double productDiscountPercentage = 19.5;

       boolean productInStock = false;
       System.out.println("product name = "+productName);
       testVariableTypes();

   }

   public static void testVariableTypes()
   {
    System.out.println("inside test variable types methods");
    System.out.println("product name = "+productName); // Static
    String productName = "iphone 16";
    System.out.println("product name = "+productName); // Local
   }
}
