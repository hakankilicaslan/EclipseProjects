package _02_LoopStructures_Donguler;

public class Soru_26_For_If {

	public static void main(String[] args) {
		
		// 1'den 50'ye kadar olan sayıların sadece 3'ün katı olan sayıları for döngüsüyle yazdıralım.
		
		for (int i = 1; i <=50; i++) {
			if(i%3==0)
				System.out.println(i);
		}
	}
}
