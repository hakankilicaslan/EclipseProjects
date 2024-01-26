package _21_InterfaceKatmanliSistem;

import java.util.ArrayList;
import _21_InterfaceKatmanliSistem.repository.IMusteriRepository; //IMusteriRepository interface'i farklı package içinde olduğundan implement edebilmek için import ediyoruz.
import _21_InterfaceKatmanliSistem.repository.entities.Musteri;   //Musteri sınıfı farklı package içinde olduğundan kullanabilmek için import ediyoruz.

public class MusteriRepositoryImpl implements IMusteriRepository {
	
	ArrayList<Musteri> musteriList=new ArrayList<>(); //Müşterileri liste halinde tutacak bir musteriList oluşturuyoruz.
	
	@Override
	public boolean kaydet(Object o) { //Musterinin önceden sisteme kayıtlı olup olmadığı durumu contains ile kontrol ediyoruz. Eğer kayıtlıysa tekrar eklemiyoruz ama sistemde kayıtlı değilse add ile listemize ekliyoruz.
		if(musteriList.contains(o)) {
			System.out.println("Müşteri zaten kayıtlı.");
			return false;
		}
		musteriList.add((Musteri)o); //ArrayList Musteri listelediği için Musteri istiyor ama biz listeye Object eklemeye çalışıyoruz. Bu hatayı gidermek için gelen Object'i Musteri'ye cast ediyoruz.(downcasting)
		System.out.println("Müşteri eklendi.");
		return true;
	}
	
	@Override
	public void listele() { ////listele() metodunu çağırarak listeye eklediğimiz müşterilerin forEach kullanarak adlarını yazdırıyoruz.
		System.out.println("*****Müşteri Listesi*****");
		for (Musteri musteri : musteriList) {
			System.out.println(musteri.getKullaniciAdi()+" "+musteri.getAd());
		}
		//Fonksiyonel Programlama(lambda expression ->) forEach metoduyla -> lambda kullarak listedeki bütün elemanları gezerek hepsi için sout işlemini yapmasını sağladık.
		//musteriList.forEach(m->System.out.println(m.getKullaniciAdi()+" "+m.getAd()));
	}
	
	@Override
	public void sil(int index) {
		if(musteriList.size()>index && musteriList.get(index)!=null ) { //Verdiğimiz index musteriList.size()'dan küçükse yani liste içinden bir index verdiysek ve verdiğimiz index null değilse şartı ekliyoruz.
			System.out.println(musteriList.get(index).getAd()+ " isimli müşteri silindi.");
			musteriList.remove(index); //Verilen indexin bulunduğu elemanı remove() kullanarak listemizden kaldırıyoruz.
			return;
		}System.out.println("Listede böyle bir müşteri yok.");
	}

	@Override
	public boolean sil(String ad) {
		return false;
	}
	
	@Override
	public boolean sil(Object o) {
		return false;
	}
	
	@Override
	public boolean duzenle(Object o) {
		return false;
	}
	
	@Override
	public Musteri getMusteri(String uuid) {
		return null;
	}

	@Override
	public Musteri ara(String uuid) {
		return null;
	}
	
}
