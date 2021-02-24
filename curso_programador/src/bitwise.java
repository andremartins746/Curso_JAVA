import java.util.Scanner;

public class bitwise {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b100000; //numero 32 em binario
		int n =sc.nextInt();
		
		if((n & mask) != 0) { // testando se o 6º bit do numero 32 é 0 ou 1
			System.out.println("6th bit is true");
		}
		else {
			System.out.println("6th bit is false");
		}
		
		sc.close();
		
	}

}
