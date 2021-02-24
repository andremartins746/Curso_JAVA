import java.util.Scanner;
import java.util.Locale;

public class exe_IF_ELSE06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double numero = sc.nextInt();
		
		if(numero >= 0 && numero <= 25) {
			System.out.println("INTERVALO ENTRE [0,24]");
		}
		else if(numero >= 25 && numero < 75) {
			System.out.println("INTERVALO ENTRE [25,74]");
		}
		else if(numero >= 75 && numero <= 100) {
			System.out.println("INTERVALO ENTRE [75,100]");
		}
		else {
			System.out.println("NUMERO FORA DO INTERVALO...");
		}
		
		sc.close();
	}
}