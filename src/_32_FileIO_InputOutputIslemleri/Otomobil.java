package _32_FileIO_InputOutputIslemleri;

import java.io.Serializable;

//Serializable sıfır kodlu bir interfacedir yani bir Marker Interface'dir.
//Sadece bu interface implement edilince sınıfımızı işaretlemiş oluyoruz. 
//Program Serializable implement edilince yapacağı şeyler önceden belirlenmiş. 
//Bu şekilde implement ederek sınıfımızı serileştirmiş oluyoruz.
public class Otomobil implements Serializable{ //Sınıfımızı serileştirmek için Serializable interface'i implement ediyoruz.

	//Sınıfımızı Serializable interfaceden implement ettiğimiz zaman yani serileştirdiğimiz zaman sistem sınıfa long türünde bir serialVersionUID ataması yapıyor.
	//Yazma işlemi yapıldıktan sonra okuma işlemi yapılırken sistem bu serialVersionUID karşılaştırması yapıyor ve eşleşiyorsa okuma işlemini gerçekleştirebiliyor.
	//Eğer eşleşme olmazsa ya da yazma işlemi yapıldıktan sonra serialVersionUID değiştirildiyse sistem eşleştiremediği için okuma işlemini gerçekleştiremiyor.
	//Bu serialVersionUID kullanım amacı sınıf içinde herhangi bir değişiklik ekleme çıkarma yapıldıysa bu id güncelleştirilsin yani versiyon değiştirilmiş olsun.
	//Bu şekilde başka biri bunun üzerinde çalışma yapıyorsa versiyonun değiştiğini bir şeylerin eklenip çıkarıldığını anlayabilsin diye kullanılıyor
	private static final long serialVersionUID = 1L;
	
	//Nesne Değişkenleri:
	private String marka;
	private String model;
	private int yil;
	private Motor motor;
	
	//Constructor:
	public Otomobil(String marka, String model, int yil, Motor motor) {
		super();
		this.marka = marka;
		this.model = model;
		this.yil = yil;
		this.motor = motor;
	}
	
	//Getters and Setters:
	public String getMarka() {
		return marka;
	}
	
	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getYil() {
		return yil;
	}
	
	public void setYil(int yil) {
		this.yil = yil;
	}
	
	public Motor getMotor() {
		return motor;
	}
	
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	//toString:
	@Override
	public String toString() {
		return "Otomobil [marka=" + marka + ", model=" + model + ", yil=" + yil +" "+ motor + "]";
	}
	
}
