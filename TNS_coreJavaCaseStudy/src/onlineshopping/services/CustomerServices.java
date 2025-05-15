package onlineshopping.services;

import java.util.ArrayList;
import java.util.List;

import onlineshopping.entities.Customer;

public class CustomerServices {
	
	private List<Customer> customerList = new ArrayList<>();
	
	public void addCustomer(Customer customer) {
		customerList.add(customer);
	}

	//Retrieve customer by ID
	public Customer getCustomer(int userId) {
		return customerList.stream()
				.filter(customer -> customer.getUserId() == userId)
				.findFirst()
				.orElse(null);
	}

	public List<Customer> getCustomers() {
		return customerList;
	}
}
