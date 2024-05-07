package default_package;

public class Schedule {
	
	private int id_horarios;
	private int id_materias;
	private int id_alumnos;
	private int id_profesor;
	private String horaInicio;
	private String horaFin;
	private int dia;
	
	
	
	public Schedule(int id_horarios, int id_materias, int id_alumnos, int id_profesor, String horaInicio,
			String horaFin, int dia) {
		super();
		this.id_horarios = id_horarios;
		this.id_materias = id_materias;
		this.id_alumnos = id_alumnos;
		this.id_profesor = id_profesor;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.dia = dia;
	}

	public int getId_horarios() {
		return id_horarios;
	}

	public void setId_horarios(int id_horarios) {
		this.id_horarios = id_horarios;
	}

	public int getId_materias() {
		return id_materias;
	}

	public void setId_materias(int id_materias) {
		this.id_materias = id_materias;
	}

	public int getId_alumnos() {
		return id_alumnos;
	}

	public void setId_alumnos(int id_alumnos) {
		this.id_alumnos = id_alumnos;
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

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}



}
