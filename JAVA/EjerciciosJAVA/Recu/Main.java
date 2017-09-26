public class Main {

    public static void main(String[] arg){

        double time_start, time_end;
        time_start = System.currentTimeMillis();

        System.out.println("fibo: "+fibo(29));// llamamos a la tarea

        time_end = System.currentTimeMillis();

        double milisegundos = ( time_end - time_start );
        double segundos = (( time_end - time_start )/1000);
        System.out.println(" La tarea ha tomado: "+ milisegundos +" millisegundos "+
                "o aprox = "+segundos+" segundos");
        System.out.printf("%.4f",segundos);

        //System.out.println(" La tarea ha tomado: "+ ( time_end - time_start ) +" millisegundos ");

    }

    public static int fibo(int n){
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        else
            return fibo(n-1) + fibo(n-2);
    }
    public static int fibo2(int n){
        int a=0,b=1,aux=0;
        if (n==0)
            return a;
        if (n==1)
            return b;
        else {
            a = 1;
            for (int i = 2; i < n; i++) {
                aux = a + b;
                a = b;
                b = aux;
            }
        }
                return aux;
    }
    public static int par(int n){
        if (n==0)return 1;
        return inpar(n-1);
    }
    public static int inpar(int n){
        if (n==0)return 0;
        return par(n-1);
    }
}
