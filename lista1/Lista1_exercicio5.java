package lista1;

import java.util.Scanner;

public class Lista1_exercicio5 {
	
	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número");
		int valor1 = sc.nextInt();
		System.out.println("Digite outro valor");
		int valor2 = sc.nextInt();
		int Mult = valor1 * valor2;
		System.out.println("O resultado da multiplicação é  " + (Mult));
	}

}
