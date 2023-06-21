
public class Admin extends User {

	Product[] productsListed;
	@Override
	public Boolean verifyUser() {
		return true;
		
	}
	public Product[] getProductsListed() {
		return productsListed;
	}
	public void setProductsListed(Product[] productsListed) {
		this.productsListed = productsListed;
	}

	
}
