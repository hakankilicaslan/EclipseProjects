package _28_CollectionFramework._1_List;

import java.util.LinkedList;

public class _2_LinkedList_BaglantiliListe {

	public static void main(String[] args) {
		
		/*
		 * ArrayList vs LinkedList
		 * ArrayList içine araya eleman eklemek istediğimizde ondan sonraki elemanların hepsini kaydırmak zorunda kalıyor.
		 * LinkedList ise kendisinden önceki ve sonraki elemanın adresini gösterdiği için araya eleman eklerken kaydırma yapmıyor sadece eklenen elemanın adresini önceki ve sonraki eleman göstermeye başlıyor.
		 * Sürekli ekleme silme işlemleri yapılacaksa LinkedList daha performanslıdır.
		 * Elemanlara erişme açısından ArrayList daha performanslı. Arama işlemlerinde ArrayList daha performanslıdır.
		 * ArrayList Dizi tabanlıyken, LinkedList çift yönlü bağlı liste yapısını kullanır.(Data Structures)
		 * LinkedListte nodelar ve pointer vardır.
		 * İkisinin de boyutu dinamiktir. İkisinde de List üzerindeki interfacelerdeki metotları kullanabilirsiniz.
		 * 
		 * LinkedList içinde olup ArrayListte olmayan metotlar vardır. Bunlardan bazıları: 
		 * addFirst, addLast, getFirst, getLast, removeFirst, removeLast, offer, push, pop ve
		 * poll ve bunların First Last metotları, peek ve bunların First Last metotları
		 * 
		 */
		
		LinkedList<String> linkedlist=new LinkedList<>();
		
		//add()     Metodu: LinkedListin sonuna ekleme yapar. Diğer kullanımı önce eklenecek index numarasını sonra oraya eklenecek elemanı yazarakta ekleme yapabiliriz. add(index,eklenecekDeğer)
		//offer()   Metodu: add() metoduyla aynı işi yapar ekleme başarılı olduysa true döner.
		//addLast() Metodu: add() metodu gibi listenin sonuna eleman ekleme yapar. add() metoduyla farkı add() metodu eleman ekleme başarılı olduysa geriye true döner addLast() geriye bir şey dönmez.
		linkedlist.add("Volkan");
		linkedlist.add("Hakan");
		linkedlist.add("Selma"); 	
		linkedlist.offer("Burcu");
		linkedlist.addLast("Seda");
		linkedlist.add(2,"Gökhan");
		
		System.out.println(linkedlist); //Buraya kadar kullandıklarımız listenin sonuna ya da index girerek o indexe eleman ekliyor.
		
		System.out.println("----------------------------------------");
		
		//addFirst() Metodu: Listenin başına eleman ekleme yapar.
		//push()     Metodu: addFirst() metoduyla aynı işi yapar listenin başına eklemeye yapar.
		linkedlist.addFirst("Burak"); 
		linkedlist.push("Gökçen");
		System.out.println(linkedlist); //Bu kısımdakiler listenin başına ekleme yapıyor.
		
		System.out.println("----------------------------------------");
		
		//indexOf() Metodu: Aradığımız elemanın listedeki indexini geri döner. O elemandan birden fazla varsa ilk gördüğü elemanın indexini döner. Eğer yoksa -1 döner. indexOf(ArananEleman)
		System.out.println(linkedlist.indexOf("Hakan"));
		
		System.out.println("----------------------------------------");
		
		//getFirst()  Metodu: Listenin başındaki elemanı getirir.
		//peekFirst() Metodu: Listenin başındaki elemanı getirir.
		//peek()      Metodu: Listenin sonundaki elemanı getirir.
		//getLast()   Metodu: Listenin sonundaki elemanı getirir.
		//peekLast()  Metodu: Listenin sonundaki elemanı getirir.
		System.out.println(linkedlist.getFirst());
		System.out.println(linkedlist.peekFirst());
		System.out.println(linkedlist.peek());
		System.out.println(linkedlist.getLast());
		System.out.println(linkedlist.peekLast());
		
		System.out.println("----------------------------------------");
		
		//remove()      Metodu: Listenin ilk elemanı kaldırmamıza silmemizi sağlıyor eğer liste boşsa hata fırlatır.
		//removeFirst() Metodu: remove() metodu gibi ilk elemanı siler eğer liste boşsa hata fırlatır.
		//poll()        Metodu: remove() metodu gibi ilk elemanı siler eğer liste boşsa geriye null döner.
		//pollFirst()   Metodu: remove() metodu gibi ilk elemanı siler.
		//pop()         Metodu: remove() metodu gibi ilk elemanı siler. Sildiği elemanı döndüğü için bir değişkende tutabiliriz.
		//removeLast()  Metodu: remove() metodu gibi çalışır ama sondaki elemanı siler.
		linkedlist.remove();
		linkedlist.removeFirst(); 
		linkedlist.poll(); 
		linkedlist.pollFirst(); 
		linkedlist.pop();
		linkedlist.removeLast();
		System.out.println(linkedlist);
				
	}

}
