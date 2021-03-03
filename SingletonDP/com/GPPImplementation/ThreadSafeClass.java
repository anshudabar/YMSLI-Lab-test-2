package GPPImplementation;

public class ThreadSafeClass {
	private static ThreadSafeClass instanceSingleton;

	private ThreadSafeClass(){}

	public static synchronized ThreadSafeClass getSingleton() {
		if (instanceSingleton == null) {
			instanceSingleton = new ThreadSafeClass();
		}
		return instanceSingleton;
	}
	
	public static void main(String[] args) {
		ThreadSafeClass.getSingleton();
	}
}
