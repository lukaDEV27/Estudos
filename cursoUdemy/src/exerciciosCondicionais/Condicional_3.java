package exerciciosCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Condicional_3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 2 números inteiros...");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a >= b) {
			if (a % b == 0) {
				System.out.println("São multiplos");
			} else {
				System.out.println("Não são multiplos");
			}
		} else {
			if (b % a == 0) {
				System.out.println("São multiplos");
			} else {
				System.out.println("Não são multiplos");
			}
		}
		
		
		sc.close();
	}

}
