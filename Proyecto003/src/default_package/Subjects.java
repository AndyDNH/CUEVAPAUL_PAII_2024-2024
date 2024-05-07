package default_package;

public class Subjects {
	
	private int id_materias;
	private String name;
	private String description;
	private int level;
	
			
	public Subjects(int id_materias, String name, String description, int level) {
		super();
		this.id_materias = id_materias;
		this.name = name;
		this.description = description;
		this.level = level;
	}
	public int getId_materias() {
		return id_materias;
	}
	public void setId_materias(int id_materias) {
		this.id_materias = id_materias;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	

}
