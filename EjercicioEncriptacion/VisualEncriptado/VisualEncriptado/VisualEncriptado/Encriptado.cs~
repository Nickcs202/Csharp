public class Encriptado
{

	public string encriptado(string s, int n){
		
		s = s.ToLower ();//Pasa el string a ninuscula.
		string s2 = "";
		string[] s3 = s.Split (' ');//Parseo el estring por sus espacios y lo asigno a un arreglo.
		string abc = "aábcdeéfghiíjklmnñoópqrstuúüvwxyzaábcdeéfghiíjklmnñoópqrstuúüvwxyz";//Cadena de comparacion.

		int pos = 0;//Variable a la que se le asigna la posicion del caracter comparado.
		for (int i = 0; i < s3.Length; i++) {
			for (int j = 0; j < s3[i].Length; j++) {
				pos = abc.IndexOf (s3[i].ToString ()[j]);//Se recorre caracter a caracter, al existir coincidencia se devuelve esa posicion.

				if (s3 [i].ToString () [j].CompareTo (',') == 0) {//Si encuentro una coma solo la concateno.
					s2 += ",";
				}else

					if(s3 [i].ToString () [j].CompareTo ('.') == 0) {//Si encuentro un punto solo lo concateno.
						s2 += ".";
					}
					else {
						s2 += abc [pos + n];//Camvio cada cracter por su equivalente segun clave.
					}
			}
			s2 += " ";//Le agrego un espacio al final de cada cadena para separar las palabras.
		}


		return s2;//retorno el estring cambiado.
	}//Fin metodo encriptado.

}