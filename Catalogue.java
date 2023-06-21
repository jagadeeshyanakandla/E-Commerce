

import java.util.Scanner;

public class Catalogue {
	private static Product[] listofproduct;
	private Catalogue[] subcatalog;
	private String sub;
	public Scanner sc = new Scanner(System.in);
	Admin admin = new Admin();
	private String ProductId;

	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public String getProductid() {
		return ProductId;
	}
	public static Product[] getListofproduct() {
		Catalogue subcatalog1 = new Catalogue();
		Catalogue subcatalog2 = new Catalogue();
		Catalogue subcatalog3 = new Catalogue();
		subcatalog1.setSub("Electronic");
		subcatalog2.setSub("Dress");
		subcatalog3.setSub("Bikes");
		Product product1 = new Product();
		Product product2 = new Product();
		Product product3 = new Product();
		Product product4 = new Product();
		Product product5 = new Product();
		Product product6 = new Product();
		Product product7 = new Product();
		Product product8 = new Product();
		Product product9 = new Product();
		Product product10 = new Product();
System.out.println("Electronic, Dress and Bikes items details given below :");
			product1.setProductId("1");
			product1.setCost("1000");
			product1.setProductName("Normal Headset");
			product2.setProductId("2");
			product2.setCost("2000");
			product2.setProductName("Samsung Headset");
			product3.setProductId("3");
			product3.setCost("3000");
			product3.setProductName("Boat Headset");
			product4.setProductId("4");
			product4.setCost("10000");
			product4.setProductName("Hightly jio Heatset");
			product5.setProductId("5");
			product5.setCost("1000");
			product5.setProductName("Trending Phants ");
			product6.setProductId("6");
			product6.setCost("300");
			product6.setProductName("Trending T-shirts");
			product7.setProductId("7");
			product7.setCost("250");
			product7.setProductName("Trending Track-phants");
			product8.setProductId("8");
			product8.setCost("300");
			product8.setProductName("Trending Shirts");
			product9.setProductId("9");
			product9.setCost("350000");
			product9.setProductName("R15 V3");
			product10.setProductId("10");
			product10.setCost("400000");
			product10.setProductName("R15 V4");
			listofproduct = new Product[10];
			listofproduct[0] = product1;
			listofproduct[1] = product2;
			listofproduct[2] = product3;
			listofproduct[3] = product4;
			listofproduct[4] = product5;
			listofproduct[5] = product6;
			listofproduct[6] = product7;
			listofproduct[7] = product8;
			listofproduct[8] = product9;
			listofproduct[9] = product10;
		return listofproduct;
	}
	public static Product[] setlistofproductafter(Product[] allproduct) {
		allproduct =getListofproduct();
		return allproduct;
	}
	Catalogue(Admin admin, Product[] list, String su, Catalogue[] subcat){
		this.admin=admin;
		Catalogue.listofproduct=list;
		this.sub=su;
		this.subcatalog=subcat;
	}
	public Catalogue() {
	}
	public void setListofproduct(Product[] listofproduct) {

		Catalogue.listofproduct = listofproduct;
	}

	public Catalogue[] getSubcatalog() {
		return subcatalog;
	}

	public void setSubcatalog(Catalogue[] subcatalog) {
		this.subcatalog = subcatalog;
	}
	public Product[] Deleteitem(String j,Product[] listofproduct) {

		return listofproduct;
		
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public void setProductid(String productid) {
		ProductId = productid;
	}
	public static Product[] DeletItem(String deleteid, Product[] allproduct) {
		Catalogue cat = new Catalogue();
		setlistofproductafter(allproduct);
		for (int i = 0; i < listofproduct.length; i++) {
			System.out.println("_____________________________________________________");
			System.out.println("S.no    Type product      Items,value,id ");
			System.out.println("1 .     Product ID     : " + allproduct[i].getProductId());
			System.out.println("2 .     Product Name   : " + allproduct[i].getProductName());
			System.out.println("3 .     Product cost   : " + allproduct[i].getCost());
			System.out.println("_____________________________________________________");
		}
		for (int i = 0; allproduct[i].getProductId().equals(deleteid) == true; i++) {
			if (allproduct[i].getProductId().equals(deleteid) == true) {
				System.out.println("selected Item Detail given below : ");
				System.out.println("_____________________________________________________");
				System.out.println("S.no    Type product      Items,value,id ");
				System.out.println("1 .     Product ID     : " + allproduct[i].getProductId());
				System.out.println("2 .     Product Name   : " + allproduct[i].getProductName());
				System.out.println("3 .     Product cost   : " + allproduct[i].getCost());
				System.out.println("_____________________________________________________");
				allproduct[i].setProductId(null);
				allproduct[i].setCost(null);
				allproduct[i].setProductName(null);
				System.out.println("after Deleted item  : ");
				System.out.println("_____________________________________________________");
				System.out.println("S.no    Type product      Items,value,id ");
				System.out.println("1 .     Product ID     : " + allproduct[i].getProductId());
				System.out.println("2 .     Product Name   : " + allproduct[i].getProductName());
				System.out.println("3 .     Product cost   : " + allproduct[i].getCost());
				System.out.println("_____________________________________________________");
			}
					
		}
		return allproduct;
	}

}
