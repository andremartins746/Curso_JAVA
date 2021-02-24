import java.util.Scanner;

public class exe03 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a,b,c,d,resultado;
			
			System.out.println("digite os 4 valores a serem calculados: ");
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			
			resultado = (a*b - c*d);
			System.out.print("DIFERENÇA: " + resultado);
		}
		
		
		
		
		
		
	}

}
