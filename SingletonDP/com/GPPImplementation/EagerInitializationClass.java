package GPPImplementation;

public class EagerInitializationClass {
   private static final EagerInitializationClass instanceSingleton = new EagerInitializationClass();
    
    private EagerInitializationClass(){}

    public static EagerInitializationClass getSingleton(){
        return instanceSingleton;
    }
    
}
