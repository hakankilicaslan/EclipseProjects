package _Threads;
/*
 * Process: İşlemler -> Teams,Chrome,Eclipse...
 * Thread: İş Parçacıkları -> Her bir process içindeki küçük program parçaları
 * 
 * MultiTasking: Aynı anda birden çok process çalıştırılması olayıdır.
 * MultiThreading: Bir process içinde birden çok thread oluşturarak bir çok işi aynı anda aynı process içinde yapılması.
 * Javada yazdığımız uygulamalar da birer process olarak çalışır. Default olarak sadece main Thread vardır.
 *  
 */
public class MultiThreadMain {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Main Thread çalışıyor: "+Thread.currentThread().toString()); //Thread[#1,main,5,main]
		
		MyThread myThread1=new MyThread("My Thread 1");
		MyThread2 myThread2=new MyThread2("My Thread 2");
		
		//Thread çalıştırmak için içindeki run metodunu start metodu ile tetiklemek gereklidir.
		myThread1.start();
		myThread2.start();
		
		
		myThread1.join(); //diyerek myThread1 bitene kadar main thread'e bekle demiş oluyoruz.
		//Bütün threadleri join edersek main thread en uzun olan threadi beklemek zorunda kalıyor.
		System.out.println("Main Thread çalışmayı sonladırdı.");
	}

}
