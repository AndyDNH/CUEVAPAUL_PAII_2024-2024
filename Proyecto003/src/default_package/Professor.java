package default_package;

public class Professor {
	
	private int id_profesor;
	private String name;
	private String lastName;
	private int age;
	
	
	
	public Professor(int id_profesor, String name, String lastName, int age) {
		super();
		this.id_profesor = id_profesor;
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}
	public int getId_profesor() {
		return id_profesor;
	}
	public void setId_profesor(int id_profesor) {
		this.id_profesor = id_profesor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	

}
