package _03_StringClass;

import java.util.Scanner;

public class _01_StringMetotlar {

	public static void main(java.lang.String[] args) {
		
		//STRING METOTLAR//
		
		String ad1="Hakan";
		String soyad1=new String ("Kılıçaslan");
		//Yukarıdaki gibi iki farklı yeni String nesnesi oluşturma komutu vardır.
		
		String ad2="Hakan"; //Yeni bir String nesnesi oluşturmadı ad ile ad1 aynı olduğu için String havuzunda ikisi de aynı adresi gösteriyor.
		String soyad2=new String ("Kılıçaslan"); //Yeni bir String nesnesi oluşturur. soyad ile soyad1 aynı kelime olsa da String havuzunda iki tane "Kılıçaslan" değeri oluşturuluyor.
		
		
		if(ad1==ad2)
			System.out.println("Ad adresleri aynı"); //== ile kıyaslama yaptığımızda sadece adres kıyaslaması yapıyor. Bu yüzden sadece ad ile ad1 kıyaslaması doğru çıktı.
		else 
			System.out.println("Ad adresleri farklı");
		if(ad1.equals(ad2))
			System.out.println("Ad değerleri aynı");
		else 
			System.out.println("Ad değerleri farklı");
		
		
		//String ifadelerin değerlerini kıyaslamak için .equals kullanıyoruz.
		if(soyad1.equals(soyad2))
			System.out.println("Soyad değerler aynı");
		else 
			System.out.println("Soyad değerleri farklı");
		if(soyad1==soyad2)
			System.out.println("Soyad adresleri aynı");
		else 
			System.out.println("Soyad adresleri farklı");
		
		
		System.out.println("*************");
		
		
		//.lentgh()
		//Kelimenin kaç karakterden oluştuğunu bulmak için .length() kullanıyoruz.
		String str1="İstanbul";
		int uzunluk=str1.length();
			System.out.println(uzunluk); //Kelime 8 karakterden oluşuyor.
		String str2="";
		int uzunluk2=str2.length();
			System.out.println(uzunluk2); //Kelimeye hiçbir karakter girmediğimiz için 0 karakterden oluşuyor.
		String str3=" ";
		int uzunluk3=str3.length();
			System.out.println(uzunluk3); //Boşlukta bir karakter olduğu için kelime 1 karakterden oluşuyor.
		
		
		System.out.println("*************");
		
		
		//.charAt()
		String str4="Eskişehir";
		           //012345678
		char karakter=str4.charAt(0);
			System.out.println(karakter); //0'ıncı index E karakteridir.
		karakter=str4.charAt(str4.length()-1);
			System.out.println(karakter); //index 0'dan başladığı için length()-1 bizim son indeximize denk geliyor.
		
		
		System.out.println("*************");
		
		
		//.substring()
		String str5="Antalya";
                   //0123456
		String karakterParcasi=str5.substring(4);
			System.out.println(karakterParcasi); //4ncü indexten son indexe kadar olan karakterleri yazdırıyor.
		String karakterParcasi1=str5.substring(3,6);
			System.out.println(karakterParcasi1); //Bu kullanımda da başlayacağı index numarasını giriyoruz diğer kısma biteceği index numarasının bir fazlasını giriyoruz.
		
		
		System.out.println("*************");
		
		
		//.concat()
		//String ifademizin sonuna yeni bir String ifade eklemek için kullanıyoruz. Bunun daha kolay bir yolu "İzmir"+"li" kullanımıdır.
		String str6="İzmir";
		String ekleme=str6.concat("li");
			System.out.println(ekleme); 
		
		
		System.out.println("*************");
		
		
		//.indexOf()
		String str7="Ankara";
		int kacinci=str7.indexOf('k');
			System.out.println(kacinci); //k karakterimizin kaçıncı indexte olduğunu yazdırıyor.
		kacinci=str7.indexOf('a');
			System.out.println(kacinci); //a karakterinden 2 tane olduğundan ilk hangi indexte denk geldiyse onu yazdırıyor.
		kacinci=str7.indexOf('h');
			System.out.println(kacinci); //h karakterinden ifademizde olmadığı için -1 yazdırıyor.
		kacinci=str7.indexOf("kara");
			System.out.println(kacinci); //"kara" ifademiz String değerimizin içinde varsa k karakterinin index numarasını geri dönüyor.
		kacinci=str7.indexOf("karo");
			System.out.println(kacinci); //"karo" ifadesi String değerimizin içinde olmadığı için -1 yazdırıyor.
		kacinci=str7.indexOf('a',4);
			System.out.println(kacinci); //'a' karakterini 4 numaralı indexten sonra ilk gördüğü index numarasını yazdırıyor.
		
		
		System.out.println("*************");
		
		
		//.equals()
		String str8="Kırşehir";
		boolean esitMi=str8.equals("Kırşehir"); //boolean kullandık çünkü bu metot sonucu sadece true ya da false olarak geri dönebilir yani bu iki String in değerleri aynıdır ya da farklıdır. Başka bir sonuç dönemez.
			System.out.println(esitMi); //str8 ile "Kırşehir" iki String ifade aynı değerde olup olmadığını .equals() ile buluyoruz. Aynı değer olduğu için true yazdırıyor.
		esitMi=str8.equals("kırşehir");
			System.out.println(esitMi); //str8 ile "kırşehir" ifadeleri aynı değerde olmadığı yani uyuşmadığı için false yazdırıyor.
		
		
		System.out.println("*************");
		
		
		String alfabe="ABCÇDEFGHIİJKLMNOÖPQRSŞTUÜVWXYZ";
		//A harfi:65 şeklinde harf ve yanında ascii code u şeklinde yazdıralım. A'dan Z'ye kadar 65 ile 90 arası sıralı gidiyor ama Türkçe karakterler daha sonra ascii code a eklenmiş.
		for (int i = 0; i < alfabe.length(); i++) {
			int asciiCode=alfabe.charAt(i); //Bu satırın yerine sout çıktısına asciiCode yerine (int)alfabe.charAt(i) yazabilirdik.
				System.out.println(alfabe.charAt(i)+" harfi: "+asciiCode);
		}
		
		
		System.out.println("*************");
		
		
		//EscapeKarakterler
			System.out.println("Hakan \t Kılıçaslan");     // \t karakteri birden çok boşluk bırakır.
			System.out.println("Hakan \n Kılıçaslan");     // \n karakteri konulan yerden sonrasını alt satırda yazdırır.
			System.out.println(" \"Hakan Kılıçaslan\" ");  // \" karakteri çıktı da " yazdırır.
			System.out.println(" 'Hakan Kılıçaslan' ");    // String ifadeyi ' arasına yazdırınca çıktı da ' karakterini de gösterir.
			System.out.println("Hakan \\ Kılıçaslan");     // \\ karakteri yazınca çıktı da bir tane \ karakterini gösterir.
		
		
		System.out.println("*************");
		
		
		//.compareTo()
		String str9="Ahmet";
		String str10="Zeynep";
		int sonuc=str9.compareTo(str10);
			System.out.println(sonuc); 
		// A:65 Z:90 sonuc:-25 ascii codelarının farkını geri dönüyor.
		//String ifadelerin ilk harfleri aynıysa farklı olan harflerin ascii code farklarını verir. Eğer sonuç 0 dönerse ifadelerin değerleri eşit demektir.

		String str11="ANKARA";
		String str12="Antalya";
		int sonuc1=str11.compareToIgnoreCase(str12); //.compareToIgnoreCase kullandığımızda kıyaslarken büyük küçük harf önemsemiyor. Daha doğrusu ikisini de büyük harfe ya da küçük harfe çevirip öyle kıyaslıyor.
			System.out.println(sonuc1); 

		String str13="Üsküdar";
		String str14="Zeytinburnu";
		int sonuc2=str13.compareTo(str14);
			System.out.println(sonuc2); //Normalde sonucun negatif gelmesi lazım ama Türkçe karakter kullandığımız için gelmedi. Türkçe karakter kullandığımızda doğru sonuç vermiyor.
		
		
		System.out.println("*************");
		
		
		//.toUpperCase() ve .toLowerCase()
		String str15="Hakan KILIÇASLAN";
			System.out.println(str15.toUpperCase()); //Küçük olan harflerin tamamını büyük harfe çevirir.
			System.out.println(str15.toLowerCase()); //Büyük olan harflerin tamamını küçük harfe çevirir.
			
		
		System.out.println("*************");
		
		
		//.trim()
		//İfadenin başındaki ve sonundaki boşlukları kaldırmaya yarar ama aradaki boşlukları kaldırmaz.
		String str16="   Hakan   Kılıçaslan    ";
			System.out.println(str16.trim()); 
		
		Scanner scanner=new Scanner(System.in);
			System.out.println("Kullanıcı adınızı giriniz");
		String str17=scanner.nextLine().trim(); //.nextLine() metodundan sonra .trim() metodunu çağırarak girilen kullanıcı adının başındaki ve sonundaki boşlukların kaldırılmasını sağlıyoruz. Aksi takdirde kişi kullanıcı adını girerken yanlışlıkla space tuşuna basarsa sistem bilgiler yanlış sonucunu bize dönecek.
			System.out.println("Şifrenizi giriniz");
		String str18=scanner.nextLine().trim();
			if(str17.equalsIgnoreCase("admin") && str18.equals("1234")) //.equalsIgnoreCase metodunu kullanıcı büyük harf kullanarakta küçük harf kullanarakta kullanıcı adını girse doğru kabul etmek için kullanıyoruz. Yani değerleri aynı mı diye kıyaslarken büyük harf küçük harf durumuna bakmıyor.
				System.out.println("Giriş Başarılı");
			else
				System.out.println("Bilgiler Yanlış");
		
		
		System.out.println("*************");
		
		
		//.valueOf()
		//Diğer değişkenleri String e dönüştürmeye yarar.
		int yas=30;
		String str19=yas+""; //valueOf metodu kullanmak yerine bir String ifade varsa + işlemi birleştirmeye yarardı. Bu durumda 30 artık String bir ifadeye dönüşmüş oluyor. str19 değişkenindeki 30 Stringe dönüştüğü için artık matematiksel işlemlerde kullanılamaz.
		String str20=Integer.toString(yas); //Integer.toString(yas)  metodu  yas+""  daha uzun kullanımıdır.
		String str21=String.valueOf(yas);
			System.out.println(str21);
		String str22=String.valueOf(true);
			System.out.println(str22);
		
		
		System.out.println("*************");
		
		
		//.parseInt()
		String str23="10";
		int sayi=Integer.parseInt(str23); //String değişkenini int değişkenine dönüştürmeye yarar.
			System.out.println(sayi*5);
		double kilo=Double.parseDouble("5.5"); //String bir ifadeyi double a dönüştürüyor ama "5.5" değil de "bes" olsaydı hata verirdi çünkü "bes" double da karşılığı yok. İçindeki ifadenin double da karşılığı gelen bir değer olması lazım.
			System.out.println(kilo*5);
		
		
		System.out.println("*************");
		
		
		//.replace()
		//String ifadenin içinde bir karakter yerine başka bir karakter ya da bir karakter dizisi yerine başka bir karakter dizisi yazdırmak için kullanılır.
		String str24="   Hakan Kılıçaslan  ";
			System.out.println(str24.replace('a', 'o'));
			System.out.println(str24.replace('a', '_'));
			System.out.println(str24.replace("Ha", "Vol"));
			System.out.println(str24.replace("a", ""));
			System.out.println(str24.trim().replace(" ","_")); //Bu ikili metot kullanımında önce String ifadenin başındaki ve sonundaki boşlukları sildik ve aradaki boşluk yerine de _ karakterini koymasını sağladık.
			
		
		System.out.println("*************");
		
		
		//.contains()
		//String ifadenin içinde aradığımız karakter ya da karakter dizisi var mı yok mu onu görmemizi sağlıyor. Bunda dolayı sonuc boolean yani true ya da false dönüyor.
		String str25="Hakan";
		boolean varMi=str25.contains("a"); 
		if(varMi) 
			System.out.println("Aranan karakter bulundu.");
		else 
			System.out.println("Aranan karakter yok.");
		
		
		System.out.println("*************");
		
		
		//.startsWith() & .endsWith()
		//String ifademizin bir karakter ya da karakter dizisiyle başladığını ya da bittiğini kontrol etmemizi sağlıyor. Sonuç true ya da false döneceği için boolean kullanıyoruz.
		String str26="Kılıçaslan";
		boolean basliyorMu=str26.startsWith("K"); //String ifademizin K karakteriyle başlayıp başlamadığını sorguluyoruz. Sonuç true
			System.out.println(basliyorMu);
		boolean bitiyorMu=str26.endsWith("n"); //String ifademizin n karakteriyle bitip bitmediğini sorguluyoruz. Sonuç true
			System.out.println(bitiyorMu);
			
			
		System.out.println("*************");
		
		
		//.split()
		//String ifademizin içindeki karakterleri ya da karakter dizilerini kelimeleri parçalara ayırmak için kullanılır.
		String str27="Bu dünya ne sana ne bana kalmaz";
		String[] dizi=str27.split(" "); //String ifademizin içinde boşluk karakterlerine göre parçalara ayırarak String dizisi oluşturuyoruz.
		for (String diziElemani : dizi) { //foreach kullanımı boşluk karakteriyle parçalara ayırarak oluşturduğumuz diziyi dizi elemanlarına göre yazdırmak için kullanıyoruz.
			System.out.println(diziElemani);
		}
	
			System.out.println(dizi.length); //property -> dizinin uzunluğunu yani içindeki eleman sayısını verir -> 7
			System.out.println(str27.length()); //String metot -> str27 String ifadenin içindeki karakter sayısını verir ->31
			
			
		System.out.println("*************");
		
		
		//StringBuilder
		String str28="Hak";
		str28+="an";
			System.out.println(str28); //Önce str28 için bellekte Hak yazan bir String nesnesi oluşturuyor. Daha sonra bu String nesneye an ekleyip Hakan diye başka bir String nesne daha oluşturuyor. Bu işlemler de performans olarak zorluyor çünkü her seferinde bir ekleme yaptığımızda yeni bir nesne oluşturuyor.
		
		//Yukardaki durumda her seferinde ekleme yapınca yeni nesne oluşmasını engellemek için StringBuilder kullanıyoruz. Eklediğimiz karakterleri artık ilk nesne üzerine kaydediyor. StringBuilder değişkenimize metin ya da karakter eklemek için kullanılır.
		
		StringBuilder str29=new StringBuilder(); //StringBuilder ile boş bir nesne oluşturduk.
		str29.append("Hak"); //Oluşturduğumuz boş nesnenin için Hak atadık. str29 artık "Hak" oldu.
		str29.append("an");  //Şimdi de str29 Stringine "an" eklemiş oluyoruz. Artık str29 değişkenimiz "Hakan" oldu.
			System.out.println(str29);
			
		str29.replace(0, 2, "Vol"); //[0,2) arasındaki indexleri yani 0 ve 1. indexi kaldırıp yerine "Vol" ekliyor. "Ha" ile "Vol" yer değiştirmesi yapıyoruz.
			System.out.println(str29);
		System.out.println(str29.reverse()); //String değişkenimizi tersine çeviriyor.
		System.out.println(str29.delete(0, 2)); //String değişkenimizin [0,2) arasındaki indexleri yani 0 ve 1. indexi silmemizi sağlıyor.
		
  }
}
