public class Arbol {
	
	private NodoArbol raiz;
	
	public Arbol(){
		this.raiz = null;
	}
	
	//public void insertar(Object dato){
	public void insertar(int dato){
		
		NodoArbol nuevo = new NodoArbol();
		nuevo.setDato(dato);
		
		if(existe(dato) == false){//Elimino duplicados
			
			if(raiz == null){
				raiz = nuevo;
			}else{
				NodoArbol recorrido = new NodoArbol();
				NodoArbol actual = new NodoArbol();
				recorrido = raiz;
				while(recorrido != null){
					actual = recorrido;
			
						if (dato < recorrido.getDato()) {
							recorrido = recorrido.getIzq();
							
						}else {
							recorrido = recorrido.getDer();
						}
					
				}
	
					if (dato < actual.getDato()) {
						actual.setIzq(nuevo);				
					}else {
						actual.setDer(nuevo);
					}
			}
		}
	}
	
		public boolean existe(int dato){
			NodoArbol recorrido = raiz;
			while(recorrido != null){
				if(dato == recorrido.getDato()){
					return true;
				}else
				if(dato < recorrido.getDato()){
					recorrido = recorrido.getIzq();
					
				}else {
					recorrido = recorrido.getDer();
				}
			}
			return false;
		}
		
		private void recorridoInorden (NodoArbol reco) {
			if (reco != null) {
				//System.out.print(reco.getDato() + " ");
				recorridoInorden(reco.getIzq());
				System.out.print(reco.getDato() + " ");
				recorridoInorden(reco.getDer());
				//System.out.print(reco.getDato() + " ");
			}
		}
		private void recorridoPreorden (NodoArbol reco) {
			if (reco != null) {
				System.out.print(reco.getDato() + " ");
				recorridoPreorden (reco.getIzq());
				recorridoPreorden (reco.getDer());
				
			}
		}			
		private void recorridoPosorden (NodoArbol reco) {
			if (reco != null) {
				
				recorridoPosorden(reco.getIzq());
				recorridoPosorden (reco.getDer());
				System.out.print(reco.getDato() + " ");
			}
		}
		
		
		
		public void recorridoInorden() {
			System.out.print("recorridoInorden:  ");
			recorridoInorden (raiz);
			System.out.println();
		}

		public void  recorridoPreorden  () {
			System.out.print("recorridoPreorden: ");
			recorridoPreorden(raiz);
			System.out.println();
		}
		
		
		public void recorridoPosorden () {
			System.out.print("recorridoPosorden: ");
			recorridoPosorden (raiz);
			System.out.println();
		}
		
}
