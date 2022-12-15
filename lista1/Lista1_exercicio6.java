package lista1;

import java.util.Scanner;

public class Lista1_exercicio6 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new  Scanner(System.in);
		
		System.out.println("Digite um valor");
		float valor1 = sc.nextFloat();
		System.out.println("Digite  outro valor");
		float valor2 = sc.nextFloat();
		float divisao = valor1 / valor2;
		System.out.println("O resultado da divisão dos dois valores é de :  " + divisao);
		
	}
	
}
