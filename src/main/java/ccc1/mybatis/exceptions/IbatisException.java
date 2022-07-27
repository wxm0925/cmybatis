package ccc1.mybatis.exceptions;

public class IbatisException extends RuntimeException {
	
	private static final long serialVersionUID = 3564700382200739951L;

	public IbatisException() {
		super();
	}
	
	public IbatisException(String message) {
		super(message);
	}
	
	public IbatisException(Throwable cause) {
		super(cause);
	}
	
	public IbatisException(String message, Throwable cause) {
		super(message, cause);
	}

}
