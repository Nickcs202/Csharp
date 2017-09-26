public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont=0, tiempo=600, contPersona=1;
		Cola cola = new Cola();
		
		while( cont != tiempo ){//30){ //tiempo ){
			
			if(cont%2 == 0){
				String dato=""+contPersona;
				cola.encolar(dato);
				contPersona++;
			}//else
				if(cont%4 == 0){
					//System.out.println("> "+cont);
					cola.desEncolar();
				}
			
			cont++;
		}
		System.out.println("Cantidad de clientes = "+contPersona);
		System.out.println("Cantidad de clientes = "+cola.tamañio());

	}

}
