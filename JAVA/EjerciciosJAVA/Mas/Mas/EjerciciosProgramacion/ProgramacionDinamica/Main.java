package ProgramacionDinamica;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(fibonacci(45));

	}
public static int fibonacci(int n){
		   
	    if(n == 0){
	        return 0;
	    }else if(n == 1){
	        return 1;
	    }else{
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }
	   
	} 
}
