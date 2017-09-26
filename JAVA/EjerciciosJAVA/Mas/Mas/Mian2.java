
public class Mian {

	public static void main(String[] args) {
		int i = 5;
		//for (int i = 0; i < 9; i++)
		System.out.println(i+" > "+fibo3(i));
		
	}
	public static int fibo(int n){
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		else
			return  fibo(n-1)+fibo(n-2);
	}
	
	public static int fibo2(int n){
		int aux=0,cont=2,a=0,b=1;
		if(n==0)
			return a;
		if(n==1)
			return b;
		else
			a=1;
			while(cont != n){
				aux=a+b;
				a=b;
				b=aux;
				cont++;
			}
		return aux;
	}
	public static int fibo3(int n){
		int[] tabla=new int[n];

		if (n==0) 
			return 0;
		if(n==1)
			return 1;
		else
			tabla[0]=0;
			tabla[1]=1;
			for (int j = 2; j < n; j++) {
				tabla[j]=tabla[j-1]+tabla[j-2];
			}
		
		return tabla[n];
	}

}
