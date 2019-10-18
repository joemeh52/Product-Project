
public class Product {
	String name;
	int sku;
	String description;
	String location;

	public Product(String product, int skuNum, String desc, String loc){
	  name = product;
	  sku = skuNum;
	  description = desc;
	  location = loc;
	  }
	
	

	  public static void main(String[] args){

	   System.out.println("This will help with product placement!");
	   Product windex = new Product("Windex", 6703456, "Cleaning liquid", "Aisle 265 Sec M");
	   System.out.println(windex);
	  }
	  
	  
	  public String toString(){
	      return "Product: " + name + "\n" + "Sku: " + sku + "\n" + "Description: " + description
	      + "\n" + "Location: " + location;

	    }

	}

