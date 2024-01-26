package _00_com.hakan;

import java.util.Scanner;

public class _01_ClassDeneme {

	public static void main(String[] args) {
		
		
		System.out.println("İlk sayıyı giriniz:");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		System.out.println("İkinci sayıyı giriniz:");
		int y = scanner.nextInt();
		
		int toplam1=x+y;
		System.out.println("Sayıların toplamı=" + toplam1);
		
		
		System.out.println("*************");
				
		
		byte b;
		int i=257;
		double d=323.142;
		
		System.out.println("int >> byte dönüşüm");
		b=(byte)i;
		System.out.println("i= "+i+" b = "+b);
		
		System.out.println("double >> int dönüşüm");
		i=(int)d;
		System.out.println("d= "+d+" i = "+i);
		
		System.out.println("double >> byte dönüşüm");
		b=(byte)d;
		System.out.println("d= "+d+" b = "+b);
				
		
		System.out.println("*************");
		
		
		char karaktera='a', karakterb='b';
		int toplam2=karaktera+karakterb;
		System.out.println(toplam2);
		String birlesim=karaktera+" "+karakterb;
		System.out.println(birlesim);
		System.out.println(karaktera+""+karakterb);
		System.out.println(""+karaktera+karakterb);
		System.out.println(karaktera+karakterb+"");
		
		
		System.out.println("*************");
		
		
		for (int j = 0; j <5; j++) {
			if(j==2) 
				break;
			System.out.println(j);
			}
				
		
	
		
		
		
 }
}
