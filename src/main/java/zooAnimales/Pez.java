package zooAnimales;
import java.util.ArrayList;
public class Pez extends Animal{
	static private ArrayList<Pez> listado=new ArrayList<>();
	public static int bacalaos;
	public static int salmones;
	private String colorEscamas;
	private int cantidadAletas;
	
	public String movimiento() {
		return "nadar";}
	
	public static Pez crearSalmon(String nombre,int edad, String genero) {
		Pez p=new Pez();
		p.setEdad(edad);p.setGenero(genero);p.setNombre(nombre);
		p.colorEscamas ="rojo"; p.cantidadAletas = 6 ;p.setHabitat("oceano");
		salmones++;
		listado.add(p);
		return p;}
	
	public static Pez crearBacalao(String nombre,int edad, String genero) {
		Pez p=new Pez();
		p.setEdad(edad);p.setGenero(genero);p.setNombre(nombre);
		p.colorEscamas ="gris"; p.cantidadAletas = 6 ;p.setHabitat("oceano");
		bacalaos++;
		listado.add(p);
		return p;}
	
	public int cantidadAves() {
		return salmones+bacalaos;}

}
