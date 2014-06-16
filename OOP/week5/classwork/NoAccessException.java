package OOP.week5.classwork;

public class NoAccessException extends Exception {
	
	private String message;
	private String path;
	
	public NoAccessException(String message){
		super(message);
	}

	@Override
	public String toString() {
		return "NoAccessException [message=" + message + ", path=" + path + "]";
	}
	
	

}
