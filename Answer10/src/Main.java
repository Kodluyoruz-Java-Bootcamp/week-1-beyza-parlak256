
public class Main implements Interface{

	private String[] listes;

	public static void main(String[] args) {
		Order order1 = new Order("Cem", "Teknoloji", 1500, 5, 152);
		Order order2 = new Order("Aslı", "Giyim", 850, 3, 603);
		Order order3 = new Order("Beyza", "Teknoloji", 9500, 9, 153);
		
		Customer customer1 = new Customer(order1, 1002, 28);
		Customer customer2 = new Customer(order2, 1009, 22);
		Customer customer3 = new Customer(order3, 1102, 22);
		
		int[] order = null;
		
		while (true) {
			if(order1.getPrice() > 1500){
				for (int  list: order) {
					System.out.println(list);
				}
			}else if(order2.getPrice() > 1500){
				for (int  list: order) {
					System.out.println(list);
				}
			}else if(order3.getPrice() > 1500){
				for (int  list: order) {
					System.out.println(list);
				}
			}
		}
	}
	
	public String list(Customer customer) {
		Order order4 = new Order("Cem", "Teknoloji", 17300, 2, 159);
		Customer customer4 = new Customer(order4, 1062, 35);
		
		listes = null;
		if(Order.class.getName().substring(0,2) == ("Cem")) {
			for (String  list: listes) {
				System.out.println(list);
			}
		}
		
		if(Order.class.getName().substring(0,2) == ("Cem") || (customer.getAge() < 30 || customer.getAge() > 25)) {
			for(int i = 0; i < 4; i++) {
				int sum=0;
				for (String  list: listes) {
					sum += order.getPrice();
				}
			}
			
		}
		
		return "";
	}
}
