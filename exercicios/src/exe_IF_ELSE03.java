import java.util.Scanner;
public class exe_IF_ELSE03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		 a = sc.nextInt();
		 b = sc.nextInt();
		 
		 if(a % b ==0 || b % a == 0) {
			 System.out.println("s�o muntiplos!");
		 } else {
			 System.out.println("n�o s�o munltiplos!");
		 }
		 
		
		
	sc.close();
	}

}
