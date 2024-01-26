package _Volatile;

public class VolatileOrnek {

	public static void main(String[] args) {

		MyThread myThread=new MyThread();
		myThread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		myThread.threadDurdur();
		try {
			myThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class MyThread extends Thread{
	volatile boolean calis=true;
	@Override
	public void run() {
		long sayac=0;
		while(calis) {
			sayac++;
		}
		System.out.println("Sayaç: "+sayac);
	}
	
	public void threadDurdur() {
		calis=false;
	}
}
