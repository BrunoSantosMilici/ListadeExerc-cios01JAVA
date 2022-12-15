package lista1;

import java.util.Scanner;

public class Lista1_exercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o lado do quadrado");
		float lado = sc.nextFloat();
		float area = (float) Math.pow(lado, 2);
		System.out.println("A área do quadrado é de: " + area);

	}

}
