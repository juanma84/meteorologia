package meteorologia;

/**
 * 
 * @author Juanma
 *
 */
public class testmet {

	
		/*
		 * En el programa principal crea una estaci�n, introduce cinco d�as pedidas por  teclado (si la fecha no es correcta te la tiene que volver a pedir) y lista esos d�as.
		Luego borra dos (pedida por teclado y valid�ndola de nuevo) y los vuelve a listar.
		 *
		 */
	/**
	 * metodo main
	 * @param argv
	 */
		public static void main (  String [] argv ){
		        
		        EstacionClimatica estacion  = new EstacionClimatica("Burgos",2017);
		       

		        System.out.println(" Introducir 5 medidas :");
		        

		        for (int i=0; i< 5; i++){
		             temphumdia  medicion = EstacionClimatica.leerMedida ();
		             estacion.addDia( medicion);
		        }
		        
		       estacion.listarDias();
		        
		       System.out.println("Introduca 2 medidas a Borrar:");
		       temphumdia  medida1 = EstacionClimatica.leerMedida();
		       temphumdia  medida2 = EstacionClimatica.leerMedida();
		       
		       estacion.delDia(medida1);
		       estacion.delDia(medida2);

		       
		       estacion.listarDias();      


	}

}
