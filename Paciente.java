


public class Paciente  implements Comparable<Paciente> {

//atributos
private String nombre;
private String diagnostico;
private String prioridad;

	//metodos
	public Paciente(){
		nombre="";
		diagnostico="";
		prioridad="";
	}

	public Paciente(String nombre;String diagnostico; String prioridad){
		this.nombre=nombre;
		this.diagnostico=diagnostico;
		this.prioridad=prioridad;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setDiagnostico(String diagnostico){
		this.diagnostico=diagnostico;
	}
	public void setPrioridad(String prioridad){
		this.prioridad=prioridad;
	}
	public String getNombre(){
		return nombre;
	}
	public String getDiagnostico(){
		return diagnostico;
	}
	public String getPrioridad(){
		return prioridad;
	}
	public String toString(){
		String estado= nombre+","+diagnostico+","+prioridad;
		return estado;
	}

	public int compareTo(Persona comparacion){
		int estado;
		String prioridadActual = prioridad;
		String prioridadComparada = comparacion.getPrioridad;
		char prioridadUno = prioridadActual.charAt(0);
		char prioridadDos = prioridadComparada.charAt(0);
		(int)character;

	}
}
