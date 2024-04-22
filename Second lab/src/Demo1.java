class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println(name + " "+ age);
	}
}
class Dog{
	String breed;
	String name;
	
	public Dog(String breed, String name) {
		this.breed= breed;
		this.name= name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void display() {
		System.out.println(breed + " "+ name);
	}
}
public class Demo1 {
	
		public static void main(String[] args) {
		Person p1= new Person("Himani",17);
		Person p2= new Person("Himanshi",19);
		//p1.display();
		//p2.display();
		
		Dog d1= new Dog("Labrador","Pluto");
		Dog d2= new Dog("Golden Retriver","Bru");
		d1.display();
		d2.display();
		
		d1.setBreed("Husky");
		d2.setName("Dino");
		d1.display();
		d2.display();
		int [][]arr={{1,2,3,4}, {1,2}, {1,2,3,4,5}};
	}
}

