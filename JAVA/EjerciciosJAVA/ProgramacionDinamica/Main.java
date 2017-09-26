import java.util.Scanner;

public class Main {

public static Scanner sc = new Scanner(System.in);

    public static void main(String[] arg){
/*
    		System.out.print("Insert: ");
		    //int n = sc.nextInt();
        	int n = 8;
			//System.out.println("\nFibo = "+F(n));
			System.out.println("\nFibo = "+Fibo(n));
*/
		//System.out.println("Combinatorio 10-6: "+combinatorio(4,3));
		int[] ar = {1,7,2,11,15,1,2};

		System.out.println("SubArray: "+subArray(ar));


	}
	public static int Fibo ( int n ) {//Recursivo

		 if ( n==0)
		return 0;

		if ( n==1)
		return 1;

		return Fibo ( n - 1)+Fibo ( n - 2);

		}

	public static long F ( int n ) {//No recursivo
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
		////////////////////////////////////////////////////////////////
	//Ejercicio N2 Calcular el combinatorio
	public static int factorial(int n){//Factorial no Recursivo
		int a=1, aux=0;
		//int[] tabla=new int[n];
		if (n<2 && n>0)
			return a;
		else{
			for (int i = 2; i<=n;i++){
				aux = i;
				aux = aux * a;
				a = aux;
			}
			return aux;
		}
	}
	public static float combinatorio(int a, int b){
		int[] tablaFactorial = new int[a+1];
		float combinatorio;
		int factorialA=0, factorialB=0, factorialAyB;
		for (int i = 0; i <= a;i++){
			tablaFactorial[i] = factorial(i);
		}
		factorialA = tablaFactorial[a];
		factorialB = tablaFactorial[b];
		factorialAyB = tablaFactorial[a-b];
		combinatorio = factorialA/(factorialB*(factorialAyB));

		return combinatorio;
	}
///////////////////////////////////////////////////////////////////////
	//Ejercicio N3

	public static int subArray(int[] array){
		int contador=0, aux = 0, actual = 0;
		actual = array[0];
		for (int i = 1; i<array.length; i++){
			//if (i-1 == i){
			if (actual <= array[i]){
				if (contador ==0)
					contador+=1;

				contador++;
			}
			if(actual > array[i]){
				if (aux <= contador)
					aux=contador;

				contador = 0;
			}
			else
				aux=contador;

			actual = array[i];
		}
		return aux;
	}


}