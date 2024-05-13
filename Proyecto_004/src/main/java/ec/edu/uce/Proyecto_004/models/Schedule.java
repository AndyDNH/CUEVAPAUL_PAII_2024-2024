package ec.edu.uce.Proyecto_004.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="schedule")
public class Schedule {
	
	@Id
	@Column(name ="id_horario")
	private int id;
	@Column(name ="id_materias")
	private int id_materias;
	@Column(name ="id_alumno")
	private int id_alumno;
	@Column(name ="id_profesor")
	private int id_profesor;
	@Column(name ="name")
	private String horaInicio;
	@Column(name ="last_name")
	private String horaFin;
	@Column(name ="dia")
	private String day;
	
	
	
	public Schedule(int id, int id_materias, int id_alumno, int id_profesor, String horaInicio, String horaFin,
			String day) {
		super();
		this.id = id;
		this.id_materias = id_materias;
		this.id_alumno = id_alumno;
		this.id_profesor = id_profesor;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.day = day;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_materias() {
		return id_materias;
	}
	public void setId_materias(int id_materias) {
		this.id_materias = id_materias;
	}
	public int getId_alumno() {
		return id_alumno;
	}
	public void setId_alumno(int id_alumno) {
		this.id_alumno = id_alumno;
	}
	public int getId_profesor() {
		return id_profesor;
	}
	public void setId_profesor(int id_profesor) {
		this.id_profesor = id_profesor;
	}
	public String getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	public String getHoraFin() {
		return horaFin;
	}
	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	
	


}
