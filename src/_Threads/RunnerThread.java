package _Threads;

public class RunnerThread {

	public static void main(String[] args) {

		//3 farklı Thread oluşturalım. Birincisi 1-50'ye kadar 3'er 3'er ikincisi 5'er 5'er  üçüncüsü 7'şer 7'şer yazdırsın.
		
		new Thread(()->{
			
			for (int i = 1; i < 50 ; i+=3) {
				System.out.println("Thread1 çalıştı:"+i);
			}
						
		}).start();
		
		new Thread(()->{
			
			for (int i = 1; i < 50 ; i+=5) {
				System.out.println("Thread2 çalıştı:"+i);
			}
					
		}).start();
		
		new Thread(()->{
			
			for (int i = 1; i < 50 ; i+=7) {
				System.out.println("Thread3 çalıştı:"+i);
			}
					
		}).start();
				
	}

}
