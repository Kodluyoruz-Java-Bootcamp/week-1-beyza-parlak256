
public class Order {
	private String name;
	private String category;
	private int price;
	private int stockAmount;
	private Product product;
	private Invoice invoice;
	
	// Constructor metod
	public Order(String name, String category, int price, int stockAmount, Product product, Invoice invoice) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
		this.stockAmount = stockAmount;
		this.product = product;
		this.invoice = invoice;
	}

	// Constructor metod, eziyoruz
	public Order(String string, String string2, int i, int j, int k) {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

}
