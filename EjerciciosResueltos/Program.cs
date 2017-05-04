using System;

namespace Ejercicios
{
	

	class MainClass
	{
		public static void Main (string[] args)
		{
			/*
			Console.WriteLine ("Hello World!");
			var cadena = "La recon ";
			for (var a = 0; a < 10; a++) {
				Console.WriteLine (cadena);
			}

			int x = 10;
			int y = 20;
			Console.WriteLine("El resultado es: " + (x + y)); // Imprimirá en pantalla: "El resultado es: 30"



			Coche coche = new Coche(); // Se usa el segundo constructor
			//coche.NumPuertas = 4;
			Console.WriteLine("El número de puertas es: " + coche.NumPuertas);// Imprimirá en pantalla: "El número de puertas es: 4"
			*/
			/*
			Console.WriteLine ("Ingrese que tabla de multiplicar");

			int t = int.Parse (Console.ReadLine());

			Console.WriteLine ("Ingrese hasta que numero desea ver..");

			int n = int.Parse (Console.ReadLine());
			/*
			for (int i = 0; i <= n; i++) {
				Console.WriteLine (""+t+" x "+i+"  = "+(t*i));
			}*//*
			int cont = 0;
			while (cont<=n) {
				Console.WriteLine (""+t+" x "+cont+"  = "+(t*cont));
				cont++;
			}
			var contador = 0;
			do {
				Console.WriteLine (""+t+" x "+cont+"  = "+(t*contador));
				contador++;
			} while (contador<=n);
			*/

			/*******************************************************************************************
			int[] arregloDesordenado = {34,7,44,89,3,1 };

			//Console.WriteLine ("Arreglo desordenado...");
			imprimir (arregloDesordenado, false);

			int[] arregloOrdenado = metodoBurbuja (arregloDesordenado);

			//Console.WriteLine ("Arreglo ordenado por el metodo ordenamiento de la burbuja..");
			imprimir (arregloOrdenado, true);



 		}//FIn del main


		public static int[] metodoBurbuja(int[] vector){
			int t;
			for (int a = 1; a < vector.Length; a++)
				for (int b = vector.Length - 1; b >= a; b--)
				{
					if (vector[b - 1] > vector[b])
					{
						t = vector[b - 1];
						vector[b - 1] = vector[b];
						vector[b] = t;
					}
				}return vector;
		}//Fin del metodo Burbuja

		public static void imprimir(int[] vector, Boolean param)
		{
			if (param) {
				Console.WriteLine ("\nVector ordenados en forma ascendente");
			} else {
				Console.WriteLine ("Arreglo desordenado...");
			}
				
			
			for (int f = 0; f < vector.Length; f++)
			{
				Console.Write(vector[f]+"  ");
			}
			//Console.ReadKey();
		}

		*/

			/*
			imprimirSucesionFibo (15);

		}//Finn del main
	public static void imprimirSucesionFibo(int max){
			for (int i = 0; i < max; i++) {
			Console.WriteLine ("Fibo =  "+Fibonnaci(i));
			}
	}//Fin funcion imprimir fibo

	public static int Fibonnaci(int n) 
	{ 
		if (n == 0 || n == 1) return 1; 
		else return Fibonnaci(n - 1) + Fibonnaci(n - 2); 
	}//Fin funcion Fibinacci
	*/ //*********************************************************


			/*
			Console.WriteLine ("Ingrese in numero..");
	int n = int.Parse (Console.ReadLine());
	Console.WriteLine ("El fsctorial de "+ n +" es "+factorial(n));
		}//Fin del main

public static int factorial(int num)
{
	int f=1;
	if (num == 0 || num == 1)
		return f;
	else
		f = num * factorial(num - 1);
	return f;
}*/  //*******************************************************************


			/*********************************************************************

	Console.WriteLine ("Ingrese in numero..");
	int n = int.Parse (Console.ReadLine());
			Console.WriteLine ("El numero " + n + " es primo " + esPrimo (n));
			Console.WriteLine ("El numero " + n + " es primo " + esPrimoCorto (n));
			
		}//Fin del main

    public static Boolean esPrimo(int numero){
      int contador = 2;
      Boolean primo=true;
			//if (numero % 2 == 0)
			//	return false;
			//else {
				while ((primo) && (contador != numero)) {
					if (numero % contador == 0)
						primo = false;
					contador++;
				}
				return primo;
			//}
    }//Fin del metodo isPrimo
	
	public static Boolean esPrimoCorto(int numero){
	double auxi;
			Boolean variable = true;
	if (numero % 2 == 0 && numero != 2)
				return false;
		
	else {
				auxi = Math.Sqrt ( numero);
		Console.WriteLine ("raiz cuadrada "+auxi);
		//for (int i = 2; i < auxi; i++) {
		int contador =2;		
		while (contador<auxi || variable==false) {
	
					if (numero % 2 != 0 && numero != 2) {
						if (contador % numero == 0) {
							variable = false;
							return variable;
						}
					} else {
						variable = true;
						return variable;
			}contador++;
				}

		return variable;
			}
		}
*/  //*******************************************************************

			int[] arg = {89,5,1,65,27,8,2 };
			imprimirArreglo (arg);
	ordenamientoSeleccion (arg);
	imprimirArreglo (arg);
	/*
			ordenamientoInsercion (arg);
			imprimirArreglo (arg);
	*/

	Console.WriteLine ("busqueda binaria "+busquedaBinaria(arg, 65));
	Console.WriteLine ("busqueda lineal "+busquedaLineal(arg, 65));
		}//Fin del main


public static int invertirNumero(int n){


}



public static int busquedaLineal(int[] arg, int b) {
	int k=1, result=-1;
	do{
		if (arg[k]== b)
			result =k;
		else
			k++;
	}while ((result==-1)&&(k<arg.Length));
	return result;
}




public static int busquedaBinaria(int[] array, int valor)
{       
	int adelante = 0, atras = array.Length - 1, mitad = 0;

	while (adelante <= atras)
	{
		mitad = adelante + (atras - adelante)/2;      

		if (valor == array[mitad])
		{                    
			return mitad;
		}
		else if (valor < array[mitad])
			atras = mitad - 1;
		else
			adelante = mitad + 1;
	}
		
	return -1;
}


	public static int[] ordenamientoSeleccion(int[] array)
		{
			int min, aux;

			for (int i = 0; i < array.Length - 1; i++)
			{
				min = i;
				for (int j = i + 1; j < array.Length; j++)
					if (array[j] < array[min])
						min = j;

				// swap the values
				aux = array[i];
				array[i] = array[min];
				array[min] = aux;
			}return array;
		}


		public static int[] ordenamientoInsercion(int[] ar){
					
			for (int i = 0; i < ar.Length; i++) {
				int copiaAr = ar[i];
				int j = i;
				while (j > 0 && copiaAr < ar[j-1]) {
					ar[j] = ar[j-1];
					j--;
				}
				ar[j] = copiaAr;
			}return ar;
		}


		public static void imprimirArreglo(int[] arreglo){
			for (int i = 0; i < arreglo.Length; i++) {
				Console.WriteLine (">"+arreglo[i]);
					}
		}

	}
}

/*
	public class Coche 
	{
		private int numPuertas;
		public int NumPuertas 
		{
			get 
			{
				return this.numPuertas;
			}
			set 
			{
				this.numPuertas = value; // 'value' es una variable que se asigna automáticamente al asignar un valor a la propiedad,
				// para poder trabajar con dicho valor.
			}
		}

		public Coche(int numPuertas) 
		{
			this.NumPuertas = numPuertas;
		}

		// Sobrecarga: si se instancia la clase sin indicar ningún parámetro, se inicializa 'numPuertas' con el valor '2'
		public Coche() : this(2) 
		{
		}
	}
	*/




/*
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace PruebaVector10
{
	class PruebaVector10
	{
		private string[] nombres;
		private int[] edades;

		public void Cargar() 
		{
			nombres=new string[5];
			edades=new int[5];
			for(int f=0;f < nombres.Length;f++) 
			{
				Console.Write("Ingrese nombre:");
				nombres[f]=Console.ReadLine();
				Console.Write("Ingrese edad:");
				string linea;
				linea = Console.ReadLine();
				edades[f]=int.Parse(linea);            
			}
		}

		public void MayoresEdad() 
		{
			Console.WriteLine("Personas mayores de edad.");
			for(int f=0;f < nombres.Length;f++) 
			{
				if (edades[f] >= 18) 
				{
					Console.WriteLine(nombres[f]);
				}
			}
			Console.ReadKey();
		}

		static void Main(string[] args)
		{
			PruebaVector10 pv = new PruebaVector10();
			pv.Cargar();
			pv.MayoresEdad();
		}
	}
}
*/