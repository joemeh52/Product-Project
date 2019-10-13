import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class DataBank{
  


public static Scanner sc = new Scanner(System.in).useDelimiter("\\n");
public static ArrayList<Product> pog = new ArrayList<Product>();


public static void addItem() {
	String addAnother;
	
	  do {
		System.out.println("Enter Name: ");
	   String n = sc.next();
	   System.out.println("Enter Sku: ");
	   int sn = sc.nextInt();
	   System.out.println("Enter Description: ");
	   String d = sc.next();
	   System.out.println("Enter Aisle: ");
	   String l = sc.next();

	  
	   pog.add(new Product(n,sn,d,l));
	   
	   
	   System.out.println("\nWould you like to add another? (Y/N)");
	   addAnother = sc.next();
	   
	  }while (!"n".equals(addAnother));
}


public static void menu(){
	System.out.println("Welcome to the Systems Main Menu!");
	System.out.println("What would you like to do?");
	System.out.println("1) Add items \n" + "2) Coming Soon!!!" );
	int decision = sc.nextInt();
	switch(decision)
	{
	case 1: 
		addItem();
		break;
	case 2:
		System.out.println("User option coming soon!!!");
		menu();
		break;
	default:
		System.out.println("\nChoose a valid option.");
		menu();
		break;
	}
	
	
	
	
	
}


  public static void main(String[] args){
	  //ArrayList<Product> pog = new ArrayList<Product>();
   System.out.println("This will help with product placement!");
  // Product windex = new Product("Windex", 7777777, "Cleaning liquid", "Aisle 265 Sec M");
  // System.out.println(windex);
  
   	menu();
   //pog.add(addItem());
  
	System.out.println(pog);


  }
 /* public String toString(){
    return "Product: " + name + "\n" + "Sku: " + sku + "\n" + "Description: " + description
    + "\n" + "Location: " + location;

  } */

}
