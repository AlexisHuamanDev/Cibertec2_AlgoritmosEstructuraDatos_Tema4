package lib;

	/** 
	 * 	        .---.---.---.---.---.---.---.---.---.---.---.---.---.---.---.---.---.---.---.---.---.---.---.---.---.
	 *	s  ==>  |'J'|'a'|'v'|'a'|' '|'e'|'s'|' '|'m'|'e'|'j'|'o'|'r'|' '|'e'|'n'|' '|'C'|'i'|'b'|'e'|'r'|'t'|'e'|'c'|
	 *          '---'---'---'---'---'---'---'---'---'---'---'---'---'---'---'---'---'---'---'---'---'---'---'---'---'
	 *            0   1   2   3   4   5   6   7   8   9   10  11  12  13  14  15  16  17  18  19  20  21  22  23  24
	 */

public class Libreria {

	//  Constructor por defecto
	public Libreria() {
	}
	//  Métodos static públicos de clase
	public static int longitud(String s) {
		return s.length();
	}
	public static char primerCaracter(String s) {
		return s.charAt(0);
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
	public static int cantidadDePalabras(String s) {
		int cp = 1;
		for (int i=0; i<longitud(s); i++) {
			if (s.charAt(i) == ' ')
				cp ++;
		}
		return cp;
	}
	public static String enMinusculas(String s) {
		return s.toLowerCase(); 
	}
	public static String enMayusculas(String s) {
		return s.toUpperCase(); 
	}
	public static String espaciosPorGuiones(String s) {
		return s.replace(' ', '-');
	}
	public static int posPrimerEspacio(String s) {
		return s.indexOf(' ');
	}	
	public static String primeraPalabra(String s) {
		int pos = posPrimerEspacio(s);
		if (pos == -1)
			return s;
		else
			return s.substring(0, pos);
	}
	public static int posUltimoEspacio(String s) {
		return s.lastIndexOf(' ');
	}
	public static String ultimaPalabra(String s) {
		int pos = posUltimoEspacio(s);
		return s.substring(pos + 1);
	}
	public static String sinPrimeraPalabra(String s) {
		int pos = posPrimerEspacio(s);
		return s.substring(pos + 1);
	}
	public static String sinUltimaPalabra(String s) {
		int pos = posUltimoEspacio(s);
		if (pos == -1)
			return s;
		else
			return s.substring(0, pos);
	}
	public static String primeraPalabraAlFinal(String s) {
		if (cantidadDePalabras(s) == 1)
			return s;
		else
			return sinPrimeraPalabra(s) + ' ' + primeraPalabra(s);
	}
	public static String ultimaPalabraAlInicio(String s) {
		if (cantidadDePalabras(s) == 1)
			return s;
		else
			return ultimaPalabra(s) + ' ' + sinUltimaPalabra(s);
	}

}