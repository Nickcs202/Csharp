using System;

namespace Ejercicio_2
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			
			string s;
			bool v;
			Console.WriteLine ("Ingrese un texto..");
			s = Console.ReadLine ();

			v = ControlTexto (s);
		if(v==true){
			MenuOpciones (s);
		}


		}
	public static bool ControlTexto(string s){
		bool variable = false;
			if (s.Length == 0) {
				Console.WriteLine ("\n\tEntrada vacia");
				
			} else {
				Console.WriteLine ("\n\tEn trada correcta");
			variable = true;
			}
			return variable;
		}

	public static string CapturarOpcion(){
		string s="";
		ConsoleKeyInfo cki;

		cki = Console.ReadKey();
		s=(cki.Key.ToString());

			return s;
		}
	public static void MenuOpciones(string stg){
			string s;

		Console.WriteLine ("\n\tElija una opcion...\n");
		Console.WriteLine ("F1: Texto en Mayuscula.");
		Console.WriteLine ("F2: Texto en minuscula.");
		Console.WriteLine ("F3: Texto original.");

			s = CapturarOpcion ();
			switch (s) {
			case "F1":
			Console.WriteLine ("\n\n"+stg.ToUpper ());
				break;
			case "F2":
			Console.WriteLine ("\n\n"+stg.ToLower());
				break;
			case "F3":
			Console.WriteLine ("\n\n"+stg);
				break;
			default:
				Console.WriteLine ("\n\tOpcion incorrecta...");
				break;
		}

		}
	}
}
