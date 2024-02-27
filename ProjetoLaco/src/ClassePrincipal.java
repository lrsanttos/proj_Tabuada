import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[] args) {
		
		while(true){
			System.out.println("Informe a calculadora: ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();	
			
			for(int i=0; i<=10; i++){
				System.out.printf(num + " * " + i + " = ");
				System.out.println(num * i);
			}
			for(int i=0; i<=10; i++){
				System.out.printf(num + " + " + i + " = ");
				System.out.println(num + i);
			}
			break;
		}
	}
}
