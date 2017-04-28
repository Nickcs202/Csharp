using System;

namespace DadoRecargado
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			Console.WriteLine ("Hello World!");

		}

	}

	public class Dado
	{

		private Random valor;

		public Dado ()
		{
			this.valor = new Random ();
		}

		public int Valor {
			get{ return this.valor.Next (1, 7); }
		}

		public int tirarDado ()
		{
			return Valor;
		}
	}

	public class Apuesta
	{

		private int valorDado;
		//private double ModoApuesta;
		private double valorApuesta;
		private bool ganador;


		public Apuesta (int valorDado, double valorApuesta, bool ganador)
		{
			this.valorDado = valorDado;
			this.valorApuesta = valorApuesta;
		}
		public int ValorDado{ set; get;}

		public double ValorApuesta{ set; get;}

		public bool Ganador{ set; get;}


		private int ModoApuesta (string opcion, bool gana)
		{
			int valor = 0;
			if (gana) {
				switch (opcion) {
				case "conservador":
					valor = 2;
					break;
				case "arriesgado":
					valor = 5;
					break;
				case "desesperado":
					valor = 15;
					break;
				}
			} else {
				switch (opcion) {
				case "conservador":
					valor = 1;
					break;
				case "arriesgado":
					valor = 2;
					break;
				case "desesperado":
					valor = 4;
					break;
				}
			}

			return valor;
		}

		public static string menuModoApuesta ()
		{
			string s = "";
			int valor = 0;

			Console.WriteLine ("\tElija el mono de apuesta: \n\t1-\tConservador (1/2).\n\t2-\tArriesgado (2/5).\n\t3-\tDesesperado (4/15).");
			valor = controlEntradaInt ();

			switch (valor) {
			case 1:
				s = "conservador";
				break;			
			case 2:
				s = "arriesgado";
				break;			
			case 3:
				s = "desesperado";
				break;
			}

			return s;
		}

		public static int controlEntradaInt ()
		{
			int valor = 0;
			bool cond = true;
			string value;

			while (cond) {
				//value=(Console.ReadKey ()+"");
				value = Console.ReadLine ();
				//if(value.CompareTo ("conservador") | value.CompareTo ("arriesgado") | value.CompareTo ("desesperado")){
				//if(value==1 | value==2 | value==3){
				if (value == ("1") | value == ("2") | value == ("3")) {
					valor = int.Parse (value);
					cond = false;
				} else {
					Console.WriteLine ("\n Opcion incorrecta...");
					cond = true;
				}

			}

			return valor;
		}



		public double ganoTanto ()
		{
			double valor = 0;
			return valor;
		}

		public double perdioTsnto ()
		{
			double valor = 0;
			return valor;
		}

	}

	public class Jugador
	{

		private string nombre;
		private Apuesta apt;
		private double dineroGanado;
		private double dineroPerdido;

public Jugador ()
		{
	
		}
		public Jugador (string nombre)
		{
			this.nombre = nombre;
		}

		public string Nombre{ set; get;}

		public Apuesta Apt{ set; get; }

		public double DineroGanado{ set; get;}

		public double DineroPerdido{ set; get;}

	}

	public class JugarDado
	{

		Jugador jugador1;
		Jugador jugador2;
		Dado d1;
		Dado d2;

		public JugarDado ()
		{
			jugador1 = new Jugador ();
			jugador2 = new Jugador ();
			d1 = new Dado ();
			d2 = new Dado ();
		}



	}
}
