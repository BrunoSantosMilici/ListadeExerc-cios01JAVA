package lista1;

import java.util.Scanner;

public class Lista1_exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a diagonal menor do losango");
		float diagonalMenor = sc.nextFloat();
		System.out.println("Digite a diagonal maior do losango");
		float diagonalMaior = sc.nextFloat();
		float area = (diagonalMenor * diagonalMaior) / 2;
		System.out.println("A área do retângulo é de: " + area);

	}

}
