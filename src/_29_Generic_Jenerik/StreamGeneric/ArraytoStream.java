package _29_Generic_Jenerik.StreamGeneric;

import java.util.Arrays;

public class ArraytoStream {

	public static <T> void yazdir(T[] dizi) {
		
		//Arrays.stream(dizi) diyerek parametre olarak verilen diziyi bir stream'e çevirmiş olduk.
		//Artık dizimiz stream olduğu için stream içindeki metotlara ulaşabiliriz.
		//forEach() metodunu çağırdık ve stream içindeki her bir eleman için metot referansı kullanarak sout işlemi yapmış olduk.
		Arrays.stream(dizi).forEach(System.out::println);
		
	}
}
