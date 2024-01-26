package _21_InterfaceKatmanliSistem.repository;

/*
 * package         -> _21_InterfaceKatmanliSistem                     -> Runner ve Impl sınıfları bu package içinde olacak.
 * alt package     -> _21_InterfaceKatmanliSistem.repository          -> repositoryler bu package içinde olacak.
 * alt alt package -> _21_InterfaceKatmanliSistem.repository.entities -> entityler bu package içinde olacak.
 *
 * IMusteriRepository ve IUrunRepository interfaceleri için aşağıdaki metotların hepsi ortak yani ikisinde de bulunuyor.
 * İki interface içinde tek tek bu metotları yazmak yerine bir üst interface olarak IRepository açıyoruz.
 * Alt interface için geçerli olan metotlar alt interface içinde ortak olan metotları ise üst interface içinde tanımlıyoruz. 
 * Diğer iki interface'in ise bu üst interfaceden kalıtım yani miras alarak bu ortak metotlara sahip olmasını sağlıyoruz.
 * Interfaceler de sınıflar gibi extends kullanarak birbirlerinden miras alabilirler.
 * Interfaceler arası extend yani miras alma durumunda üst interfacedeki metotları alt interface içine implement etmiyoruz. 
 * Üst interfaceden miras alınca o metotlara alt interface de sahip olmuş oluyor.
 * IMusteriRepository ya da IUrunRepository implement eden sınıflar doğrudan bu interfacelerden dolaylı olarakta IRepository'den implement etmiş oluyor.
 * Hem alt hem üst interfaceleri implement ettiği için ikisinde de bulunan metotları override etmek zorunda kalıyor.
 */

public interface IRepository { 

	//İşlemler bütün sınıflar için geçerli olsun diye en üst sınıf olan hepsinin miras aldığı Object sınıfını parametre olarak alıyoruz.
	public boolean kaydet(Object o); //kaydetme işlemi başarılı ise true değilse false dönsün diye boolean tanımladık.
	public boolean duzenle(Object o); 
	public boolean sil(Object o);
	public boolean sil(String ad);
	public void sil(int index); //sil() metodumuz için farklı parametreler girerek kullandığımız için üç tane sil() metodu oluşturduk.
	public void listele();

}
