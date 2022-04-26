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
	
	public void setListado(ArrayList<Pez> listado) {
		this.listado=listado;}
	public static ArrayList<Pez> getListado(){
		return listado;}

	public Pez(String nombre,int edad,String habitat,String genero,String colorEscamas,int cantidadAletas) {
		super(nombre,edad,habitat,genero);
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
		listado.add(this);}
	public Pez() {
		listado.add(this);}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas=colorEscamas;}
	public String getColorEscamas() {
		return colorEscamas;}
	
	
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas=cantidadAletas;}
	public int getCantidadAletas() {
		return cantidadAletas;}
	
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
	
	public static int cantidadAves() {
		return salmones+bacalaos;}

}
