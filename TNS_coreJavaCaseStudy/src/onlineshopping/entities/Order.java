package onlineshopping.entities;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private  int orderId;
	private Customer customer;
	private String status;
	private List<ProductQuantityPair> products;
	
	
	public Order(int orderId, Customer customer) {
		this.orderId = orderId;
		this.customer = customer;
		this.status = status;
		this.products = products;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<ProductQuantityPair> getProducts() {
		return products;
	}

	public void setProducts(List<ProductQuantityPair> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customer=" + customer + ", status=" + status + ", products=" + products
				+ "]";
	}


	public void addProduct(Product product, int quantity) {
	    if (products == null) {
	        products = new ArrayList<>();
	    }
	    products.add(new ProductQuantityPair(product, quantity));
	}





	
	
	
}
