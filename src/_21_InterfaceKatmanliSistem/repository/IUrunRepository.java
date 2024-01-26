package _21_InterfaceKatmanliSistem.repository;

import _21_InterfaceKatmanliSistem.repository.entities.Urun; //Urun sınıfı farklı bir package içinde olduğundan kullanabilmek için Urun sınıfını import ediyoruz.

public interface IUrunRepository extends IRepository { ////IRepository interface'inden miras alarak ordaki ortak olan metotlara da sahip olmuş oluyoruz.

	//Sadece Urun için geçerli olan interfaceleri IUrunRepository içinde oluşturuyoruz.
	public Urun getUrun(int id);
	public Urun ara(int uuid);
	
}
