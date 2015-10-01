/*
Betti Rodas 14204
Cecilia Marsicovetere 14112
1 de octubre de 2015

Clase Paciente.
Es una ficha con la informacion del paciente; nombre, diagnostico y prioridad.

*/

public class Paciente implements Comparable<Paciente>{

//atributos
private String nombre;
private String diagnostico;
private String prioridad;

	//metodos
	//constructores
	public Paciente(){
		nombre="";
		diagnostico="";
		prioridad="";
	}

	public Paciente(String nombre,String diagnostico, String prioridad){
		this.nombre=nombre;
		this.diagnostico=diagnostico;
		this.prioridad=prioridad;
	}


	//sets
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setDiagnostico(String diagnostico){
		this.diagnostico=diagnostico;
	}
	public void setPrioridad(String prioridad){
		this.prioridad=prioridad;
	}
	
	//gets
	public String getNombre(){
		return nombre;
	}
	public String getDiagnostico(){
		return diagnostico;
	}
	public String getPrioridad(){
		return prioridad;
	}
	
	
	//toString
	public String toString(){
		String estado= nombre+","+diagnostico+","+prioridad;
		return estado;
	}



	//el compareTO compara los pacientes segun el caracter ascci de su prioridad
	public int compareTo(Paciente comparacion){
		//int estado;
		//obtiene el valor Ascii  
		String prioridadActual = prioridad;
		String prioridadComparada = comparacion.getPrioridad();
		char prioridadUno = prioridadActual.charAt(0);
		char prioridadDos = prioridadComparada.charAt(0);
		int actual = (int)prioridadUno;
		int comparada = (int)prioridadDos;
		/*
		int actual = (int)getPrioridad().charAt(0);
		int comparada = (int)prioridadDos;
*/		//compara los ints
		if (actual<comparada){
			return -1;
		}
		if (actual>comparada){
			return 1;
		}
		if (actual==comparada){
			return 0;
		}
		return 0;

	}

}
