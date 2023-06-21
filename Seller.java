
public class Seller extends User {
 Product[] productsListed;
 private SellerProduct  sellerProduct ;
	@Override
	public Boolean verifyUser() {
		return true;
		
	}
	public Product[] getProductsListed() {
		return productsListed;
	}
	public SellerProduct setProductsListed(Product[] productsListed) {
		this.productsListed = productsListed;
		return null;
	}
	public SellerProduct getSellerProduct() {
		return sellerProduct;
	}
	public void setSellerProduct(SellerProduct sellerProduct) {
		this.sellerProduct = sellerProduct;
	}
	
	
	
		
}
