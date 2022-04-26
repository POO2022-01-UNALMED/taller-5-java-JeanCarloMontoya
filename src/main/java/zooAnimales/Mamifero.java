package zooAnimales;
import java.util.ArrayList;
public class Mamifero extends Animal {
	static private ArrayList<Mamifero> listado=new ArrayList<>();;
	static public int caballos;
	static public int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre,int edad,String habitat,String genero,boolean pelaje,int patas) {
		super(nombre,edad,habitat,genero);
		this.pelaje=pelaje;
		this.patas=patas;
		listado.add(this);}
	public Mamifero() {
		listado.add(this);}
	
	public  void setListado(ArrayList<Mamifero> listado) {
		this.listado=listado;}
	public static ArrayList<Mamifero> getListado(){
		return listado;}
	
	public void setPelaje(boolean pelaje) {
		this.pelaje=pelaje;}
	public boolean isPelaje() {
		return pelaje;}
	public void setPatas(int patas) {
		this.patas=patas;}
	public int getPatas() {
		return patas;}
	
	
	public static int cantidadMamiferos() {
		return Mamifero.caballos + Mamifero.leones;}
	
	public static Mamifero crearCaballo(String nombre,int edad,String genero) {
		Mamifero m=new Mamifero();
		m.setNombre(nombre); m.setEdad(edad); m.setGenero(genero);
		Mamifero.caballos++;
		m.patas=4;
		m.pelaje=true;
		m.setHabitat("pradera");
		listado.add(m);
		return m;}
		
	public static  Mamifero crearLeon(String nombre,int edad,String genero) {
		Mamifero m=new Mamifero();
		m.setNombre(nombre); m.setEdad(edad); m.setGenero(genero);
		Mamifero.leones++;
		m.patas=4;
		m.pelaje=true;
		m.setHabitat("selva");
		listado.add(m);
		return m;}
		
		
		
		
	
	

}
