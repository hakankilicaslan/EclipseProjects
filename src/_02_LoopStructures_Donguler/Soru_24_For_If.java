package _02_LoopStructures_Donguler;

public class Soru_24_For_If {

	public static void main(String[] args) {
		
		// 1'den 10'a kadar olan sayıların faktöriyellerini for döngüsüyle yazdıralım.
		
		int faktoriyel=1;
		
		for (int i = 0 ; i<=10  ; i++) {
			if(i<=1) {
				System.out.println((i+"!="+faktoriyel));
			}else {
			faktoriyel*=i;
			for (int j = 1 ; j <=i ; j++) {
				if(i!=j) 
				System.out.print(j+"*");
				else
					System.out.print(j);
			}System.out.println("="+faktoriyel+"!");
			}
		}
	}
}
