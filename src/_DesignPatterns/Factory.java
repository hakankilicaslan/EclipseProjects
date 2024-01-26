package _DesignPatterns;

/*
 * Factory: Fabrika Nesne üretme fabrikası
 * 
 * Neden ihtiyacımız olabilir
 * Bazı nesneleri üretirken bağımlılıktan kaçınmak için
 * Genişletilebilirliği artırmak için üretimi bir fabrikaya bırakabiliriz.
 * 
 * Asıl amacı nesnenin nasıl oluşturulduğunu soyutlamak hatta hangi nesne üretildi onu bile bilmeme gerek kalmayacak.
 * 
 * Bir nakliye firması var. Bu firmanın kamyonları, gemileri, uçakları var.
 * 
 * Adım adım Factory Pattern Kullanımı:
 * 1. Enum yazmalısınız.
 * 2. Abstract class ya da interface yazılmalıyız.
 * 3. Extend edilecek alt sınıflarda abstract class'ı extend edin.
 * 4. Factory sınıfımızı yazmalıyız.
 * 5. Enum'a göre öalışacak switch case yapımızı kurmalıyız.
 * 6. Runnerdan çağırın. 
 * 
 */

public class Factory {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
//		Kamyon kamyon=new Kamyon();
//		kamyon.tasi();
//		
//		Gemi gemi=new Gemi();
//		gemi.tasi();
//		
//		Ucak ucak=new Ucak();
//		ucak.tasi();
//		
//		Tasima tasima=new Tasima();
//		tasima.tasi();
		
		Tasima tasima1=TasimaFactory.builder(ETasimaTip.DENİZ);
		
		Tasima tasima2=TasimaFactory.builder(ETasimaTip.KARA);
		
		Tasima tasima3=TasimaFactory.builder(ETasimaTip.HAVA);
		
		
	}
	
}
