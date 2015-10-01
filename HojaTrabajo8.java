 /*
Betti Rodas 14204
Cecilia Marsicovetere 14112
1 de octubre de 2015


HOJA DE TRABAJO 8

en esta se ecuentra el main. El main hace la lectura del archivo, agregando cada linea al priority heap.
*/


import java.io.*;

public class HojaTrabajo8 {
	public static void main(String[] args) {
		
	   	  File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;

	      //crea un objeto
	      VectorHeap pacientes = new VectorHeap();
	      
	      try {
	         archivo = new File ("pacientes.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	 
	         // Lectura del fichero
	         
	         String linea;
	         System.out.println();
			System.out.println("Los pacientes son:");
	         while((linea=br.readLine())!=null){
	         	//si todavia hay datos, agarra la linea completa y la agrega a la prioridad
	        	 pacientes.nuevoPaciente(linea);
	        	 System.out.println(linea);
	         }

	         System.out.println();
	         System.out.println();
	         System.out.println();
	         System.out.println("Los pacientes seran atendidos en este orden:");
	 		

	 		//imprime la lista de la cola ordenada
	         String lista = pacientes.listaCompleta();
	         System.out.println(lista);
	      }




	      	//en caso que falle la lectura del archivo
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
		
	}
}

