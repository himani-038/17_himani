package third_project;
//Write a Java program that creates a class hierarchy for employees of a company. 
//The base class should be Employee, with subclasses Manager, Developer, and Programmer. 
//Each subclass should have properties such as name, address, salary, and job title. 
//Implement methods for calculating bonuses, generating performance reports, and managing projects.
class Employee{
	String name;
	String address;
	int salary;
	String jobtitle;
	
	public Employee(String name, String address, int salary, String jobtitle) {
		this.name = name;
		this.address = address;
		this.salary= salary;
		this.jobtitle = jobtitle;
	}
class Manager extends Employee{
	public Manager(String name, String address, int salary, String jobtitle){
		super(name, address, salary, jobtitle);
		}
	}
class Developer extends Employee{
	public Developer(String name, String address, int salary, String jobtitle){
		super(name, address, salary, jobtitle);
		}
	}
class Programmer extends Employee{
	public Programmer(String name, String address, int salary, String jobtitle){
		super(name, address, salary, jobtitle);
		}
	}
public class Demo3 {

	public static void main(String[] args) {
	}
}
}