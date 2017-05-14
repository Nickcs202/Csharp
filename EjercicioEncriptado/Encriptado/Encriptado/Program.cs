using System;

namespace Encriptado
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			
			string s = "Mb fcyb dhrqb zbFgéñér yñ dhRérñ, gi rérf ehüra yñ gÜrar ehr ñgéñjrFñé.";
			
			Console.WriteLine (encriptado (s,16));


		}


		public static string encriptado(string s, int n){
			s = s.ToLower ();
			string s2 = "";
			string[] s3 = s.Split (' ');
			string abc = "aábcdeéfghiíjklmnñoópqrstuúüvwxyzaábcdeéfghiíjklmnñoópqrstuúüvwxyz";

			int pos = 0;
			for (int i = 0; i < s3.Length; i++) {
				for (int j = 0; j < s3[i].Length; j++) {
					pos = abc.IndexOf (s3[i].ToString ()[j]);

					if (s3 [i].ToString () [j].CompareTo (',') == 0) {
						s2 += ",";
					}else

						if(s3 [i].ToString () [j].CompareTo ('.') == 0) {
							s2 += ".";
						}
						else {
							s2 += abc [pos + n];
						}
				}
				s2 += " ";
			}


			return s2;
		}
	}
}
