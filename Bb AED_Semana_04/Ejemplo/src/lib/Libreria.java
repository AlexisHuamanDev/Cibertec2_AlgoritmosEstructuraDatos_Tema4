package lib;

public class Libreria {
	
    //  Constante pública de clase 
    public static final double PI = 3.1416;
	//  Constructor por defecto
	public Libreria() {
	}
	//  Método público de clase 
	public static int aleatorio(int min, int max) {
		return (int)((max - min + 1) * Math.random()) + min;
	}
	
}