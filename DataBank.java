import java.util.ArrayList;
import java.util.Scanner;
public class DataBank{
  


static Scanner sc = new Scanner(System.in);





  public static void main(String[] args){
	  ArrayList<Product> pog = new ArrayList<Product>();
   System.out.println("This will help with product placement!");
  // Product windex = new Product("Windex", 7777777, "Cleaning liquid", "Aisle 265 Sec M");
  // System.out.println(windex);
  

   System.out.println("Enter Name: ");
   String n = sc.next();
   System.out.println("Enter Sku: ");
   int sn = sc.nextInt();
   System.out.println("Enter Description: ");
   String d = sc.next();
   System.out.println("Enter Aisle: ");
   String l = sc.next();

   pog.add(new Product(n, sn, d, l));
   
	System.out.println(pog);


  }
 /* public String toString(){
    return "Product: " + name + "\n" + "Sku: " + sku + "\n" + "Description: " + description
    + "\n" + "Location: " + location;

  } */

}
