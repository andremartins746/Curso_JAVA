import java.util.Scanner;

public class if_else {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		System.out.println("digite a hora:");
		
		x = sc.nextInt();
		
		if(x <12) {
			System.out.println("bom dia");
		}
		else if(12 <= x && x < 18) {
			System.out.println("boa tarde!");
			}
		else if(x >= 18) {
			System.out.println("boa noite!");
			}

		
		sc.close();
	}

}
