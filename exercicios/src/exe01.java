
import java.util.Scanner;

public class exe01 {

	public static void main(String[] args) {
		
		int x,y;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("digite o primeiro numero: ");
		x= sc.nextInt();
	    System.out.println("digite o segundo numero: ");
		y = sc.nextInt();
		
		System.out.println("SOMA = "+ (x + y));
		
	sc.close();
	}

}
