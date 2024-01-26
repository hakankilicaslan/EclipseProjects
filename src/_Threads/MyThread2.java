package _Threads;

public class MyThread2 extends Thread{

	String isim;

	public MyThread2(String isim) {
		super();
		this.isim = isim;
	}
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

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
	
}
