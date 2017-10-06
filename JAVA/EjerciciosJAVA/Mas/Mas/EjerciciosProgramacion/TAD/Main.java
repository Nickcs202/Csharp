package TAD;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cola cola = new Cola();
		
		int cont=0,tamanio=600,cantPersonas=1,cantidadPersonasAux = 0;
		
		boolean var = true;
		
		//while (cont != tamanio) {
		while (var) {
			
			if (cont%2 == 0) {
				cola.encolar(""+cantPersonas);
				cantPersonas++;
				
			}
			if (cont%4 == 0) {
				cola.desencolar();
			}
			if (cont == tamanio) {
				cantidadPersonasAux = cantPersonas; 
			}
			
			cont++;
			if(cont > tamanio  ){
				if( cantPersonas == cantidadPersonasAux+1){
				var = false;
				}
			}
		}
		
		System.out.println("Cantidad de clientes en la cola = "+cola.getTamanio());
		System.out.println("Cont = "+cont);
		System.out.println("Cantidad de clientes atendidos = "+cola.desencolar());

	}

}
