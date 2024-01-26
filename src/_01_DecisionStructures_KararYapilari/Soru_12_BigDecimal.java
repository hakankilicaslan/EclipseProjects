package _01_DecisionStructures_KararYapilari;

import java.math.BigDecimal;

public class Soru_12_BigDecimal {

	public static void main(String[] args) {
		
		// Big Decimal kullanarak toplama yapma

		BigDecimal bigDecimalA=new BigDecimal(0.1);
		BigDecimal bigDecimalB=new BigDecimal(0.2);
		BigDecimal bigDecimalC=new BigDecimal(0.0);
		bigDecimalC=bigDecimalA.add(bigDecimalB);
		
		//double sayi=(double)bigDecimalC; 
		//Zorla atama yapmamıza rağmen BigDecimal değerini double a atamadı.
				
		System.out.println(bigDecimalC);
 }
}
