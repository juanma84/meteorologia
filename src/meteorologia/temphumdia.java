package meteorologia;

public class temphumdia extends Tempdia{
	//atributos
		private int hum_max;
		private int hum_min;
		
	//constructor
		/**
		 * Constructor
		 * @param dia
		 * @param mes
		 * @param a�o
		 * @param temp_max
		 * @param temp_min
		 * @param hum_max
		 * @param hum_min
		 */
		public temphumdia(int dia, int mes, int anio, int temp_max, int temp_min,int hum_max, int hum_min) {
			super(dia,mes,anio, temp_max, temp_min);
			this.hum_max=hum_max;
			this.hum_min=hum_min;
		}
	//redefinir metodos
		/**
		 * getHum_max
		 * @return hum_max
		 */
		public int getHum_max() {
			return hum_max;
		}
		
		/**
		 * setHum_max
		 * @param hum_max
		 */

		public void setHum_max(int hum_max) {
			this.hum_max = hum_max;
		}
		
		/**
		 * getHum_min
		 * @return hum_min
		 */

		public int getHum_min() {
			return hum_min;
		}
		
		/**
		 * setHum_min
		 * @param hum_min
		 */

		public void setHum_min(int hum_min) {
			this.hum_min = hum_min;
		}
		
		/**
		 * metodo toString
		 */

		public String toString() {
			String frase=super.toString();
			int medh=(hum_max+hum_min)/2;
			return frase+" TempHumDia [hum_max=" + hum_max + ", hum_min=" + hum_min + "hum_media: "+medh +" ]";
		}
		
		
		

}