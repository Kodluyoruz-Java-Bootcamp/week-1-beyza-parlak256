import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// Collection Framework -> 1.set<E>, 2.list<E>, 3.Map<K, V>
		
		// 1.Set<E> -> HashSet<E>
		// Veriler hashleme yöntemi ile tutulur
		HashSet<String> meyveler = new HashSet<String>();
		meyveler.add("Muz");
		meyveler.add("Çilek");
		meyveler.add("Erik");
		
		// Aynı eleman ekleyelim
		meyveler.add("Erik");
		// null ekleyelim
		meyveler.add(null);
		
		System.out.print("HashSet -> ");
		meyveler.forEach(meyve -> System.out.print(meyveler + " "));
		// Çıktı HashSet -> [null, Muz, Çilek, Erik] [null, Muz, Çilek, Erik] [null, Muz, Çilek, Erik] [null, Muz, Çilek, Erik] 

	
		//  1.Set<E> -> TreeSet<E>
		// TreeSet’lerde elementler artan sıralama ile kaydolur
		TreeSet<Integer> agaç = new TreeSet<Integer>();
		agaç.add(4);
		agaç.add(12);
		agaç.add(0);
		agaç.add(10);
		agaç.add(20);
		
		// Tekrar eden eleman kaydetmez
		agaç.add(10);
		
		System.out.print("\nTreeSet -> ");
		agaç.forEach(sayi -> System.out.print(sayi + " "));
		// Çıktı TreeSet -> 0 4 10 12 20 
		
		
		// 2. List<E> ->  ArrayList<E>
		// Arama işlemleri sık yapılacak ise de ArrayList daha avantajlı
		ArrayList<String> arabalar = new ArrayList<String>();
		arabalar.add("Audi");
		arabalar.add("BMW");
		arabalar.add("Citroen");
		arabalar.add("Fiat");
		arabalar.add("Volvo");
		arabalar.add("Skoda");
		
		// Tekrarlı eleman ekliyoruz.
		arabalar.add("BMW");
		arabalar.add("Citroen");
		
		// İstediğimiz index'e eleman ekliyoruz.
		arabalar.add(5,"Fiat");
		System.out.print("\nArrayList -> ");
		arabalar.forEach(araba -> System.out.print(arabalar + " "));
		// Çıktı ArrayList -> [Audi, BMW, Citroen, Fiat, Volvo, Fiat, Skoda, BMW, Citroen] [Audi, BMW, Citroen, Fiat, Volvo, Fiat, Skoda, BMW, Citroen] [Audi, BMW, Citroen, Fiat, Volvo, Fiat, Skoda, BMW, Citroen] [Audi, BMW, Citroen, Fiat, Volvo, Fiat, Skoda, BMW, Citroen] [Audi, BMW, Citroen, Fiat, Volvo, Fiat, Skoda, BMW, Citroen] [Audi, BMW, Citroen, Fiat, Volvo, Fiat, Skoda, BMW, Citroen] [Audi, BMW, Citroen, Fiat, Volvo, Fiat, Skoda, BMW, Citroen] [Audi, BMW, Citroen, Fiat, Volvo, Fiat, Skoda, BMW, Citroen] [Audi, BMW, Citroen, Fiat, Volvo, Fiat, Skoda, BMW, Citroen] 
		
		
		// 2. List<E> ->  LinkedList<E>
		// Ekleme ve silme işlemleri sık yapılacaksa LinkedList kullanmak daha avantajlı
		LinkedList<String> arabalar1 = new LinkedList<String>();
		arabalar1.add("Volkswagen");
		arabalar1.add("Hyundai");
		arabalar1.add("Renault");

		// İstediğimiz index'e eleman ekliyoruz.
		arabalar.add(4, "BMW");
		System.out.print("\nLinkedList -> ");
		arabalar.forEach(araba -> System.out.print(arabalar1 + " "));
		// Çıktı LinkedList -> [Volkswagen, Hyundai, Renault] [Volkswagen, Hyundai, Renault] [Volkswagen, Hyundai, Renault] [Volkswagen, Hyundai, Renault] [Volkswagen, Hyundai, Renault] [Volkswagen, Hyundai, Renault] [Volkswagen, Hyundai, Renault] [Volkswagen, Hyundai, Renault] [Volkswagen, Hyundai, Renault] [Volkswagen, Hyundai, Renault] 
		
		
		// 3. Map<K,V> ->  HashMap<K,V>
		// null key ve null value
		HashMap<String, String> yemekler = new HashMap<String, String>();
		yemekler.put("imam bayıldı", "patlıcan");
		yemekler.put("mercimek çorbası", "kırmızı mercimek");
		yemekler.put("pirinç pilavı", "pirinç");
		System.out.println("\nHashMap<K,V>");
		yemekler.forEach((ad, malzeme) -> System.out.print(ad + " - " + malzeme + " , "));
		// Çıktı HashMap<K,V>
		// imam bayıldı - patlıcan , mercimek çorbası - kırmızı mercimek , pirinç pilavı - pirinç , 
	}

}
