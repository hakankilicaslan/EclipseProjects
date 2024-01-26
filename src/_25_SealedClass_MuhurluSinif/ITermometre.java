package _25_SealedClass_MuhurluSinif;

/*
 * ITermometre interface sealed olarak tanımlanmış ve kendisinden implement edilmeyi kısıtlamış.
 * BraunTermometre sınıfı için permits diyerek implement etme izni verilmiş.
 * BraunTermometre sınıfı non-sealed tanımlanıp implements ITermometre eklenerek bu interface'i implement edebilir.
 */

public sealed interface ITermometre permits BraunTermometre{ 

	public int sicaklikOlc();
		
}
