package _21_InterfaceKatmanliSistem;

import java.util.ArrayList;
import _21_InterfaceKatmanliSistem.repository.IUrunRepository; //IUrunRepository interface'i farklı package içinde olduğundan implement edebilmek için import ediyoruz.
import _21_InterfaceKatmanliSistem.repository.entities.Urun;   //Urun sınıfı farklı package içinde olduğundan kullanabilmek için import ediyoruz.

public class UrunRepositoryImpl implements IUrunRepository {

	ArrayList<Urun> urunList=new ArrayList<>(); //Ürünleri liste halinde tutacak bir urunList oluşturuyoruz.
	
	@Override
	public boolean kaydet(Object o) {//Urunun önceden sisteme kayıtlı olup olmadığı durumu contains ile kontrol ediyoruz. Eğer kayıtlıysa tekrar eklemiyoruz ama sistemde kayıtlı değilse add ile listemize ekliyoruz.
		if(urunList.contains(o)) {
			System.out.println("Ürün zaten kayıtlı...");
			return false;
		}
			urunList.add((Urun)o); //ArrayList Urun listelediği için Urun istiyor ama biz listeye Object eklemeye çalışıyoruz. Bu hatayı gidermek için gelen Object'i Musteri'ye cast ediyoruz. (downcasting)
			System.out.println("Ürün eklendi.");
			return true;	
	}
	
	@Override
	public void listele() { //listele() metodunu çağırarak listeye eklediğimiz ürünlerin forEach kullanarak adlarını yazdırıyoruz.
		System.out.println("*****Ürün Listesi*****");
		for (Urun urun : urunList) {
			System.out.println(urun.getAd());
		}
	}

	@Override
	public boolean sil(Object o) { //Ürünün kendisini parametre vererek silmek için bu metodu kullanıyoruz.
		if(urunList.contains(o)) { //Ürünün contains ile urunList içinde olup olmadığı durumu kontrol ediyoruz.
			urunList.remove(o); //Ürün urunList içinde varsa da remove ile listemizden çıkarıyoruz.
			System.out.println("Ürün silindi.");
			return true;
		}System.out.println("Böyle bir ürün bulunamadı.");
		return false;
	}
	
	@Override
	public boolean sil(String ad) { //Ürünün adını parametre vererek silmek için bu metodu kullanıyoruz.
		for (int i = 0; i < urunList.size(); i++) { //urunList.size() boyunca yani listenin tüm elemanlarını geziyoruz.
			if(urunList.get(i).getAd().equals(ad)) { //get(i) indexindeki elemanın adının parametre olarak verilen ad ile aynı olduğu koşula bakıyoruz.
				urunList.remove(i); //Koşulumuz sağlanıyorsa o indexteki elemanı listemizden çıkarıyoruz.
				System.out.println("Ürün silindi.");
				return true;
			}
		}System.out.println("Böyle bir ürün bulunamadı.");
		return false;
	}
	
	@Override
	public boolean duzenle(Object o) {
		return false;
	}

	@Override
	public void sil(int index) {
	}
	
	@Override
	public Urun ara(int uuid) {
		return null;
	}

	@Override
	public Urun getUrun(int id) {
		return null;
	}

}
