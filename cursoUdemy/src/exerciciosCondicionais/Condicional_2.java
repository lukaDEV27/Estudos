package exerciciosCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Condicional_2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite um número para saber se ele é par ou ímpar: ");
		int n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}
		
		sc.close();

	}

}
