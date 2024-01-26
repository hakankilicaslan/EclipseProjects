package _06_Arrays_Diziler;

import java.util.Arrays;
import java.util.Scanner;

public class _03_DiziyiTersCevirme {

	public static void main(String[] args) {
		
		//5 elemanlı bir int dizisi tanımlayalım ve ardından dizinin elemanlarını ters çevirerek yazdıralım.
		
		int dizi[]=new int[5];
		Scanner scanner = new Scanner(System.in);
		
		for (int i=0; i<dizi.length; i++) {
			System.out.print(i+1+ ".sayıyı giriniz:");
			dizi[i] = scanner.nextInt();
		}
		scanner.close(); //Scanner ile kullanıcıdan girdileri aldıktan sonra scanner nesnesini kapatmaya yarar.
		System.out.println(Arrays.toString(dizi));
		
		for (int i=dizi.length-1; i>=0; i--) {
			System.out.print(dizi[i]+" ");  //Dizinin elemanlarını tersten yazdırmış olduk.
		}
		
		
		System.out.println("\n*************");
		
		
		//SWAP - 3ncü bir geçici değişken(temp) kullanarak değerlerin yerini değiştirme
		int sayi1=10;
		int sayi2=20;
			System.out.println("sayi1="+sayi1+" sayi2="+sayi2);
		int temp1=sayi1; //sayi1 değişkenini geçici olarak temp değerinin içinde saklıyoruz.
		sayi1=sayi2;     //sayi2 değişkeninin değerini sayi1'e aktarıyoruz. sayi1 artık 20 oldu.
		sayi2=temp1;     //temp geçici değişkeninin içindeki değeri sayi2'ye aktarıyoruz. sayi2 artık 10 oldu.
			System.out.println("sayi1="+sayi1+" sayi2="+sayi2);
		
		//Değişken kullanmadan yer değiştirme yapma
		sayi1=3;
		sayi2=20;	
			System.out.println("sayi1="+sayi1+" sayi2="+sayi2);
		sayi1=sayi1+sayi2; //sayi1->23 sayi2-> 20
		sayi2=sayi1-sayi2; //sayi2->3
		sayi1=sayi1-sayi2; //sayi1->20	
			System.out.println("sayi1="+sayi1+" sayi2="+sayi2);
				
				
		//temp kullanarak dizinin elemanlarını yer değiştirerek ters yazdırma		
		int temp2;
		for (int i = 0; i < dizi.length/2; i++) {
			temp2=dizi[i];
			dizi[i]=dizi[dizi.length-(i+1)];
			dizi[dizi.length-(i+1)]=temp2;			
		}
		System.out.println(Arrays.toString(dizi)); //Dizinin elemanlarını yer değiştirerek yazdırmış olduk.
	}
}
