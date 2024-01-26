package _17_ArrayList_DiziListesi;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListGırıs {

	public static void main(String[] args) {
		
		
		/* 
		 * int[] dizi= {4,5,6,0};
		 * Dizinin sıkıntıları:
		 * Dizinin boyutunu başta belirtmek sıkıntılı
		 * Dizinin boyutunu değiştirmek sıkıntılı
		 * Diziden eleman silmek sıkıntılı
		 * Diziye herhangi bir indexe eleman eklemek sıkıntılı
		 * Tek tip eleman girmek zorundasın.
		 * Ama dizi bazı durumlarda daha hızlı çalışabiliyor.
		 * Buna benzer bazı sıkıntılarda kurtulacak ArrayList yapısı var.
		 */
		
		//ArrayList oluşturma: String türünde bir arabalar dizi listesi oluşturuyoruz. java.util.ArrayList import ederek kullanıyoruz. Default size olarak kendisi 10 alıyor.
		ArrayList<String> arabalar=new ArrayList<>(); //ArrayList oluştururken Primitive Type kullanamıyoruz onun yerine Reference Type kullanmalıyız.
		
		//ArrayListe eleman eklemek için .add kullanıyoruz:
		arabalar.add("Audi");
		arabalar.add("BMW");
		arabalar.add("Mercedes");
		
		//ArrayListteki elemanları yazdıralım:
		System.out.println(arabalar); //arabalar.toString() diyerekte çağırabiliriz.
		
		//for döngüsüyle elemanları yazdıralım:
		for (int i = 0; i < arabalar.size(); i++) { //Eleman sayısını belirtmek için length() yerine ArrayListte size() kullanıyoruz.
			System.out.println(i+1+". eleman: "+arabalar.get(i)); //ArrayListte elemanı çağırmak için .get(i) kullanıyoruz.
		}
		
		//Araya eleman ekleme: .add() kullanarak önce elemanı hangi indexe ekleyeceksek onu yazıyoruz daha sonra ekleyeceğimiz elemanı yazıyoruz. Elemanı ekleyip sonraki elemanları bir kaydırıyor.
		arabalar.add(1,"Volkswagen");
		arabalar.add(3,"Volvo");
		//arabalar.add(7,"Seat"); //Audi eklendikten sonra son index 4 olduğu için ArrayListimizin indexlerinin dışında bir index girerek ekleme yapamıyoruzyani size()'dan büyük giremiyoruz hata veriyor.
		
		//Listeden eleman çıkarma: .remove() kullanarak hangi indexteki elemanı kaldırmak istiyorsak onun indexini yazarak listeden çıkarmasını sağlıyoruz.
		arabalar.remove(2);
		
		//foreach döngüsüyle elemanları yazdıralım:
		for (String araba : arabalar) {
			System.out.println(araba);
		}
		
		//Integer ArrayList oluşturma: 0-100 arası rastgele 10 sayı tutan ArrayListi yazdıralım.
		ArrayList<Integer> sayilar=new ArrayList<>();
		Random rnd=new Random();
		for (int i = 1; i <= 10; i++) {
			int sayi=rnd.nextInt(101); 
			sayilar.add(sayi);
		}System.out.println(sayilar);
		
		arrayListYazdir(sayilar); //Main metot dışına çağıracağımız metodu yazmadan burada çağırmaya çalışırsak hata alıyoruz ama program bize hata kısmında main metot dışına eklemek için metot oluşturmayı teklif ediyor. 
		
	}
	
	//ArrayListin içindeki elemanları alt alta metot ile yazdıralım.
	private static void arrayListYazdir(ArrayList<Integer> sayilar) {
		for (Integer sayi : sayilar) {
			System.out.println(sayi);
		}
	}
	
}
