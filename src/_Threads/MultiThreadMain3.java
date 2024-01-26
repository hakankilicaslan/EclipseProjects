package _Threads;

public class MultiThreadMain3 {

	public static void main(String[] args) {

		Thread thread1=new Thread(new Runnable() {
			String isim="Anonymous Thread";
			@Override
			public void run() {
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
			
			}
		});
	
		thread1.start();
		
		new Thread(new Runnable() {
			String isim="Anonymous Thread2";
			@Override
			public void run() {
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
			
			}
		}).start();
	}

}
