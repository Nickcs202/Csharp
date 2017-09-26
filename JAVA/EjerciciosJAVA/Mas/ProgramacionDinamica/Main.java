import java.util.Scanner;

public class Main {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Insert: ");
		int n = sc.nextInt();
			System.out.println("\nFibo = "+F(n));
			System.out.println("\nFibo = "+Fibo(n));
	}
	public static int Fibo ( int n ) {
		
		 if ( n==0)
		return 0;
		
		if ( n==1)
		return 1;
		
		return Fibo ( n - 1)+Fibo ( n - 2);

		}
	
	public static long F ( int n ) {
		long[] v= new long[100];
		
		if (v [ n]!=0) {
		return v[n];
		} if ( n==0){
		return 0;
		} if ( n==1){
		return 1;
		
		} v[ n ]=F ( n - 1)+F ( n - 2) ;
		
		return v[n];
		}

}
