package Poo;

/**
 * 
 * @author Jorge Valadez
 *PersonTest Class
 *
 */

public class PersonTest {
	
	public static void main(String[] args) {
		Person person1 = new Person();
		
		Person person2 = new Person();
		
		person1.setName("Jorge");
		person1.setLastname("Valadez");
		person1.setAge(26);
		person2.setName("Alberto");
		
		System.out.println(person1.getState().getName());
		
		City city = new City();
		city.setId(2);
		city.setName("Apodaca");
		
		person1.setCity(city);
		person1.getCity().setName("Guadalupe");
		
		System.out.println(person1.toString());
		
		System.out.println();
		System.out.println(person2.toString());
	}

}
