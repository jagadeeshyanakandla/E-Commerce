import java.util.Scanner;

public class SellerProduct {

	Seller seller;
	static Product[] listofproduct;
	
	
	
	static Product  addproduct ;
	public static Product[] setAddproduct(Product[] allproduct,int count) {
		Scanner sc = new Scanner(System.in);	
		listofproduct = new Product[count];
		
		for (int i = 0; i < count; i++) {
			addproduct = new Product();
			System.out.println("Enter your product id : ");
			String ProductId = sc.nextLine();
			addproduct.setProductId(ProductId);
			System.out.println("Enter your Productcost : ");
			String ProductCost = sc.nextLine();
			addproduct.setCost(ProductCost);
			System.out.println("Enter your Productname : ");
			String ProductnName = sc.nextLine();
			addproduct.setProductName(ProductnName);
			listofproduct[i] = addproduct;
		}
		return listofproduct;
	}
	public static Product[] DeletItem(String deleteid, Product[] addproduct) {
		SellerProduct s = new SellerProduct();
		setListofproduct(addproduct);
		for (int i = 0; i < addproduct.length; i++) {
			System.out.println("_____________________________________________________");
			System.out.println("S.no    Type product      Items,value,id ");
			System.out.println("1 .     Product ID     : " + addproduct[i].getProductId());
			System.out.println("2 .     Product Name   : " + addproduct[i].getProductName());
			System.out.println("3 .     Product cost   : " + addproduct[i].getCost());
			System.out.println("_____________________________________________________");
		}
		for (int i = 0; SellerProduct.listofproduct[i].getProductId().equals(deleteid) == true; i++) {
			if (SellerProduct.getListofproduct()[i].getProductId().equals(deleteid) == true) {
				System.out.println("selected Item Detail given below : ");
				System.out.println("_____________________________________________________");
				System.out.println("S.no    Type product      Items,value,id ");
				System.out.println("1 .     Product ID     : " + SellerProduct.getListofproduct()[i].getProductId());
				System.out.println("2 .     Product Name   : " + SellerProduct.getListofproduct()[i].getProductName());
				System.out.println("3 .     Product cost   : " + SellerProduct.getListofproduct()[i].getCost());
				System.out.println("_____________________________________________________");
				 SellerProduct.getListofproduct()[i].setProductId(null);
				 SellerProduct.getListofproduct()[i].setCost(null);
				 SellerProduct.getListofproduct()[i].setProductName(null);
				System.out.println("after Deleted item  : ");
				System.out.println("_____________________________________________________");
				System.out.println("S.no    Type product      Items,value,id ");
				System.out.println("1 .     Product ID     : " + SellerProduct.getListofproduct()[i].getProductId());
				System.out.println("2 .     Product Name   : " + SellerProduct.getListofproduct()[i].getProductName());
				System.out.println("3 .     Product cost   : " + SellerProduct.getListofproduct()[i].getCost());
				System.out.println("_____________________________________________________");
			}
					
		}
		return listofproduct;
	}

	public static Product[] getListofproduct() {
		return listofproduct;
	}

	public static void setListofproduct(Product[] listofproduct) {
		SellerProduct.listofproduct = listofproduct;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}		
	
}
	
	
	
	
	
	
	

