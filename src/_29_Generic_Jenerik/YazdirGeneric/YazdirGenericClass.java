package _29_Generic_Jenerik.YazdirGeneric;

public class YazdirGenericClass <T> {

	//Generic Class: Oluşturduğumuz metodun parametre olarak alacağı türü sınıfımızdan nesne oluştururken girilmesini istiyoruz.
	//Nesne oluşturulurken hangi tip girildiyse metodun parametresi içinde o tip verilmiş oluyor. 
	public void yazdir(T[] dizi) {
		for (T item : dizi) {
			System.out.println(item);
		}
	}
	
}
