package sumador;

public class ASumar {
	
	public String sumaruno ( String numero) {
		int sumar = 0;
		if ( Integer.parseInt(numero) > 0) {
			for(int i = 0; i < numero.length() ; i++) {
				char solucion = numero.charAt(i);
				sumar = sumar + Character.getNumericValue(solucion);
				System.out.println(solucion);
			}			
		}else {
			return "Negativo. Siempre negativo";
		}
		return String.valueOf(sumar);
	}
}
