
import java.util.Comparator;
import java.util.PriorityQueue;
import java.io.*;

public class VectorHeap implements PriorityQueue<Paciente> {

	private PriorityQueue<Paciente> colaPacientes;

	public VectorHeap(object E){
		colaPacientes = new PriorityQueue<Paciente>;
	}

	public void nuevoPaciente(String datosPaciente){
                String[] infoPaciente = new String[3];
		infoPaciente = datosPaciente.split(",");
		Paciente paciente = new Paciente(infoPaciente[0], infoPaciente[1], infoPaciente[2]);
		colaPacientes.add(paciente);
	}


	public String listaCompleta(){
		String todaLaLista = null;
		int cantidad =colaPacientes.size();
		for (int i=0; i< cantidad; i++){
			Paciente atendido = colaPacientes.poll();
			todaLaLista = todaLaLista + "\n" + atendido.toString(); 
		}
		return todaLaLista;
	}
	
}

