package ccc1.mybatis.exceptions;

public class TooManyResultsException extends PresistenceException{
	
	private static final long serialVersionUID = -6123650250720526115L;

	public TooManyResultsException() {
		super();
	}
	
	public TooManyResultsException(String message) {
		super(message);
	}
	
	public TooManyResultsException(Throwable cause) {
		super(cause);
	}
	
	public TooManyResultsException(String message, Throwable cause) {
		super(message, cause);
	}
}
