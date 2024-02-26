package exerciciosCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Condicional_1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número positivo ou negativo: ");
		int n = sc.nextInt();
		
		if (n > 0) {
			System.out.println("POSITIVO");
		}
		else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();
	}

}
