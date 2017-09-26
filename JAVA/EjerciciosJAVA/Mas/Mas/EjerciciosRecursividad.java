package progiiR;

/**
 * Created by nux on 20/08/17.
 */
public class EjerciciosRecursividad {

    public static void main(String[]  a){
       // imprimir(1);

        //imprimirTabla9(1);
        /*
        int[] ar ={2,4,7,2,6,5};
       System.out.println( mayor(0,ar,0));
        */
      //  System.out.println("Fibo (8) = "+fibo(8));

      //  System.out.println("Conejos (2) = "+conejos(2));

      //  System.out.println("Conejos2 (2) = "+conejos2(2));

       // System.out.println("factorial(3) = "+factoria(3));


        System.out.println("multi (2x3) = "+multiplicacion(2,3));

    }

    //Ejercicio N 1
    public  static void imprimir(int n){
        System.out.println(n);
        if(n==10)
            return;

        imprimir(n+1);
    }

        //Ejercicio N 2
    public  static void imprimirTabla9(int n){

        System.out.println(" 9 x "+n+" = "+(9*n));
        if(n==10)
            return;

        imprimirTabla9(n+1);
    }

    //Ejercicio N 3
    public static int mayor(int n, int[] ar,int r ){
       // int r = 0;
      //  System.out.println(ar[n]);
        if(n == ar.length-1)
            return r;
           // return  ar[n];

        if(ar[n]>r) {
         r =ar[n];
            //return ar[n];
        }

        return mayor((n+1), ar,r);
    }
    //Ejercicio N 4
    public static int fibo(int n){

        if(n==0){
            return 0;
        }else
            if(n<=2){
                return 1;
            }

         return fibo(n-1)+fibo(n-2);
    }

    //Ejercicio N 5
    public static int conejos(int n){

        if (n==0)
            return 0;

        return 2 + conejos(n-1);
    }

    //Ejercicio N 6
    public  static int conejos2(int n){

        if(n==0)
            return 0;

        if (n%2==0)
            return 3 + conejos2(n-1);

        return 2 + conejos2(n-1);
    }

    //Ejercicio N 7
    public static int factoria(int n){
        int i;

        if (n == 1)
            i = 1;
            else
        i =  n * factoria(n - 1) ;

        return i;
    }
    public static int multiplicacion(int n, int m){

        if(m==n)
            return n;

        return n + multiplicacion(n, m-1);

    }

}
