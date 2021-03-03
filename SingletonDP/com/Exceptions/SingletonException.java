package Exceptions;

public class SingletonException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public SingletonException(String message){
		super(message);
	}
	
}
