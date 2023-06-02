// Exercise 17.11: ProcessInvoices.java
// Processing Invoices with lambdas and streams.
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

public class ProcessInvoices 
{
   public static void main(String[] args)
   {
      Invoice[] invoices = {
         new Invoice(83, "Electric sander", 7, 57.98),
         new Invoice(24, "Power saw", 18, 99.99),
         new Invoice(7, "Sledge hammer", 11, 21.50),
         new Invoice(77, "Hammer", 76, 11.99),
         new Invoice(39, "Lawn mower", 3, 79.50),
         new Invoice(68, "Screwdriver", 106, 6.99),
         new Invoice(56, "Jig saw", 21, 11.00),
         new Invoice(3, "Wrench", 34, 7.50)
      };

      System.out.println("Invoices sorted by part description:"); 

      System.out.printf("%nnInvoices sorted by price:%n");
       
      System.out.printf("%nInvoices mapped to description and quantity:%n");

      System.out.printf("%nInvoices mapped to description and invoice amount:%n");
      

      System.out.printf("%nInvoices mapped to description and invoice amount for invoices in the range 200-500:%n");
}


