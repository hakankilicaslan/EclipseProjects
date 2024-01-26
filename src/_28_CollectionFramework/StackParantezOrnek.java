package _28_CollectionFramework;

import java.util.Scanner;
import java.util.Stack;

public class StackParantezOrnek {
	
	/*
	 * Bir program yazacağız ve dışardan parantezler girilecek javadaki gibi girilen parantez doğru şekilde kapandıysa true değilse false dönsün.
	 * 
	 * { () }  	   TRUE
	 * { [ ( ) ] } TRUE
	 * { }		   TRUE
	 * ( )		   TRUE
	 * { (} )  	   FALSE
	 * (		   FALSE
	 * {([		   FALSE
	 * [()}		   FALSE
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in); //Dışardan parametre alacağımız için önce bir Scanner nesnesi oluşturuyoruz.
		System.out.println("Parantezleri giriniz:");
		String girdi = sc.nextLine(); //Kullanıcının girdiği parametreyi yani parantezleri String bir değişken tutan girdi'ye aktarıyoruz.
		
		System.out.println(parantezKontrol(girdi)); //parantezKontrol metodumuzu çağırıp girilen parantezlerin doğru mu yanlış mı olduğunu yazdırmasını sağlıyoruz.
		
		sc.close(); //sc referansıyla işimiz bittiği için kapatıyoruz.
		
	}

	private static boolean parantezKontrol(String girdi) {
		
		Stack<Character> stack = new Stack<>(); //İçine Character tipinde eleman alan bir Stack oluşturuyoruz.
		
		//girdi=girdi.replaceAll(" ", ""); //Girilen parametre içinde boşluk karakteri varsa onları kaldırmak için replaceAll() metodunu kullanıyoruz.
		
		//Girilen parametre içinde boşluk dışında da karakter girilebileceği için onun yerine replaceAll() metodunu parantezler harici kaldır şekline çeviriyoruz.
		//Metodun sol tarafına ^ sonrasına girilebilecek parantezleri yazıyoruz ve bunların haricinde girilen karakterleri "" ile yer değiştir yani sil diyoruz.
		//Hata verebildiği için parantezleri köşeli parantez içine yazıp aralarına \\ iki tane ters slash koyuyoruz.
		girdi=girdi.replaceAll("[^\\(\\)\\[\\]\\{\\}]", "");
		System.out.println("Girdi temizlenmiş hali: "+girdi); //girdi içinde parantez dışındaki karakterlerin çıkarılmış halini yazdırıyoruz.
				
		if (girdi.length()%2!=0) { //girdi içindeki parantez dışındaki karakterleri kaldırdığımız için artık geriye sadece parantezler kaldı kalan parantezler tek sayı ise bir tanesinin eşleniği olmadığı için direkt false dönsün diye if koşuluna sokup girdinin uzunluğunun tek sayı olup olmadığını kontrol ediyoruz.
			System.out.println("Tek sayıda parantez var!");
			return false;
		}
		
		for (int i = 0; i < girdi.length(); i++) {
			char karakter=girdi.charAt(i); //for döngüsüne sokup charAt() metodu kullanarak karakterleri tek tek karakter değişkeninin içine aktarıyoruz.
			
			if(karakter=='(' || karakter=='{' || karakter=='[') { //if koşuluna sokup girilen parantezler açma parantezi ise push() metoduyla stack içine ekliyoruz.
				stack.push(karakter);
			}
			else if(karakter==')' || karakter=='}' || karakter==']') { //Eğer parantezler kapatma parantezi ise ve stack boşsa yanlış olacağı için false dönüyor.
				if(stack.isEmpty()) {
					System.out.println("Stack boşken kapalı parantez geldi!");
					System.out.println("Stack son durum: "+stack);
					return false;
				}
				//Ascii Code Karşılığı: ( -> 40    ) -> 41    [ -> 91    ] -> 93    { -> 123    } -> 125  olduğu için Tenary içinde eğer karakter ')' ise -1 ile eşleniğine değilse ']' ya da '}' ise  -2 ile eşleniğine eşit oluyor.
				//Stack içine açık parantez ekliyoruz sadece daha sonra stack.peek() diyerek o elemanı alıyoruz ve eşleniği olan kapatma parantezi varsa stack.pop() diyerek stackten o parantezi kaldırıyoruz.
				if( (int) stack.peek() == ( (karakter==')') ? karakter-1 : karakter-2 ) ) {
					stack.pop();
				}else {
					System.out.println("Stack son durum: "+stack);
					return false;
				}
			}
		}
		
		System.out.println("Stack son durum: "+stack);
		return (stack.isEmpty()) ? true : false;
		
	}
	
}
