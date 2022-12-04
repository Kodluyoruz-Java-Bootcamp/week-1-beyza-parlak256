import java.util.ArrayList;

public class MyList implements Interface{
	private String name;
	
	// Default kapasitesi 5 olmalıdır
	ArrayList myList = new ArrayList(5);
	
	// Constructor method
	public MyList(String name) {
		super();
		this.name = name;
	}

	// Boş constructor method, eziyoruz
	public MyList() {
		super();
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// Add methodu sadece ‘C’ harfiyle başlayan string ifadeleri listeye eklemelidir
	@Override
	public void add(String name) {
		if(name.substring(0) == ("C")) {
			myList.add(name);
		}
	}
	
	// Print methodu bütün listeyi ekrana yazdırmalıdır
	@Override
	public void print() {
		for (Object object : myList) {
			System.out.println(myList);
		}
	}
	
	 

}
