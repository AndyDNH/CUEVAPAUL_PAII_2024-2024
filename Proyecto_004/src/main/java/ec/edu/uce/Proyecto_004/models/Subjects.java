package ec.edu.uce.Proyecto_004.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subjects")
public class Subjects {
	
	@Id
	@Column(name ="id_materias")
	private int id;
	@Column(name ="name")
	private String name;
	@Column(name ="description")
	private String description;
	@Column(name ="level")
	private String level;
	
	
	public Subjects(int id, String name, String description, String level) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.level = level;
	}
	public Subjects() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	
		
	
	
	
	
	

}
