import java.util.Random;

public class ThreadRandomization implements Runnable {
	int num;
	Random temp = new Random();

	public void run() {
		num = temp.nextInt(10) + 1;
	}

	int getInteger(){
	      return num;

	}
}
