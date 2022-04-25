package zooAnimales;
import java.util.ArrayList;
public class Reptil extends Animal {
	static private ArrayList<Reptil> listado=new ArrayList<>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	
	public void setListado(ArrayList<Reptil> listado) {
		this.listado=listado;}
	
	public static Reptil crearIguana(String nombre,int edad, String genero) {
		Reptil r=new Reptil();
		r.setEdad(edad);r.setGenero(genero);r.setNombre(nombre);
		r.colorEscamas ="blanco"; r.largoCola = 1 ;r.setHabitat("jungla");
		iguanas++;
		listado.add(r);
		return r;}
	
	public static Reptil crearSerpiente(String nombre,int edad, String genero) {
		Reptil r=new Reptil();
		r.setEdad(edad);r.setGenero(genero);r.setNombre(nombre);
		r.colorEscamas ="verde"; r.largoCola = 3 ;r.setHabitat("humedal");
		serpientes++;
		listado.add(r);
		return r;}
	
	public String movimiento() {
		return "reptar";
	}
	public int cantidadAves() {
		return serpientes+iguanas;}

}
