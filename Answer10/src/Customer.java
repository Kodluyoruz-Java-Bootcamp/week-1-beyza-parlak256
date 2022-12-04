
public class Customer {
	private Order order;
	private int customerNo;
	private int age;
	
	// Constructor metod
	public Customer(Order order, int customerNo, int age) {
		super();
		this.order = order;
		this.customerNo = customerNo;
		this.age = age;
	}
	
	public Order getOrder() {
		return order;
	}
	
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public int getCustomerNo() {
		return customerNo;
	}
	
	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
