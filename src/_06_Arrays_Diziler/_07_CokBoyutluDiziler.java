package _06_Arrays_Diziler;

import java.util.Arrays;

public class _07_CokBoyutluDiziler {

	public static void main(String[] args) {
		
		//Çok boyutlu dizi kullanarak sınıf listesi oluşturma
		
		String[][] sinifListesi=new String[5][4]; //Çoklu dizimiz 5 satır 4 sütundan oluşacak.
		
		//SıraNumarası-ÖğrenciNumarası-İsmi-Notu olacak şekilde 4 sütundan oluşacak
		//1  100  Ad  Not
		//2  101  Ad1 Not
		
		//String[][] sinifListesi= {{"1","100","Ece","80"},{"2","101","Su","100"},{"3","110","Ata","70"},{"4","112","Can","85"}};

		
		//1.satır
		sinifListesi[0][0]="1";
		sinifListesi[0][1]="100";
		sinifListesi[0][2]="Ece";
		sinifListesi[0][3]="80";
		
		//2.satır
		sinifListesi[1][0]="2";
		sinifListesi[1][1]="101";
		sinifListesi[1][2]="Su";
		sinifListesi[1][3]="100";
		
		//3.satır
		sinifListesi[2][0]="3";
		sinifListesi[2][1]="110";
		sinifListesi[2][2]="Ata";
		sinifListesi[2][3]="72";
		
		//4.satır
		sinifListesi[3][0]="4";
		sinifListesi[3][1]="111";
		sinifListesi[3][2]="Ali";
		sinifListesi[3][3]="75";
		
		//5.satır
		sinifListesi[4][0]="5";
		sinifListesi[4][1]="112";
		sinifListesi[4][2]="Can";
		sinifListesi[4][3]="85";
		
		
		//Çok boyutlu dizideki elemanları foreach dögüsüyle ile yazdıralım:
		for (String[] satir : sinifListesi) {
			for (String sutun : satir) {
				System.out.print(sutun+"\t");
			}System.out.println();
		}
		
		
		System.out.println("**************************");
		
		
		//Çok boyutlu dizideki elemanları for döngüsüyle ile yazdıralım:
		for (int i = 0; i < sinifListesi.length; i++) {
			for (int j = 0; j < sinifListesi[i].length; j++) {
				System.out.print(sinifListesi[i][j]+"\t");
			}System.out.println();
		}
		
		
		System.out.println("**************************");
		
		
		//2. satırımızda yani 1 numaralı index satırındaki elemanları for döngüsüyle yazdıralım:
		for (int j = 0; j < sinifListesi[1].length; j++) {
			System.out.print(sinifListesi[1][j]+"\t"); //İkinci satırdaki elemanlarımızı yazdırıyoruz.
		}System.out.println();
		System.out.println(Arrays.toString(sinifListesi[1])); //İkinci satırdaki elemanlarımızı dizi şeklinde yazdırıyoruz.
		
		
		System.out.println("**************************");
		
		
		//2. satırımızda yani 1 numaralı index satırındaki elemanları foreach döngüsüyle yazdıralım:
		for (String eleman : sinifListesi[1]) {
			System.out.print(eleman+"\t");
		}System.out.println();
		System.out.println(Arrays.toString(sinifListesi[1]));
		
		
		System.out.println("**************************");
		
		
		//3. sütunumuzda yani 2 numaralı index sütunundaki elemanları yani öğrenci isimlerini yazdıralım:
		for (int i = 0; i < sinifListesi.length; i++) {
			System.out.print(sinifListesi[i][2]+"\t");
		}System.out.println();
		//Sütunlar bir dizi değil her dizinin bir parçasını aldığımız için sütundaki değerleri foreach ya da Arrays.toString ile yazdıramıyoruz.  
		
		
		System.out.println("**************************");
		
		
		//4. sütunumuzda yani 3 numaralı index sütunundaki elemanları yani öğrenci notlarını yazdıralım ve notların toplamını ve ortalamasını bulalım:
		int toplam=0;
		for (int i = 0; i < sinifListesi.length; i++) {
			System.out.print(sinifListesi[i][3]+"\t");
			toplam+=Integer.parseInt(sinifListesi[i][3]);
		}System.out.println();
		double ortalama=((double)toplam/sinifListesi.length);
		System.out.println("Notların toplamı= "+toplam);
		System.out.println("Notların ortalaması= "+ortalama);
	}
}
