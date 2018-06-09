package Poo;

/**
 * 
 * @author Jorge Valadez
 * Person class
 *
 *Plain Old Object (Pojo)
 *
 */

public class Person {
	/*
	 * Variables de instancia
	 */
	
	/*
	 * Modificaciones de acceso:
	 * public: Existen para todo el proyecto
	 * private: Solo existen para la cclase en la que se definen
	 * protected: Existen para la jerarquia de herencia de la clase
	 * default: Existen para todo el paquete en el que se encuentra la clase
	 * 
	 */
	private String name;
	
	private String lastname;
	
	private int age;
	
	private City city;
	
	private State state;
	
	/*
	 * Getters & Setters
	 */
	 
	 //Constructor vacio
	
 public Person(){
	City city = new City();
	city.setId(1);
	city.setName("Monterrey");
	
	State state = new State();
	state.setId(1);
	state.setName("Nuevo Leon");
	state.setAbbv("NL");
	
	this.city = city;
	this.state = state;
}
	
	
	/*
	 * Metodos
	 */
	
	public void run() {
		System.out.println("Person is runnig...");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public void eat() {
		System.out.println("Person in eating...");
	}
}
	
	
	
