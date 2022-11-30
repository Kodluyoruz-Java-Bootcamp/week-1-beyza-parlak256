/* 
   Aşağıdaki şekilleri ayrı ayrı metodlarla çizdir.
 
   	*         	* 
    **		   **
    *** 	  ***
    ****   	 ****
    ***** 	*****
*/

public class Main {
	public static void main(String[] args) {
		
		dikUcgen();
		System.out.println();
		simetrikTersDikUcgen();
		
	}
	
	public static void dikUcgen() {
		for(int a=0;a<5;a++){
			for(int b=0;b<=a;b++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
public static void simetrikTersDikUcgen() {
	int n = 5;
	for(int i = 0; i < n; i++) {
		for(int j = -n; j <= n; j++) {
			if(-(n-i) < j && j < n -i) {
				System.out.print(" ");
			} 
			else {
				System.out.print("*");
			}
		}
		System.out.println();
		}
	}
}













