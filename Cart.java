
public class Cart {
private String	cartId;
 public Product[] listOfProducts;

public String getCartId() {
	return cartId;
}

public void setCartId(String cartId) {
	this.cartId = cartId;
}

public Product[] getListOfProducts() {
	return listOfProducts;
}

public void setListOfProducts(Product[] listOfProducts) {
	this.listOfProducts = listOfProducts;
}
public Boolean checkOut() {
	return true;
}


}
