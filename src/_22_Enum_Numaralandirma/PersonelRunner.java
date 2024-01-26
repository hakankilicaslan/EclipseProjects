package _22_Enum_Numaralandirma;

import java.util.Arrays;

public class PersonelRunner {

	public static void main(String[] args) {
		
		/*
		 * Personel p1=new Personel("Hakan", "Ankara", "Müh.");
		 * Personel p2=new Personel("Cem", "Ankara", "Mühendis");
		 * Personel p3=new Personel("Eren", "Ankara", "Mhd.");
		 * Personel p4=new Personel("Ilgın", "Ankara", "Mühen");
		 * 
		 * Yukarıdaki durumda Personel sınıfından 4 tane nesne oluşturduk.
		 * Nesneleri oluştururken constructor içinde istenen Unvan için kullanıcı yukarıdaki gibi farklı farklı yazımlar kullanabilir.
		 * Bu durumda Muhendis olan personelleri getirmek istersek tek tek her durum için farklı yol izlemememiz gerekecek.
		 * Bu durumun önüne geçmek için enum kullanıyoruz. PersonelUnvanlar isminde bir enum tanımladık ve alabileceği değerleri oraya girdik.
		 * Artık kullanıcı nesne oluştururken mecburen bu PersonelUnvanlar enum içindeki değerlerden birini tanımlamak zorunda kalacak.
		 * 
		 */
		
		//Enum çağırıldığı zaman yani enum içindeki bir elemana ulaşmaya çalışırken enum içine bir kere bile uğramış olsak enum içindeki constructor çalıştırılıyor ama elemanlar static olduğundan sınıfa bağlı olduğu için sadece çağırılan eleman değil içindeki her bir elemanı mecburen yaratıyor yani bütün enum ayağa kalkıyor ve hepsi için constructor çalışmış oluyor. Bundan dolayı 4 kere (PersonelUnvanlar constructor çalıştı.) çıktısı verdi.
		
		Personel personel1=new Personel("Hakan", "Ankara", PersonelUnvanlar.MUHENDIS);  //Personel sınıfından bir nesne oluşturuyoruz ama artık unvan tanımlarken PersonelUnvanlar enum içinde belirtilen değerlerden birini atamamız gerekiyor.
		
		System.out.println("--------------------------");
		
		PersonelUnvanlar[] unvanlarDizi=PersonelUnvanlar.values(); //PersonelUnvanlar.values() geriye enum içindeki değerleri bir dizi olarak döndüğü için values() ile aldığımız değerleri unvanlarDizi içine atabiliyoruz.
		System.out.println(Arrays.toString(unvanlarDizi));
		
		System.out.println("--------------------------");
		
		for (PersonelUnvanlar unvanlar : unvanlarDizi) {
			//unvanlar dizisinde .name() ile değeri, .ordinal() ile indexini, .getNo() ile atadığımız no değerini ve .getUnvan() ile de atadığımız String ünvanları yazdırıyoruz.
			System.out.println(unvanlar.name()+"-->"+unvanlar.ordinal()+"-->"+unvanlar.getNo()+"-->"+unvanlar.getUnvan());
		}
		
		System.out.println("--------------------------");
		
		PersonelUnvanlar unvan=personel1.getUnvan(); //personel1 Muhendis olarak tanımlandığı için switch-case içinde case MUHENDIS de olan sout dönüyor.
		
		switch (unvan) {
		case MUDUR:
			System.out.println("Maaş 100_000TL");
			break;
		case MUHENDIS:
			System.out.println("Maaş 90_000TL");
			break;
		case MUHASEBECI:
			System.out.println("Maaş 70_000TL");
			break;
		case HIZMETLI:
			System.out.println("Maaş 50_000TL");
			break;
		default:
			break;
		}
		
	}
	
}
