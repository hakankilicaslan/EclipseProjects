package _20_Interface_Arayuz;

    /* 
	 *Interface(Arayüz) 
	 *İçinde metotların interfacelerini barındıran bir şablondur.
	 *Interfacelerden nesne üretilemez.
	 *Java da bir sınıf birden fazla interface implement edilebilir. 
	 *Sınıfın birden fazla interface implement edebilmesini çoklu miras alma gibi düşünebiliriz.
	 *Bir interface de birden fazla sınıf tarafından implement edilebilir yani çağırılabilir.
	 *Abstract sınıfların içinde hem abstract metot hem de gövdeli metotlar olabilirdi.
	 *Interfaceler abstract sınıfların sadece abstract metotlu halerini benzetilebilir.
	 *Interface içindeki metotlarda abstract kelimesini kullanmasanız bile hepsi abstract metottur.
	 *Interfaceler abstract metot sayıldıkları için metotlarında gövde olmaz.
	 *
	 *Class -> Nesne yaratmak için kullanılır.
	 *Abstract Class -> Nesne yaratılmamasını sağlar. Ama o sınıfı şablon sınıf gibi kalıtımda üst sınıf olarak kullanmamızı sağlıyordu.
	 *Interface -> Sınıflara özellik, yetenek katmak için kullanılır. İçinde metotların sadece interface'i olacak. Yani gövdesi olmayacak.
	 *
	 */

//ITermometre adında bir interface oluşturduk ve içine sicaklikOlc metodu ekledik.
//Artık bu interface'i implement yani uygulamak isteyen sınıflar mecburen bu metodu override etmek zorunda kalacak.
public interface ITermometre { 
	
	public int sicaklikOlc(); //Tanımlanırken abstract yazılmamış olsa bile interface içindeki metotlar abstract metotlardır.
	
}
