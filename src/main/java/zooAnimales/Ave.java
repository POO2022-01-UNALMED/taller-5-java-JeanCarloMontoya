package zooAnimales;
import java.util.ArrayList;
public class Ave extends Animal {
	static private ArrayList<Ave> listado=new ArrayList<>();
	static public int halcones;
	static public int aguilas;
	private String colorPlumas;
	
	
	public void setListado(ArrayList<Ave> listado) {
		this.listado=listado;}
	public  static ArrayList<Ave>  getListado(){
		return listado;}
	
	public Ave(String nombre,int edad,String habitat,String genero,String colorPlumas) {
		super(nombre,edad,habitat,genero);
		this.colorPlumas=colorPlumas;
		listado.add(this);}
	public Ave() {
		listado.add(this);}
	
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas=colorPlumas;}
	public String getColorPlumas() {
		return colorPlumas;}

	
	public static Ave crearHalcon(String nombre,int edad,String genero) {
		Ave a=new Ave();
		a.setEdad(edad);a.setGenero(genero);a.setNombre(nombre);
		a.colorPlumas="cafe glorioso";
		a.setHabitat("montanas");
		a.halcones++;
		listado.add(a);
		return a;}
	
	public static  Ave crearAguila(String nombre,int edad,String genero) {
		Ave a=new Ave();
		a.setEdad(edad);a.setGenero(genero);a.setNombre(nombre);
		a.colorPlumas="blanco y amarillo";
		a.setHabitat("montanas");
		aguilas++;
		listado.add(a);
		return a;}
	
	
	public static int cantidadAves() {
		return halcones+aguilas;}
	
	public String movimiento() {
		return "volar";
	}
	

}
