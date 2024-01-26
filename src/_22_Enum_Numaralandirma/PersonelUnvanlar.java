package _22_Enum_Numaralandirma;

/*
 * Enum enumaration(numaralandırma) ifadesinin kısaltmasıdır. Enum bir değişken yalnızca bir dizi değerden birisini alabilcekse kullanılır.
 * Her bir enum değeri arka planda sayısal değerle tutulur. Herhangi bir değişiklik yapılmamışsa o sayısal değer index gibi 0'dan başlar.
 * Enumlarla kalıtım yapamayız. Constructor kullanabiliriz ama public tanımlayamayız hata alırız private tanımlamamız gerekiyor.
 * Elemanların sadece buradan üretilmesini yani sadece buradaki elemanların kullanılmasını istediğimiz için private tanımlıyoruz.
 * Bu şekilde başka bir sınıfta enum nesnesinin oluşturulmasını engelliyoruz çünkü enum içine bir şey eklenmesini istemiyoruz. 
 * Eğer fields ve constructor kullanacaksak, enum değerlerinin en sonuncusundan sonra ; koymak zorundayız. 
 * Enum içindeki değerleri de yazarken final tanımlamalarda olduğu gibi tamamını büyük harfle yazmalıyız.
 * Enum içinden bir constructor çalıştırdığımızda içindeki tüm elemanlar için constructor çalışmış olur.
 * Bu yapının içindeki tüm enum değerleri elemanları public, static ve final'dir. 
 *
 * 3 tane kullanılabilecek önemli metodu var.
 * 1-> ordinal(): enum içindeki elemanların dizi mantığında indexini tutuyor.
 * 2-> values():  enum içindeki tüm elemanları bir dizi olarak dönüyor.
 * 3-> name():    enum value döner.
 * 
 */

public enum PersonelUnvanlar {

	//Boş constructor tanımlanmadığı için elemanların hepsini dolu constructor içindeki parametreleri tanımlayarak oluşturuyoruz.
	//MÜDÜR("MÜDÜR",10), şeklinde elemanları da Java desteklediği için Türkçe karakter oluşturabiliyoruz ama genelde Türkçe karakter kullanmaktan kaçınıyoruz.
	MUDUR("MÜDÜR",10),
	MUHENDIS("MÜHENDİS",20),
	MUHASEBECI("MUHASEBECİ",30),
	HIZMETLI("HİZMETLİ",40);
	
	 //Nesne Değişkenleri:
	String unvan;
	int no;
	
	//Dolu Constructor:
	private PersonelUnvanlar(String unvan, int no) { //Dışarıdan enum'a eklenme yapılmasını istemediğimiz için private olarak tanımlıyoruz. public yapmaya çalışırsak hata alırız.
		System.out.println("PersonelUnvanlar constructor çalıştı.");
		this.unvan = unvan;
		this.no = no;
	}

	//Getters and Setters:
	public String getUnvan() {
		return unvan;
	}

	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	
}
