package sumador;
 
import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		
	ASumar a = new ASumar();
	Scanner scanner = new Scanner(System.in);

	String numero;
	System.out.print("Introduce un numero: ");
	numero = scanner.nextLine();
	
	String solucion = a.sumaruno(numero);
	
	scanner.close();	
	
	}

}
