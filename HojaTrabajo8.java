
import java.io.*;

public class HojaTrabajo8 {
	public static void main(String[] args) {
		
	   	  File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      VectorHeap pacientes = new VectorHeap();
	      
	      try {
	         archivo = new File ("pacientes.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	 
	         // Lectura del fichero
	         
	         String linea;
	         
	         while((linea=br.readLine())!=null){
	        	 pacientes.nuevoPaciente(linea);
	         }
	 		
	         String lista = pacientes.listaCompleta();
	         System.out.println(lista);
	      }

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
