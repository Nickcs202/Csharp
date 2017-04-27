using System;

namespace ejercicio
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			//Console.WriteLine ("Hello World!");
			int[,] d = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
			int[] a=new int[12];
			a=det (d);
			for (int i = 0; i < 12; i++) {
				Console.WriteLine (a[i]+" ");
			}
		}

		public static int[] det (int[,] d)
		{
			int n = 0;
			int[] aux=new int[12];

			for (int k = 0; k < 3; k++) {
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						//Console.WriteLine ("");
						if (i != 0) {
							if (j != k) {
								Console.WriteLine ("D= " + d [i, j]);
								aux [n] = d [i, j];
								n++;
							}
						}
					}
				}
				Console.WriteLine ("");
			}
			return aux;
		}

	}
}
