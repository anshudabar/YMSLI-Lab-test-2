
public class Main {
	public static void main(String[] args) throws InterruptedException {
		
		int totalSum=0;
		
		ThreadRandomization tr1 = new ThreadRandomization();
		ThreadRandomization tr2 = new ThreadRandomization();
		ThreadRandomization tr3 = new ThreadRandomization();
		ThreadRandomization tr4 = new ThreadRandomization();
		ThreadRandomization tr5 = new ThreadRandomization();

		Thread t1 = new Thread(tr1);
		Thread t2 = new Thread(tr2);
		Thread t3 = new Thread(tr3);
		Thread t4 = new Thread(tr4);
		Thread t5 = new Thread(tr5);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();


		totalSum += tr1.getInteger() + tr2.getInteger() + tr3.getInteger() + tr4.getInteger()
		        +tr5.getInteger();

		System.out.println("Total sum is : "+totalSum);

	}
}
