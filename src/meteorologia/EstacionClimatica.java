package meteorologia;

import java.util.Scanner;
/**
 * 
 * @author Juanma
 *
 */
public class EstacionClimatica {
	
	
	// instance variables - replace the example below with your own
	
    private String nombre;
    private int año;
    private temphumdia mediciones[];  // Tabla de mediciones
    private int nummediciones;      // N�mero de mediciones almacenadas

    /**
     * Constructor for objects of class EstacionClimatica
     */
    
    public EstacionClimatica()
   
    {
         this.nombre = "";
         this.año = 2000;  
         mediciones = new temphumdia[366];  // Por si el a�o es bisiesto.  
         nummediciones = 0;
    }
    /**
     * Constructor con parametros
     * @param nombre
     * @param a�o
     */
    public EstacionClimatica( String nombre, int anyo)
    {
         this(); // Llamo al constructor por defecto
         this.nombre = nombre;
         this.año = anyo;
         
    }
    /**
     * si el a�o de la fecha
		corresponde con el a�o de la estaci�n, introduce el nuevo objeto en el vector
     * @param media
     * @return true si el a�o coincide y false si el a�o no coincide
     */
    public boolean addDia ( temphumdia media){
    	boolean metido=true;
    	for (int i = 0;i<mediciones.length;i++)
    	{
    		if (mediciones[i]==null)
    		{
    			mediciones[i] = media;
    			metido=true;
    		}
    		if(mediciones[i].getAnio()!=media.getAnio()) {
    			mediciones[i]=null;
    			metido=false;
    		}
    	}
        return metido; 
    }
    /*Un m�todo DelDia, que reciba una fecha y borre ese d�a si existen datos.*/
    /**
     * reciba una fecha y borre ese d�a si existen datos
     * @param media
     * @return true si ese dia ya estaba relleno, false en caso contrario
     */
    public boolean delDia ( temphumdia media){
    	boolean existe=true;
    	for (int i=0; i<mediciones.length;i++) {
    		if(mediciones[i].getDia()==media.getDia() && mediciones[i].getAnio()==media.getMes() && mediciones[i].getAnio()==media.getAnio()) {
    			mediciones[i]=null;
    			existe=true;
    		}
    		else {
    			existe=false;
    		}
    		
    	}
        return existe;  // COMPLETAR
    }
    /*Un m�todo ListarDias que te muestre en pantalla los datos de los d�as que hemos
     *  introducidos:fecha, temperatura m�xima, m�nima y media,
		humedad m�xima, m�nima y media.
     */
    /**
     * muestre en pantalla los datos de los d�as que hemos introducidos: fecha, temperatura m�xima, m�nima y media,
humedad m�xima, m�nima y media.

     */
    public void listarDias(){
        for(int i=0; i<mediciones.length;i++){
        	if(mediciones[i]!=null) {
        		mediciones[i].toString();
        	}
        	
        }
     
    }
    
    // M�todo auxiliar que me indica si una fecha es correcta
    /**
     * Comprueba que la fecha introducida sea correcta
     * @param dia
     * @param mes
     * @param a�o
     * @return true si la fecha es correcta y false en caso contrario
     */
    static boolean fechaOK ( int dia, int mes, int año){
    	boolean fecha=true;
        if(dia<=30 && (mes==4||mes==6||mes==9||mes==11)) {
        	fecha=true;
        }
        if(dia<=31 && (mes==1||mes==3||mes==7||mes==8||mes==10||mes==12)) {
        	fecha=true;
        }
        if(dia<=28 && mes==2) {
        	fecha=true;
        }
        else {
        	fecha=false; 
        }
       
       return fecha;
    }
    /**
     * lee medida
     * @return true si hay error, false en caso contrario
     */
    static temphumdia leerMedida () {

        Scanner leer = new Scanner(System.in);
        int dia,mes,año, tempmax, tempmin, hummax, hummin;
        temphumdia  medicion = null;
        
       boolean error = true;
       do {
       System.out.println("Dia:"); dia = leer.nextInt();
       System.out.println("Mes:");  mes = leer.nextInt();
       System.out.println("Año:");  año = leer.nextInt();
 
       if ( fechaOK( dia,mes,año) ) {
            System.out.println ( " T� M�xima:"); tempmax = leer.nextInt();
            System.out.println ( " T� M�nima:"); tempmin = leer.nextInt();
            System.out.println ( " H� M�xima:"); hummax = leer.nextInt();
            System.out.println ( " H� M�nima:"); hummin = leer.nextInt();
            medicion = new temphumdia ( dia,mes,año, tempmax, tempmin, hummax, hummin);
            error = false;
           }
       else
       {
           System.out.println(" Fecha �rronea");
       }
   
   } while (  error);
   
   return medicion;
    }
}