package lista1;

import java.util.Scanner;

public class Lista1_exercicio8 {
	// calculador de área do triângulo
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite a base do triângulo");
			float base = sc.nextFloat();
			System.out.println("Digite a altura do triângulo");
			float altura = sc.nextFloat();
			float area = (base * altura) / 2;
			System.out.println("A área do retângulo é de: " + area);
			
	}

}
