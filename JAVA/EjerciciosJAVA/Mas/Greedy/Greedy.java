import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Greedy {

	public static void main(String[] args) {
		Actividades e1 = new Actividades();
		e1.ingresarDato();

	}

}

class Actividades{
	
	static Scanner sc = new Scanner(System.in);
	
	public static ArrayList<Integer> ingresarDato(){
		ArrayList lista = new ArrayList();
		boolean condition = true;
		int inicio, fin;
		do {
			System.out.println("Ingrese hora inicio actividad");
			inicio = sc.nextInt();
			
			lista.add(inicio);
			
			System.out.println("Ingrese hora fin actividad");
			fin = sc.nextInt();
			
			lista.add(fin);
			
			condition = opcion();
			
		} while (condition);
		
		return lista;
	}
	
	public static boolean opcion() {
		boolean var = true;
		System.out.println("Desea continuar S o N");
		String key = sc.nextLine();
		
		if(key.compareToIgnoreCase("n") == 0 ){
			var = false;
		}
		return var;
	}
	
}
