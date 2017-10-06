package cola;

public class ColaVacia extends Exception {
	
	public ColaVacia(Exception e){
		super(e);
	}

	public ColaVacia(String string) {
		System.out.println(string);
	}

}
