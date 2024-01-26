package _27_BubbleSortUygulamasi;

import java.util.Arrays;

public class BubbleSortRunner {

	public static void main(String[] args) {

		int[] sayilar= {17,5,12,2,28,1,24,6,28,10};
		System.out.println(Arrays.toString(sayilar)); //Dizimizin ilk halini yazdırıyoruz.
		bubbleSort(sayilar);
		System.out.println(Arrays.toString(sayilar)); //Dizimizin bubbleSort metodunu çağırıp sıraladıktan sonraki halini yazdırıyoruz.
	}
	
	public static void bubbleSort(int[] sayiDizisi) { //Metodumuzun içine parametre olarak bir sayı dizisi göndereceğiz ve küçükten büyüğe sıralayıp bize geri dönecek.
		for (int i = 0; i < sayiDizisi.length; i++) {
			for (int j = 0; j < sayiDizisi.length-i-1; j++) { //j max 9 olabileceği yani dizinin 10uncu indexi olmadığı için -1 koyamamız gerekiyor yoksa dizideki 10uncu eleman olan 10 sayısını da bir sonraki elemanla kıyaslamaya çalışıyor ama öyle bir eleman olmadığı için hata veriyor.
				if(sayiDizisi[j]>sayiDizisi[j+1]) { //Dizi içerisinde soldaki eleman sağdakinden büyükse şartını koyuyoruz ve temp kullanarak soldaki elemanla sağdaki elemanı kıyaslayıp soldaki büyükse yer değiştiriyoruz.
					int temp=sayiDizisi[j];
					sayiDizisi[j]=sayiDizisi[j+1];
					sayiDizisi[j+1]=temp;
				}
			}
		}
	}

}
