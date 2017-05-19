using System;
using AhorcadoPalabras;
using System.Text;

namespace Ahorkd2
{
	class MainClass
	{
		public static AhorcadoPalabras.GeneradorPalabras p;
		public static int n;
		public static string cadenaMostrar, cadenaPalabra;
		public static StringBuilder buffe;
		public static int contadorAcierto;
		public static int contadordesacierto;

		public static void Main (string[] args)
		{
			/*
			Console.WriteLine ("·······");
			cadenaPalabra = palabra (out n);
			creoBuilder (n);
			mascara (n);
			Console.WriteLine (cadenaPalabra);
			Console.WriteLine (buffe);

			reemplaceTodo (cadenaPalabra, 'c');
			insertar ('c', 2);

			Console.WriteLine (buffe);
			menu ();
			ConsoleKeyInfo co;
			co = Console.ReadKey ();
			Console.WriteLine (co.Key.ToString ());
			*/
			jugarAhork2 ();

		}







		public static void creoBuilder (int n)
		{
			buffe = new StringBuilder (n);
		}

		public static string palabra (out int n)
		{
			p = new AhorcadoPalabras.GeneradorPalabras ();

			string s = "";
			do {
				s = p.SiguientePalabra;
				n = s.Length;
//				Console.WriteLine (n);
			} while (n <= 6);
			return s;
		}

		public static void mascara (int n)
		{
			for (int i = 0; i < n; i++) {
				buffe.Append ("_");
			}
		}

		public static void reemplaceTodo (string s, char c)
		{
			char[] sChar = s.ToCharArray ();

			for (int i = 0; i < s.Length; i++) {

				if (sChar [i] == c) {
					buffe [i] = c;
				}
			}
		}

		//public static bool isCoincide (string s, char c, out int con)
		public static bool isCoincide (string s, char c, int pos, out int con)
		{
			con = contadordesacierto;
			bool val = false;
			if (s [pos].CompareTo (c) != -1) {
				val = true;
			} else
				contadordesacierto += 1;

			return val;
		}
		/*	{
			con=contadordesacierto;
			bool val = false;
			if (s.IndexOf (c) != -1) {
				val = true;
			} else
				contadordesacierto += 1;

			return val;
		}*/

		public static bool control (string s, char c, out int con, out int cn)
		{
			cn = contadorAcierto;
			con = contadordesacierto;
			//bool val = false;
			if (s.IndexOf (c) != -1) {
				//val = true;
				contadorAcierto += 1;
			} else if (s.IndexOf (c) == -1) {
				contadordesacierto += 1;
			}
			
			return gameOver (out contadordesacierto);

		}

		public static bool gameOver (out int cont)
		{
			cont = contadordesacierto;
			if (cont == 6) {
				Console.WriteLine ("\n\n\t\t\tJUEGO TERMINADO...");
				Console.WriteLine ("\t\t\tLA PALABRA ERA: "+cadenaPalabra);
				return false;
			} else
				return true;
		}

		public static void insertar (char c, int p)
		{
			if (isCoincide (cadenaPalabra, c, p, out contadordesacierto)) {
				p = p - 1;
				buffe [p] = c;
			}
		}

		public static void menu ()
		{
			Console.WriteLine ("\tOpciones: \n\t\tF1_Insertar caracter en posicion dada." +
			"\n\t\tF2_Probar caracter.\n\t\tF3_Arriesga.\n\t\tF4_Mostrar palabra.\n\t\tF5_Salir.");
		
		}

		public static int validarEntrada (string str)
		{
			ConsoleKeyInfo co;
			bool var = true;
			int retorno = 0;
			while (var) {
				if (str == "F1") {
					retorno = 1;
					var = false;
				} else if (str == "F2") {
					retorno = 2;
					var = false;
				} else if (str == "F3") {
					retorno = 3;
					var = false;
				} else if (str == "F4") {
					retorno = 4;
					var = false;
				} else if (str == "F5") {
					retorno = 5;
					var = false;
				} else {
					Console.WriteLine ("ENTRADA NO VALIDA VUELVA A INTENTARLO");
					co = Console.ReadKey ();
					str = co.Key.ToString ();
				}

			}
			return retorno;
		}

		public static void jugarAhork2 ()
		{
			bool var = true;
			int valOpcion;
			char caract = '0';
			string stg = "";
			int posic;
			ConsoleKeyInfo co;

			cadenaPalabra = palabra (out n);
			creoBuilder (n);
			mascara (n);

			while (var) {
				for (int i = 0; i < 100; i++) {
					Console.WriteLine ("\n");
				}
//				Console.WriteLine (cadenaPalabra);
				Console.WriteLine ("\t" + buffe + "\n\n");

				Console.WriteLine ("Contador de desaciertos "+contadordesacierto+"\n\n\n");
				menu ();
				co = Console.ReadKey ();
				valOpcion = validarEntrada (co.Key.ToString ());
				switch (valOpcion) {
				case 1: 
					Console.Write ("Ingrese caracter: ");
					caract = Convert.ToChar (Console.ReadLine ());
					Console.Write ("\nIngrese posicion: ");
					posic = Convert.ToInt32 (Console.ReadLine ());
					insertar (caract, posic);
					var = control (cadenaPalabra, caract, out contadordesacierto, out contadorAcierto);
					break;
				case 2:
					Console.Write ("Ingrese caracter: ");
					caract = Convert.ToChar (Console.ReadLine ());
					reemplaceTodo (cadenaPalabra, caract);
					var = control (cadenaPalabra, caract, out contadordesacierto, out contadorAcierto);
					break;
				case 3:
					Console.Write ("Su palabra es: ");
					stg = Console.ReadLine ();
					if (stg.CompareTo (cadenaPalabra) != -1) {
						Console.WriteLine ("PALBRA CORRECTA");
						var = false;
					} else {
						contadordesacierto += 1;
					}
					break;
				case 4:
					Console.WriteLine (cadenaPalabra);
					
					break;
				case 5:					
					var = false;
					break;
				}

//				Console.WriteLine (">>"+caract);
				//var = control (cadenaPalabra, caract, out contadordesacierto, out contadorAcierto);
			}
		}

	}
}
