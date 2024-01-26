package _05_RandomClass;

import java.util.Random;

public class RandomSinifi {

	public static void main(String[] args) {

		Random rnd=new Random(); //Yeni nesne üretme işini for döngüsünün dışında yaptık. Çünkü içinde yaptığımızda döngü her döndüğünde tekrardan yeni bir nesne üretecek. Bu da performansı etkiler ve işlemciyi ekstradan yorar.
		for (int i = 1; i <= 100; i++) {
			int sayi=rnd.nextInt(11); //11 yazdık çünkü üst sınırı dahil etmiyor.
			if(sayi==10) {
				System.out.println(i+". adımda 10 geldi"); //0 ile 10 arasında sayı ürettik ve 100 döngülük bir for döngüsüne sokarak kaçıncı adımda 10 sayısı gelecek onu bulmuş olduk.
				break;	
			}
		}
		
		
		System.out.println("*************");
		
		
		//1 ile 6 arasında 2 tane rastgele zar atan bir program yazalım.
		int zar1=rnd.nextInt(6)+1; //6 yazdığımızda 0'dan 5'e kadar sayı ürettiği için sonuna 1 ekledik.
		int zar2=rnd.nextInt(6)+1;
			System.out.println("Zar1: "+zar1+"\nZar2: "+zar2);
		//Çıkan sonuca 1 eklemek zorunda kalmamak için aralık vererekte çözebiliriz.
		int zar3=rnd.nextInt(1, 7); //7 dahil olmayacak şekilde arasında sayı üretiyor.
	}
}
