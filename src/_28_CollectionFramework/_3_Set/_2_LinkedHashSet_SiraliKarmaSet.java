package _28_CollectionFramework._3_Set;

import java.util.LinkedHashSet;

public class _2_LinkedHashSet_SiraliKarmaSet {

	public static void main(String[] args) {

		//Yapısal değişiklik dışında HashSet'e göre ekstra bir metodu yok. LinkedList mantığı burada da mevcut yine içindeki verileri bir önceki ve bir sonrakinin adresini gösterecek şekilde tutuyor.
		//HashSet elemanları eklediğimiz sıraya ya da doğal sıralamaya göre tutmuyordu ama LinkedHashSet elemanları eklediğimiz sıraya göre tutuyor.
		
		LinkedHashSet<String> sehirler=new LinkedHashSet<>(); //LinkedHashSet sınıfından yeni bir nesne oluşturup içine String elemanlar alan bir LinkedHashSet referansına atama yapıyoruz ve add() metoduyla String ifadeler ekliyoruz.
		
		sehirler.add("İstanbul");
		sehirler.add("Eskişehir");
		sehirler.add("Kırşehir");
		sehirler.add("Eskişehir");
		sehirler.add("Ankara");
		sehirler.add("Yalova");
		sehirler.add("Ordu");
		
		System.out.println(sehirler); //Elemanları yazdırırken eklediğimiz sıraya göre yazdırıyor. HashSet gibi random yazdırmıyor.
		
		LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();//LinkedHashSet sınıfından yeni bir nesne oluşturup içine Integer elemanlar alan bir LinkedHashSet referansına atama yapıyoruz ve add() metoduyla sayı ekliyoruz.
		
		linkedHashSet.add(12);
		linkedHashSet.add(2);
		linkedHashSet.add(17);
		linkedHashSet.add(5);
		linkedHashSet.add(93);
		
		System.out.println(linkedHashSet); //HashSette yazdırırken rastgele sıralıyordu ama LinkedHashSet ekleme sırasına göre sıralayıp yazdırıyor.
	
	}

}
