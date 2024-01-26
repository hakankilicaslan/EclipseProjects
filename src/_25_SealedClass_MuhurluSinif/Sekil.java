package _25_SealedClass_MuhurluSinif;

/*
 * Bir sınıfı final olarak tanımladığımızda o sınıftan kalıtım almayı yani extend ile miras almayı engelliyorduk.
 * Sealed tanımlanan sınıflarda aynı işleve sahip kendisinden miras alınmayı engelliyor.
 * Aradaki fark ise sealed tanımlanan sınıfta miras alabilecek sınıfları kısıtlayabiliyoruz yani izin verdiğimiz sınıflar sealed sınıftan miras alabiliyorlar.
 * 
 * Sealed tanımlanan sınıflar kendisinden miras alan extend eden sınıflara permit ile izin vermesi gerekiyor ve miras alan sınıfında non-sealed olarak tanımlanması gerekiyor.
 * Sealed tanımlanan interfaceler kendisini implement edecek sınıflara permits ile izin vermesi gerekiyor ve implement eden sınıfında non-sealed olarak tanımlanması gerekiyor.
 * 
 * Sekil sınıfı sealed olarak tanımlandı. Artık Sekil sınıfından miras alınamıyor ama permits diyerek Kare ve Daire sınıfına Sekil sınıfından miras alınma izni veriliyor.
 * Daire ve Kare sınıfı extends Sekil diyerek artık Sekil sınıfından miras alabilirler ama tanımlanırken non-sealed tanımlanmaları gerekiyor.
 * Yamuk sınıfına permit ile Sekil sınıfından miras alma izni verilmediği için non-sealed olarak tanımlansa bile miras alamaz.
 * 
 */

public sealed class Sekil permits Kare,Daire{   }

non-sealed class Daire extends Sekil{   }

non-sealed class Kare extends Sekil{   }

//non-sealed class Yamuk extends Sekil{}

