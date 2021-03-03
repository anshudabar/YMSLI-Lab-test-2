package GPPImplementation;

public class LazyInitializationClass {

	private static LazyInitializationClass instanceSingleton;

	private LazyInitializationClass(){}

	public static LazyInitializationClass getSingleton() {
		if (instanceSingleton == null) {
			instanceSingleton = new LazyInitializationClass();
		}
		return instanceSingleton;
	}
	
}
