package _20_Interface_Arayuz;

public class Olcum {

	//Olcum sınıfında INemOlcer interface'ni parametre olarak alan bir metot yazıyoruz.
	//Artık INemOlcer'i implement eden yani özelliklerine sahip olan sınıftan nesneler bu metodu çağırabilirler.
	public void nemOlc(INemOlcer nemOlcer){
		System.out.println(nemOlcer.nemOlc());
	}
	
	public void tarihSaatGoster(ITarihSaatGöster tarihSaatGöster) {
		System.out.println(tarihSaatGöster.tarihGoster()+" "+tarihSaatGöster.saatiGoster());
	}
	
	//ITermometre üzerinden yeni bir SinboTermometre nesnesi oluşturuyoruz. termometreOlustur() metodu çağırıldığında yeni bir SinboTermometre nesnesi oluşturup dönecek. 
	public ITermometre termometreOlustur() {
		return new SinboTermometre();
	}
	
}
