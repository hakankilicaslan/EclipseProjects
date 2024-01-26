package _Threads;

public class MultiThreadMain4 {

	public static void main(String[] args) {
		
		String isim="Lambda Thread";
		
		new Thread(()->{
			
				System.out.println("\u001B[31m"+isim+" isimli thread çalışıyor: "+Thread.currentThread().toString()+"\u001B[0m");
				for (int i = 0; i < 10 ; i++) {
					System.out.println("\u001B[31m"+isim+" yazdı"+i+"\u001B[0m");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
				System.out.println("\u001B[31m"+isim+" isimli thread çalışmayı bitirdi.\u001B[0m");
						
		}).start();
		
	}

}
