package _02_LoopStructures_Donguler;

public class Soru_28_For_If {

	public static void main(String[] args) {
		
		//1'den 100'e kadar olan sayıların 3'ün katlarında "3KAT", 5'in katlarında "5KAT" ve 15'in katlarında da "15KAT" diye for döngüsüyle yazdıralım.

		for (int i = 1 ; i <=100 ; i++) {
			if(i%15==0)
				System.out.println(i+" sayısı 15'in katıdır");
			else if(i%5==0)
				System.out.println(i+" sayısı 5'in katıdır");
			else if(i%3==0)
				System.out.println(i+" sayısı 3'ün katıdır");
			else 
				System.out.println(i);
		}
	}
}
