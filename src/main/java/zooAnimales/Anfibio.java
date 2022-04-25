package zooAnimales;
import java.util.ArrayList;
public class Anfibio extends Animal {
	static private ArrayList<Anfibio> listado=new ArrayList<>();
	static public int ranas;
	static public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	
	public String movimiento() {
		return "saltar";}
	
	public static Anfibio crearRana(String nombre,int edad, String genero) {
		Anfibio a=new Anfibio();
		a.setEdad(edad);a.setGenero(genero);a.setNombre(nombre);
		a.colorPiel ="rojo"; a.venenoso = true ;a.setHabitat("selva");
		ranas++;
		listado.add(a);
		return a;}
	
	public static Anfibio crearSalamandra(String nombre,int edad, String genero) {
		Anfibio a=new Anfibio();
		a.setEdad(edad);a.setGenero(genero);a.setNombre(nombre);
		a.colorPiel ="negro y amarillo"; a.venenoso = false ;a.setHabitat("selva");
		salamandras++;
		listado.add(a);
		return a;}
	
	public int cantidadAnfibios() {
		return ranas+salamandras;
	}

}
