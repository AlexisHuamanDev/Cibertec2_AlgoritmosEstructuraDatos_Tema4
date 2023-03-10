package lib;

public class Libreria {

	//  Constructor por defecto
	public Libreria() {
	}
	//  Métodos static públicos de clase
	public static int longitud(String s) {
		return s.length();
	}
	public static char ultimoCaracter(String s) {
		return s.charAt(longitud(s) - 1);
	}
	public static String soloUnEspacioEntrePalabras(String s) {
		String texto = "";
		char caracter;
		for (int i=0; i<longitud(s); i++) {
			caracter = s.charAt(i);
			if (!(caracter == ' '  &&  ultimoCaracter(texto) == ' '))
				texto += caracter;
		}
		return texto;
	}
	public static String enMayusculas(String s) {
		return s.toUpperCase(); 
	}	
	public static String dataCorregida(String s1, String s2, String s3) {
		return enMayusculas(s1) + ' ' + enMayusculas(s2) + ", " + enMayusculas(s3);
	}
	
}