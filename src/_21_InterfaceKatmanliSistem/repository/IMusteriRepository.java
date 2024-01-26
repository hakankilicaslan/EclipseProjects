package _21_InterfaceKatmanliSistem.repository;

import _21_InterfaceKatmanliSistem.repository.entities.Musteri; ////Musteri sınıfı farklı bir package içinde olduğundan kullanabilmek için Musteri sınıfını import ediyoruz.

public interface IMusteriRepository extends IRepository { //IRepository interface'inden miras alarak ordaki ortak olan metotlara da sahip olmuş oluyoruz.

	//Sadece Musteri için geçerli olan interfaceleri IMusteriRepository içinde oluşturuyoruz.
	public Musteri getMusteri(String uuid);
	public Musteri ara(String uuid);
	
}
