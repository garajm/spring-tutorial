package sk.garaj.spring.tutorial.app;

public class Person {
	
	private int id;
	private String name;
	
	private int taxId;
	
	public Person() {
		
	}
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void speak() {
		System.out.println("Hello! I am a person.");
	}
	
	public String toString() {
		return "Person [id=" + this.id + ", name=" + this.name + ", taxId=" + this.taxId + "]";
	}

	public int getTaxId() {
		return taxId;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}
}
