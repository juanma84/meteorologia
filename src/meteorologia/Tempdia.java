package meteorologia;

public class Tempdia {

	//atributos
	private int dia;
	private int mes;
	private int anio;
	private int temp_max;
	private int temp_min;
	
	//metodos
	public Tempdia(){
		dia=0;
		mes=0;
		anio=0;
		temp_max=0;
		temp_min=0;	
	}
	/**
	 * guarda la fecha de la medici�n, la temperatura m�xima registrada y la temperatura m�nima
	 * @param dia
	 * @param mes
	 * @param a�o
	 * @param temp_max
	 * @param temp_min
	 */
	
	public Tempdia(int dia, int mes, int anio, int temp_max, int temp_min){
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;
		this.temp_max=temp_max;
		this.temp_min=temp_min;	
	}

	public int getDia() {
		return dia;
	}
	/**
	 * metodo setDia
	 * @param dia
	 */

	public void setDia(int dia) {
		this.dia = dia;
	}
	
	/**
	 * metodo getMes
	 * @return el mes
	 */
	public int getMes() {
		return mes;
	}
	/**
	 * metodo setMes
	 * @param mes
	 */

	public void setMes(int mes) {
		this.mes = mes;
	}
	
	/**
	 * getA�o
	 * @returna�o
	 */
	public int getAnio() {
		return anio;
	}
	
	/**
	 * setA�o
	 * @param a�o
	 */

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	/**
	 * getTem_max
	 * @return temp_max
	 */
	public int getTemp_max() {
		return temp_max;
	}
	
	/**
	 * setTemp_max
	 * @param temp_max
	 */
	public void setTemp_max(int temp_max) {
		this.temp_max = temp_max;
	}
	/**
	 * getTemp_min
	 * @return temp_min
	 */

	public int getTemp_min() {
		return temp_min;
	}
	/**
	 * setTemp_min
	 * @param temp_min
	 */

	public void setTemp_min(int temp_min) {
		this.temp_min = temp_min;
	}
	/**
	 * metodo toString
	 */

	public String toString() {
		int media=(temp_max+temp_min)/2;
		return "TempDia [dia=" + dia + ", mes=" + mes + ", año=" + anio + ", temp_max=" + temp_max + ", temp_min="
				+ temp_min +"media ="+ media+ "]";
	}

	
	
}
