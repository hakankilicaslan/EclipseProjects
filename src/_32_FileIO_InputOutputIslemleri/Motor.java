package _32_FileIO_InputOutputIslemleri;

import java.io.Serializable;

public class Motor implements Serializable{ //Sınıfımızı serileştirmek için Serializable interface'i implement ediyoruz.

	//Sınıfımızı Serializable interfaceden implement ettiğimiz zaman yani serileştirdiğimiz zaman sistem sınıfa long türünde bir serialVersionUID ataması yapıyor.
	//Yazma işlemi yapıldıktan sonra okuma işlemi yapılırken sistem bu serialVersionUID karşılaştırması yapıyor ve eşleşiyorsa okuma işlemini gerçekleştirebiliyor.
	//Eğer eşleşme olmazsa ya da yazma işlemi yapıldıktan sonra serialVersionUID değiştirildiyse sistem eşleştiremediği için okuma işlemini gerçekleştiremiyor.
	//Bu serialVersionUID kullanım amacı sınıf içinde herhangi bir değişiklik ekleme çıkarma yapıldıysa bu id güncelleştirilsin yani versiyon değiştirilmiş olsun.
	//Bu şekilde başka biri bunun üzerinde çalışma yapıyorsa versiyonun değiştiğini bir şeylerin eklenip çıkarıldığını anlayabilsin diye kullanılıyor
	private static final long serialVersionUID = 1L;
	
	//Nesne Değişkenleri:
	private int motorNo;

	//Constructor:
	public Motor(int motorNo) {
		super();
		this.motorNo = motorNo;
	}

	//Getters and Setters:
	public int getMotorNo() {
		return motorNo;
	}

	public void setMotorNo(int motorNo) {
		this.motorNo = motorNo;
	}

	//toString:
	@Override
	public String toString() {
		return "motorNo=" + motorNo;
	}
	
	
}
