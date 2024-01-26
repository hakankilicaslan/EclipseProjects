package _28_CollectionFramework._1_List;

import java.util.Stack;

public class _4_Stack_Yigin {

	public static void main(String[] args) {
		
		/*
		 * Stack(Yığın, Yığıt) -> LIFO: Last IN First OUT -> son giren ilk çıkar.
		 * 
		 * Üst üste tabak koymak gibi. Genelde işlemleri en son eleman yani en üstteki eleman üzerinden yapıyoruz.
		 * push() ile ekleme yaptığımızda yanına değil üstüne eklemiş gibi oluyor.
		 * Diğerlerindeki gibi listenin başına yani Stackte elemanların en altına ekleme olmuyor.
		 * Ekleme yaparken çıkarırken listenin en üstünden yapabiliyoruz.
		 * Stack Vector sınıfından extend edilmiş bir sınıf genel metotlar stack içinde geçerli.
		 * Sadece Stack sınıfının içinde olan metotlar -> push(), pop(), peek(), empty(), search() metotları
		 * 
		 */
		
		Stack<Integer> stack=new Stack<>();
		
		//push() Metodu: Üstüne eleman ekleme diye geçiyor. Diğer tabirle listenin sonuna en üstüne eleman eklemiş oluyoruz. add() metodu gibi
		stack.push(93);
		stack.push(5);
		stack.push(17);
		stack.push(2);
		stack.push(12);
		System.out.println(stack);
		
		System.out.println("----------------------------------------");
		
		//peek() Metodu: Listenin sonundaki elemana yani en üstteki elemana bakmak ulaşmak için kullanılır.
		System.out.println(stack.peek());
		
		System.out.println("----------------------------------------");
		
		//pop() Metodu: Normalde pop() listenin ilk elemanını siliyordu Stack içinde kullanılınca listenin sonundaki elemanı yani en üstündeki elemanı çıkarmamıza silmemize yarıyor.
		stack.pop();
		System.out.println(stack);
		
		System.out.println("----------------------------------------");
		
		//size() Metodu: Diğerlerindeki gibi liste içindeki eleman sayısını gösteriyor getiriyor.
		System.out.println(stack.size());
		
		System.out.println("----------------------------------------");
		
		//isEmpty() Metodu: Diğerlerindeki gibi listenin boş mu değil mi onu kontrol etmemizi sağlar. Boş ise true değilse false döner.
		System.out.println(stack.isEmpty());
		
	}
	
}
