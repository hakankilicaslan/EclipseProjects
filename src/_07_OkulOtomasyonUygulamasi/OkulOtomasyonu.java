package _07_OkulOtomasyonUygulamasi;

import java.util.Scanner;

public class OkulOtomasyonu {

	static Scanner sc;
	
	public static void main(String[] args) {
	
		//OKUL OTOMASYONU
		
		//secim=sc.nextInt();sc.nextLine(); -> Kullanıcıdan girdi alırken enter ile beraber almaya çalışıyor. Bunun önüne geçmek için nextInt sonrası nextLine komutu giriyoruz.
		
		sc=new Scanner(System.in);
		int secim; //secim değişkenini do-while döngüsü dışında tanımladık çünkü do dan sonra tanımlayınca while içindeki secim değişkeninin tipini sistem görmüyor.
		String[] sinifListesi=null; //Kullanıcıdan daha sonra elemanları ya da eleman sayısını alacağımız için program ilk değer girilmedi hatası vermesin diye null atıyoruz.
		int[] matNotlari=null;
		int sinifMevcudu;
		
		do {
		basliklarYazdir("OKUL OTOMASYONU");
		menuYazdir();
		secim = kullanicidanVeriAl("Lütfen seçiminizi giriniz:");
	
		switch (secim) {
		case 1:
			basliklarYazdir("SINIF TANIMLA");
			sinifMevcudu=kullanicidanVeriAl("Sınıf mevcudunu giriniz:");
			sinifListesi=new String[sinifMevcudu];
			matNotlari=new int [sinifMevcudu];
			break;
			
		case 2:
			basliklarYazdir("ÖĞRENCİ TANIMLA");
			for (int i = 0; i < sinifListesi.length; i++) {
				System.out.println((i+1)+". öğrencinin adını giriniz:");
				sinifListesi[i]=sc.nextLine();
			}break;
			
		case 3:
			basliklarYazdir("SINIF LİSTELE");
			for (String ogrenci : sinifListesi) {
				System.out.println(ogrenci);
			}System.out.println("Ana menüye dönmek için Enter'a bas.");
			sc.nextLine(); //Program kullanıcı enter tuşuna basana kadar beklemesi için yapıyoruz. Bastığında yeniden ilk menüye dönüyor.
			break;
			
		case 4:
			basliklarYazdir("NOT GİRİŞİ");
			for (int i = 0; i < matNotlari.length; i++) {
				int not1=kullanicidanVeriAl(sinifListesi[i]+"1. notunu giriniz:");
				if (not1<0 || not1>100) {
					System.out.println("Not girişi 0 -100 arasında olmalı");
					i--;
					continue; //break dersek döngüyü kırdığı için kullanıcı 0-100 arasında not girmediğinde o komutu atlasın tekrar not girebilsin diye continue diyoruz. i-- diyerek bir sonraki geçmesin aynı kullanıcının notunu tekrar istesin diye yapıyoruz.
				}
				int not2=kullanicidanVeriAl(sinifListesi[i]+"2. notunu giriniz:");
				if (not2<0 || not2>100) {
					System.out.println("Not girişi 0 -100 arasında olmalı");
					i--;
					continue;
				}matNotlari[i]=(not1+not2)/2;
			}break;
			
		case 5:
			basliklarYazdir("NOT  LİSTELE");
			
			for (int i = 0; i < matNotlari.length; i++) {
				System.out.println(sinifListesi[i]+"\t"+matNotlari[i]);
			}break;
			
		case 0:
			System.out.println("Programdan çıkış yapıldı");
			break;
		
		default:
			System.out.println("0-5 arası seçim giriniz. ");
			break;
		}
		}while(secim!=0);
	}

	
	//Her case içinde başlık gösterildiği için main metot dışına basliklarYazdir isminde bir metot tanımlayıp case içinden bu metotları çağırabiliriz.
	public static void basliklarYazdir(String baslik) {
		System.out.println("*************************");
		System.out.println("*****"+baslik+ "*****");
		System.out.println("*************************");		
	}
	
	//Metot olarak tanımlayacağımız kısmı seçip sağa tıklayıp Refactor içinde Extract Method diyerek metot ismini ve access modifier belirleyerek o kısmı metotlaştırabiliriz.
	public static void menuYazdir() {
		System.out.println("1-Sınıf Tanımlama");
		System.out.println("2-Öğrenci Tanımla");
		System.out.println("3-Sınıf Listele");
		System.out.println("4-Not Ver");
		System.out.println("5-Notları Listele");
		System.out.println("0-Çıkış");
	}
	
	public static int kullanicidanVeriAl(String mesaj) {
		int secim;
		System.out.println(mesaj);
		secim=sc.nextInt();sc.nextLine(); //scanner main içinde tanımlandığı için bu metottan erişemedik. O yüzden scanner tanımlarken main metot dışında sınıf içinde static Scanner sc diyerek nesneyi tanımlamalıyız.
		return secim;
	}
}
