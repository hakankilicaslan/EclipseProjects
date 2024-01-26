package _32_FileIO_InputOutputIslemleri;

import java.io.Serializable;
import java.util.UUID;

public class Log implements Serializable{ //Sınıfımızı serileştirmek için Serializable interface'i implement ediyoruz.

	//Sınıfımızı Serializable interfaceden implement ettiğimiz zaman yani serileştirdiğimiz zaman sistem sınıfa long türünde bir serialVersionUID ataması yapıyor.
	//Yazma işlemi yapıldıktan sonra okuma işlemi yapılırken sistem bu serialVersionUID karşılaştırması yapıyor ve eşleşiyorsa okuma işlemini gerçekleştirebiliyor.
	//Eğer eşleşme olmazsa ya da yazma işlemi yapıldıktan sonra serialVersionUID değiştirildiyse sistem eşleştiremediği için okuma işlemini gerçekleştiremiyor.
	//Bu serialVersionUID kullanım amacı sınıf içinde herhangi bir değişiklik ekleme çıkarma yapıldıysa bu id güncelleştirilsin yani versiyon değiştirilmiş olsun.
	//Bu şekilde başka biri bunun üzerinde çalışma yapıyorsa versiyonun değiştiğini bir şeylerin eklenip çıkarıldığını anlayabilsin diye kullanılıyor.
	private static final long serialVersionUID = 1L;
	
	//Nesne Değişkenleri:
	String id;
	String hataMesaji;
	String sinifAdi;
	String metotAdi;
	String detay;
	Long zaman;
	
	//Constructor:
	public Log(String hataMesaji, String sinifAdi, String metotAdi, String detay, Long zaman) {
		super();
		this.hataMesaji = hataMesaji;
		this.sinifAdi = sinifAdi;
		this.metotAdi = metotAdi;
		this.detay = detay;
		this.zaman = zaman;
		this.id=UUID.randomUUID().toString(); //Sistem eşsiz bir uuid tanımlasın diye UUID(Universally Unique Identifier) sınıfından random bir uuid atanıyor.
	}

	//Getters and Setters:
	public String getId() {
		return id;
	}

	public String getHataMesaji() {
		return hataMesaji;
	}

	public void setHataMesaji(String hataMesaji) {
		this.hataMesaji = hataMesaji;
	}

	public String getSinifAdi() {
		return sinifAdi;
	}

	public void setSinifAdi(String sinifAdi) {
		this.sinifAdi = sinifAdi;
	}

	public String getMetotAdi() {
		return metotAdi;
	}

	public void setMetotAdi(String metotAdi) {
		this.metotAdi = metotAdi;
	}

	public String getDetay() {
		return detay;
	}

	public void setDetay(String detay) {
		this.detay = detay;
	}

	public Long getZaman() {
		return zaman;
	}

	public void setZaman(Long zaman) {
		this.zaman = zaman;
	}

	//toString:
	@Override
	public String toString() {
		return "Log [id=" + id + ", hataMesaji=" + hataMesaji + ", sinifAdi=" + sinifAdi + ", metotAdi=" + metotAdi + ", detay=" + detay + ", zaman=" + zaman + "]";
	}

}
