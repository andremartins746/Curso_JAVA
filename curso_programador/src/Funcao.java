import java.util.Scanner;

public class Funcao {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		shoeResult(higher);		
				
		sc.close();
	}
	
	 /*todas as funções devem ser construidas aqui.*/
	
	public static int max(int x, int y, int z) {
		int aux;
		
		if(x > y && x > z) {
			aux = x;
		}
		else if(y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		
		return aux;
	}
	
	public static void shoeResult(int value) {
		System.out.println("higher = " + value);
	}
}