package lista1;

import java.util.Scanner;

public class Lista1_exercicio8 {
	// calculador de �rea do tri�ngulo
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite a base do tri�ngulo");
			float base = sc.nextFloat();
			System.out.println("Digite a altura do tri�ngulo");
			float altura = sc.nextFloat();
			float area = (base * altura) / 2;
			System.out.println("A �rea do ret�ngulo � de: " + area);
			
	}

}
