/*
Betti Rodas 14204
Cecilia Marsicovetere 14112
1 de octubre de 2015
ClaseVectorHeap
Esta clase implementa una cola de prioridad.


*/

import java.util.Comparator;
import java.util.PriorityQueue;
import java.io.*;

public class VectorHeap/*<E extends Comparable<E>> extends PriorityQueue<Paciente>*/  {

	private PriorityQueue<Paciente> colaPacientes;

	public VectorHeap(){
		colaPacientes = new PriorityQueue<Paciente>();
	}

//Este metodo crea los pacientes nuevos, por medio deun parametro que es lo que se lee en la ficha del paciente. Este se encarga de separar la cadena y guardar el paciente
	public void nuevoPaciente(String datosPaciente){

		String[] infoPaciente = datosPaciente.split(",");
		Paciente paciente = new Paciente(infoPaciente[0], infoPaciente[1], infoPaciente[2]);
		colaPacientes.add(paciente);
	}

//La lista completa agarra todos los elementos del heap y los concatena 
	public String listaCompleta(){
		String todaLaLista="";
		int cantidad =colaPacientes.size();
		for (int i=0; i< cantidad; i++){
			Paciente salida = colaPacientes.poll();
			todaLaLista = todaLaLista + "\n" + salida.toString(); 
		}
		return todaLaLista;
	}
	
