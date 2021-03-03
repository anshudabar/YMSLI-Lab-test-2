package GPPImplementation;

import Exceptions.SingletonException;

public class StaticBlockInitializationClass {
private static StaticBlockInitializationClass instanceSingleton;
    
    private StaticBlockInitializationClass(){}
    
    static{
        try{
            instanceSingleton = new StaticBlockInitializationClass();
        }
        catch(Exception ex){
            throw new SingletonException("Singleton Exception");
        }
    }
    
    public static StaticBlockInitializationClass getSingleton(){
        return instanceSingleton;
    }
    
}
