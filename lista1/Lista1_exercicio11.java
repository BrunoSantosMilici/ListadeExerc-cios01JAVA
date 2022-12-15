package lista1;

import java.util.Scanner;

public class Lista1_exercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a base menor do trapézio");
		float base1 = sc.nextFloat();
		System.out.println("Digite a base maior do trapézio");
		float base2 = sc.nextFloat();
		System.out.println("Digite a altura do trapézio");
		float altura = sc.nextFloat();
		float area = (base1 * base2) * altura / 2;
		System.out.println("A área do retângulo é de: " + area);

	}

}
