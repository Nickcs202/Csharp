
public class Main {

	public static void main(String[] args) {
		//System.out.println("> "+factorial(65));
		System.out.println("Par > "+par(12));
		//System.out.println("Pot > "+potencia(2, 2));
		int[] a = {2,3,66,2,0,45,4,7,22,47};
		System.out.println(" > "+mayor(a,9));
		//System.out.println(" > "+buscarNumero(41, a));
		
	}
	
	public static double factorial(int n){
		if (n == 0)
			return 1;
		else
			//return multi (n,factorial(n-1));
			return n * factorial(n - 1);
	}

	public static int multi(int n, int m){
		if (m < 1)
			return 0;

		return n + multi (n,m-1);
	}
	/*
	public static boolean par(int n){
		if(n%2==0)
			return true;
		else
			return inpar(n);
	}
	
	public static boolean inpar(int n){
		if(!(n%2==0))
			return false;
		else
			return par(n);
	}*/
	public static int par(int n)
	{
	  if (n == 0) return 1;
	  return impar(n-1);
	}

	public static int impar(int n)
	{
	  if (n == 0) return 0;
	  return par(n-1);
	}
	public static int potencia(int a, int n){
		if(n==0)
			return 1;
		else
			return a * potencia(a, n-1);	
	}
	public static int buscarNumero(int num, int[] ar){
		return buscarNumero(ar, 0, num,-1);
		
	}
	
	public static int buscarNumero(int[] ar,int n,int valor,int valo){
		//int valo = -1;
		if (n==ar.length-1) {
			return valo;
		}else
			if(valor == ar[n])
				valo = n;
		
			return buscarNumero(ar, n+1,valor, valo);
	}
	public static int mayor(int numeros[], int posicion)
	{
	  int aux;
	  if (posicion == 0)
	      return numeros[posicion];
	  else {
	    aux = mayor(numeros, posicion-1);
	    if (numeros[posicion] > aux)
	      return numeros[posicion];
	    else
	      return aux;
	  }
	}
}
