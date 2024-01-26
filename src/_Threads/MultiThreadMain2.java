package _Threads;

public class MultiThreadMain2 {

	public static void main(String[] args) {

//		MyThread3 myThread3=new MyThread3("myThread3");
//		myThread3.run();
		
		//run metodunu çağırırsak klasik metot çağırma yapmış oluruz. Thread özelliğinden yararlanamayız. Burada main thread içinde çalışmış olurlar. Farklı threadler çalışmamış olur.
		
		Thread thread1=new Thread(new MyThread3("myThread3"));
		thread1.start();
		
		Thread thread2=new Thread(new MyThread3("myThread4"));
		thread2.start();
		
		
	}

}
