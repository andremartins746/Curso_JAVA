import java.util.Locale;
import java.util.Scanner;

public class exe05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codp1, nump1, codp2, nump2;
		
		double vl1, vl2, valor_a_pagar;
		
		System.out.println("digite o codigo da pe�a 1: ");
		codp1 = sc.nextInt();
		System.out.println("digite o numero de pe�a 1: ");
		nump1 = sc.nextInt();
		System.out.println("digite o valor unitario de cada pe�a 1: ");
		vl1 = sc.nextDouble();
		
		System.out.println("********pe�as2*********");
		
		System.out.println("digite o codigo da pe�a 2: ");
		codp2 = sc.nextInt();
		System.out.println("digite o numero de pe�a 2: ");
		nump2 = sc.nextInt();
		System.out.println("digite o valor unitario de cada pe�a 2: ");
		vl2 = sc.nextDouble();
		
		
		valor_a_pagar = (nump1 * vl1) + (nump2 * vl2);
		
		
		System.out.printf("VALOR A PAGAR: %.2f" , valor_a_pagar);
		sc.close();
	}

}
