package _08_Methods_Metotlar;

import java.util.Arrays;

public class _03_MetotSorular {

	public static void main(String[] args) {

		System.out.println("Soru_01");
		int[] dizi1={4,2,5,2,6};
		System.out.println(ortalamaHesapla(dizi1));

		System.out.println("Soru_02");
		System.out.println(tekMi(13));

		System.out.println("Soru_03");
		int[] dizi2={1,2,0,2,9,3};
		System.out.println(Arrays.toString(sirala(dizi2)));

		System.out.println("Soru_04");
		System.out.println(usHesapla(2,5));

		System.out.println("Soru_05");
		System.out.println(kelimeTersCevir("Hakan Gökhan Volkan Sultan"));

		System.out.println("Soru_06");
		System.out.println(asalMi(13));

		System.out.println("Soru_07");
		int[] dizi3={1,7,0,5,9,3};
		System.out.println(Arrays.toString(diziCarp(dizi3,2)));
		
		System.out.println("Soru_08");
		int[] dizi4={2,4,0,6,2,3};
		System.out.println(Arrays.toString(enBuyukNSayi(dizi4,3)));
		
		System.out.println("Soru_09");
		String[] dizi5 = {"Hakan", "Gökhan", "Volkan", "Sultan"};
		System.out.println(ayiriciEkle(dizi5,"-"));
		
		System.out.println("Soru_10");
		int[] dizi6={1,9,0,5,8,1};
		System.out.println(Arrays.toString(tekSayiDizisi(dizi6)));
		
		System.out.println("Soru_11");
		double[] dizi7={1.7,0.5,9.3,1.2,0.2,9.3};
		System.out.println(ortalama(dizi7));
		
		System.out.println("Soru_12");
		String metin="Hakan Kılıçaslan: 12.02.1993";
		System.out.println("Küçük harf sayısı: "+kucukHarfSay(metin));
        System.out.println("Büyük harf sayısı: "+buyukHarfSay(metin));
        System.out.println("Rakam sayısı: "+rakamSay(metin));
        System.out.println("Harf ve rakam harici karakter sayısı: "+harfRakamHaricSay(metin));
		
	}

	//Soru_01: Bir tam sayı dizisini parametre olarak alan ve dizideki sayıların ortalamasını hesaplayarak geri döndüren bir metot yazınız.
	public static double ortalamaHesapla(int[] sayilar) {
		int toplam=0;
		for (int i : sayilar) {
			toplam+=i;
		}
		return (double)toplam/sayilar.length; //ortalamamız double olacağı için virgülden sonrasını kaybetmemek için ve return type ile uyumlu olması için return değerini double yapıyoruz.
	}

	//Soru_02: Bir tam sayı parametre alan ve sayının tek olup olmadığını kontrol eden bir metot yazınız.
	public static boolean tekMi(int sayi) {
		if(sayi%2!=0)
			return true;
		else
			return false;
	}

	//Soru_03: Bir tam sayı dizisi parametre alan ve diziyi küçükten büyüğe doğru sıralayarak geri döndüren bir metot yazınız.
	public static int[] sirala(int[] sayilar) {
		Arrays.sort(sayilar);
		return sayilar;
	}

	//Soru_04: İki tam sayı parametre alan ve taban üzeri üs işlemini hesaplayarak sonucu geri döndüren bir metot yazınız.
	public static int usHesapla(int taban, int us) {
		int sonuc=1;
		for(int i=1; i<=us; i++) {
			sonuc*=taban;
		}
		return sonuc;
	}

	//Soru_05: Bir metin parametre alan ve metindeki her kelimeyi tersine çevirerek geri döndüren bir metot yazınız.
	public static String kelimeTersCevir(String metin) {
		String[] kelimeler=metin.split(" "); //metin içindeki her boşluk sonrası ayırması için split metotunu kullanıyoruz ve elemanları kelimeler dizisi içine ekliyoruz.
		StringBuilder tersMetin=new StringBuilder(); //StringBuilder kullanarak tersMetin adında boş bir String nesnesi oluşturuyoruz.
		for (String kelime : kelimeler) { //foreach döngüsüyle kelimeler dizisindeki her elemanı dolaşıyoruz.
			String tersKelime=new StringBuilder(kelime).reverse().toString(); //StringBuilder kullanarak tersKelime adında boş bir String nesnesi oluşturuyoruz ve kelimeleri reverse metotu ile ters çevirip tersKelimeye aktarıyoruz.
			tersMetin.append(tersKelime).append(" "); //tersMetine append metotu ile tersKelimeleri atıyoruz ama aralarına boşluk eklesin diye boşlukta ekleyerek atıyoruz. 
		}
		return tersMetin.toString().trim(); //tersMetini yazdırırken başında ve sonundaki gereksiz boşlukları silmesi için trim metotu kullanıyoruz.
	}

	//Soru_06: Bir tam sayı parametre alan ve sayının asal olup olmadığını kontrol eden metot yazınız.
	public static boolean asalMi(int sayi) {
		if (sayi<2) {
			return false;
		}
		for (int i=2; i<sayi; i++) {
			if (sayi%i==0) {
				return false;
			}
		}
		return true;
	}

	//Soru_07: Bir tam sayı dizisi ve bir tam sayı parametre alan ve dizideki her sayıyı, girilen ikinci parametredeki değer ile çarparak yeni bir dizi oluşturan ve geri döndüren bir metot yazınız.
	public static int[] diziCarp(int[] sayilar, int carpan) {
		int[] sonuc=new int[sayilar.length];
		for (int i=0; i<sayilar.length; i++) {
			sonuc[i]=sayilar[i]*carpan;
		}
		return sonuc;
	}
	
	//Soru_08: Bir tam sayı dizisi ve bir tam sayı parametre alan ve dizideki en büyük n kadar sayıyı içeren yeni bir dizi oluşturan ve geri döndüren bir metot yazınız.
	public static int[] enBuyukNSayi(int[] sayilar, int n) {
		Arrays.sort(sayilar); //İlk olarak sayilar dizimizi küçükten büyüğe sıraladık.
		int[] sonuc=new int[n]; //Kullanıcının istediği kadar en büyük sayılardan bir dizi oluşturacağımız için dizimizin eleman sayısı kullanıcının istediği sayı kadar olmalıdır.
		for (int i=0; i<n; i++) { //Döngümüz yeni dizimizin uzunluğu kadar döneceği için kullanıcının istediği sayıya kadar dönüyor.
			sonuc[i]=sayilar[sayilar.length-i-1]; //sort metotu ile sıraladığımız için sayilar dizisinin son elemanı dizinin en büyük elemanı oluyor. Bundan dolayı bu elemanı sonuc dizisinin ilk elemanına gönderiyoruz ve kullanıcının istediği sayı kadar olan elemanları yazdırıyoruz.
		}
		return sonuc;
	}
	
	//Soru_09: Bir metin dizisi ve bir ayırıcı parametre alan ve dizideki tüm kelimeleri ayırıcı ile birleştirerek geri	döndüren bir metot yazınız.
	public static String ayiriciEkle(String[] kelimeler, String ayirici) {
		StringBuilder birlesikMetin=new StringBuilder();
		birlesikMetin.append(kelimeler[0]);
		for (int i=1; i<kelimeler.length; i++) {
	        birlesikMetin.append(ayirici).append(kelimeler[i]);
	    }
		return birlesikMetin.toString();
	}
	
	//Soru_10: Bir tam sayı dizisi parametre alan ve dizideki tek sayıları içeren yeni bir dizi oluşturan ve geri döndüren bir metot yazınız.
	public static int[] tekSayiDizisi(int[] sayilar) {
		int[] tekSayilar = new int[sayilar.length];
		int index=0;
		for (int sayi : sayilar) {
			if(sayi%2==1) {
				tekSayilar[index]=sayi;
				index++;
			}
		}
		return Arrays.copyOf(tekSayilar, index);
		//tekSayilar dizisinin eleman sayısı tek sayı adeti kadar ama sayilar dizisinde çift elemanlarda olduğu için eleman sayısı daha fazla olabilir.
		//tekSayilar dizimizin uzunluğunu yukarıda sayilar dizisinin uzunluğu kadar belirledik ama tekSayilar daha az elemandan oluşacağı için copyOf metotu ile sadece index kadarını kopyalayarak diziye aktardık. Geriye null olarak kalmış olan boş elemanları yazdırmamış olduk.
	}
	
	//Soru_11: Bir double dizisi parametre alan ve dizideki sayıların ortalamasını hesaplayan ve geri döndüren bir metot yazınız.
	public static double ortalama(double[] sayilar) {
		double toplam=0;
		for (double sayi : sayilar) {
			toplam+=sayi;
		}
		return toplam/sayilar.length;
	}
	
	//Soru_12: Verilen metin içindeki uygun karakter sayılarını kücükHarfSay(), buyukHarfSay(), rakamSay(), harfRakamHaricSay() metodlarını yazarak yazdırınız.
	public static int kucukHarfSay(String metin) {
		int kucukHarfSayisi=0;
        for (int i=0; i<metin.length(); i++) {
            char karakter=metin.charAt(i);
            if (Character.isLowerCase(karakter)) { //Metin içindeki karakterlerimiz içinde küçük harf olduğunda sayımızı artırıyoruz.
                kucukHarfSayisi++;
            }
        }
        return kucukHarfSayisi;
    }
	public static int buyukHarfSay(String metin) {
        int buyukHarfSayisi=0;
        for (int i=0; i<metin.length(); i++) {
            char karakter=metin.charAt(i);
            if (Character.isUpperCase(karakter)) { //Metin içindeki karakterlerimiz içinde büyük harf olduğunda sayımızı artırıyoruz.
                buyukHarfSayisi++;
            }
        }
        return buyukHarfSayisi;
    }
	public static int rakamSay(String metin) {
        int rakamSayisi=0;
        for (int i=0; i<metin.length(); i++) {
            char karakter=metin.charAt(i);
            if (Character.isDigit(karakter)) { //Metin içindeki karakterlerimiz içinde rakam olduğunda sayımızı artırıyoruz.
                rakamSayisi++;
            }
        }
        return rakamSayisi;
    }
	public static int harfRakamHaricSay(String metin) {
        int harfRakamHaricSayisi=0;
        for (int i=0; i<metin.length(); i++) {
            char karakter=metin.charAt(i);
            if (!Character.isLetterOrDigit(karakter)) { //Metin içindeki karakterlerimiz içinde harf ya da rakam olmayan karakterleri bulması için harf ve karakter olmayan karakterler olduğunda sayımızı artırıyoruz.
                harfRakamHaricSayisi++;
            }
        }
        return harfRakamHaricSayisi;
    }
}
