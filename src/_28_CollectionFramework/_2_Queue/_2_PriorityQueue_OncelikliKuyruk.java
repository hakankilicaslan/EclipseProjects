package _28_CollectionFramework._2_Queue;

import java.util.PriorityQueue;

public class _2_PriorityQueue_OncelikliKuyruk {

	public static void main(String[] args) {

		//PriorityQueue(Öncelikli Kuyruk): Queue ile aynı mantıkta ama arka planda bir önceliğe göre sıralama yapıyor.
		
		PriorityQueue<Integer> oncelikliKuyruk=new PriorityQueue<>(); //PriorityQueue bir sınıf olduğu için direkt kendisinden nesne oluşturabildik.
		
		//add() ya da offer() ile ekleme yaparken ilk eleman ya da son eleman olarak ekler diye ifade etmiyor.
		oncelikliKuyruk.add(93);
		oncelikliKuyruk.add(17);
		oncelikliKuyruk.add(5);
		oncelikliKuyruk.add(12);
		oncelikliKuyruk.add(2);
		
		System.out.println(oncelikliKuyruk); //Elemanları ekledikten sonra yazdırmak istediğimizde genelde ilk eleman olarak en küçük sayıyı tutuyor ama geri kalanları doğal sıralamaya göre yazdırmıyor.
		
		while (!oncelikliKuyruk.isEmpty()) {
			System.out.println(oncelikliKuyruk.poll()); //while döngüsü içinde poll() ile gezdiğimizde bu kez doğal sıralamaya göre yazdırıyor.
		}
		
	}

}
