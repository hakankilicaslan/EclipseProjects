package _01_DecisionStructures_KararYapilari;

public class Soru_02_If {

	public static void main(String[] args) {
		
		//Kullanıcıdan verilen soruya doğru cevap verip vermediğini kontrol etmeniz gerekiyor.
		//Doğru cevapta "Tebrikler! Doğru cevap" yanlış cevapta "Maalesef yanlış cevap, tekrar dene" mesajı gösterilecek.
		
		int soru=50;
		int cevap=30;
		
		if(soru==cevap)
			System.out.println("Tebrikler! Doğru cevap");
		else 
			System.out.println("Maalesef yanlış cevap, tekrar dene");
		
		String dogruCevap="Ankara";
		String userAnswer="İstanbul";
		
		if(dogruCevap.equals(userAnswer))
			System.out.println("Tebrikler! Doğru cevap");
		else 
			System.out.println("Maalesef yanlış cevap, tekrar dene");
		
 }
}
