

/*
 * 10’dan 100’e kadar olan sayılardan bu prosedürle bir palindromik sayı elde edene kadar 
 * hangi sayı için en uzun zincirin oluşacağını bulan ve zinciri ekrana yazdıran programı yazınız.
 */

public class Main {
		
		// Main method
		public static void main(String[] args) {
			sayiIslemi();
		}
		
		// Method of inverting a number
		private static void sayiIslemi() {
			int[] sayac = new int[90];
			for(int n = 10; n<=100; n++){
		        int ilkdeger = n;        
		        int length = String.valueOf(n).length();
		        int kalan,deger=0;
		        	for (int j = 0; j<length; j++){
		        		while(ilkdeger <= 100) { 
		        			kalan = n % 10;
		        			deger = deger * 10 + kalan;
		        			n = n / 10;
		        			if(ilkdeger==deger) {
		        				System.out.println(ilkdeger + " Polindrome sayıdır.");
		        				sayac[j] = 0;
		        				sayac[j]++;
				        		System.out.println(sayac[j] + " defa zincir döndü..");
		        			}
		        			else {
		        		        System.out.println(ilkdeger + " Polindrom sayı değildir.");
		        			}
		        			ilkdeger++;
		        		}
		        	}
			}
		}
	}













