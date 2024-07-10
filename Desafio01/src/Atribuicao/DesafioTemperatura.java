package Atribuicao;

public class DesafioTemperatura {
	public static void main(String[] args) {
		//(°F - 32) x 5.0/9.0 = °C
		// Essa forma foi como eu resolvi
		
		final double Fator = 5.0/9.0;
		final double Ajuste = 32;
		double Cel;
		double Far = 80;
		
		Cel = (Far - Ajuste) * Fator;
	
	System.out.println("Temperatura convertida para: " + Cel + "°C");
	


	// (°F - 32) x 5/9.0 = °C
	/**
	 *  Essa forma foi como o Professor do curso Passou
	 *  Na variavel Cel1, ele colocou o calculo direto
	 */
	
	final double Fator1 = 5.0/9.0;
	final double Ajuste1 = 32;
	double Far1 = 80;
	double Cel1 = (Far1 - Ajuste1) * Fator1;
	System.out.println("Temperatura convertida para: " + Cel1 + "°C");
	
	}

}	