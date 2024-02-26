package exerciciosCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Condicional_4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora inicial e final do jogo...");
		int hInicial = sc.nextInt();
		int hFinal = sc.nextInt();
		
		int duracao;
		if (hInicial >= hFinal) {
			duracao = 24 - hInicial + hFinal;
		} else {
			duracao = hFinal - hInicial;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
	}

}
