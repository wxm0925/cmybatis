package ccc1.mybatis.exceptions;

public class PresistenceException extends IbatisException{
	
	private static final long serialVersionUID = 4858840418115065547L;

	public PresistenceException() {
		super();
	}
	
	public PresistenceException(String message) {
		super(message);
	}
	
	public PresistenceException(Throwable cause) {
		super(cause);
	}
	
	public PresistenceException(String message, Throwable cause) {
		super(message, cause);
	}
}
