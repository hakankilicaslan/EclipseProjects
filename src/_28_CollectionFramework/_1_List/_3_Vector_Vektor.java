package _28_CollectionFramework._1_List;

import java.util.Vector;

public class _3_Vector_Vektor {
	
	public static void main(String[] args) {
		
		/*
		 * Farklı işlem kanalları üzerinden aynı yapı üzerinde çalışmaya çalışıyoruz diyelim.
		 * ArrayList üzerinde bunu yapmaya çalıştığımızda bir Thread geldi bir eklemeye yapmaya çalışıyor.
		 * Daha sonra başka bir Thread geldi o da ekleme yapmaya çalışıyor diyelim.
		 * İkisi aynı anda geldiğinde bunlardan bazıları çakışma olduğu için ekleme yapamayacak.
		 * Bu bizim istemediğimiz bir durum o zaman da bu Threadlerle uygun yapılar kullanmalıyız.
		 * ArrayList'in Threadlerle çalışırken farklı işlem kanalları üzerinden çalışabilen uygun haline Vector deniyor.
		 * ArrayList ile metotları aynı şekilde kullanılıyor çok büyük farklılıklar yok birbirine benzer metotlar var.
		 * Vector'ün asıl farklılığı senkronize bir şekilde iş parçacıklarıyla çalışmamızı sağlıyor.
		 * Vector sınıfı Thread Safe için yani iş parçacığı güvenliği için kullanılır.
		 * 
		 */
		
		Vector<String> vektor=new Vector<>(); //String türünde verilen tutan referansımızın Vector sınıfından oluşturulan yeni nesneyi göstermesini sağladık.
		
		Thread thread1=new Thread(()->{  //Yeni bir Thread oluşturuyoruz. Lambda kullanarak içine kullanacağımız metotları giriyoruz.
				synchronized (vektor) {  //Threadlerin senkronize şekilde çalışması için bir keyword kullanıyoruz. synchronized (vektor) diyerek bu blok içine yazdıklarımızı vektor'e senkronize olarak kullan demiş oluyoruz.
					vektor.add("Hakan"); //Vektor içine eleman eklemeye çalışıyoruz.
				}
		});
		
		Thread thread2=new Thread(()->{			
				synchronized (vektor) {
					vektor.add("Kılıçaslan");
				}
		});
		
		/*
		 * Normalde Thread kullanmadığımızda kodlar yukarıdan aşağı doğru akar ve sırasıyla işlem yapardı.
		 * Önce yukarıdaki ekleme işini yapar daha sonra aşağıdaki ekleme işini yapardı.
		 * Thread kullandığımızda bu işlemleri senkronize şekilde yapıyor yani aynı anda iki ekleme işini de yapıyor.
		 * thread1 ve thread2 deki add() metotları aynı anda çalışacak ve String ifadeler aynı anda vektor içine eklenecek.
		 * 
		 */
		
		thread1.start(); //Oluşturduğumuz Thread'leri start() diyerek başlatmış oluyoruz.
		thread2.start();
		
		try{
			thread1.join(); //thread1 ve thread2 çalışması için Main Thread içine eklememiz lazım yoksa main thread çalışınca oluşturduğumuz threadler çalışmadan sistem sonlanıyor.
			thread2.join(); //Main Thread artık bu try-catch içindeki işlem sonlandıktan sonra çalışmaya devam ediyor.
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		synchronized (vektor) { //vektor içinde senkronize çalışıp içindeki sout çıktısını veriyr.
			System.out.println("Vectordeki elemanlar: "+vektor);	
		}
		
	}
	
}
