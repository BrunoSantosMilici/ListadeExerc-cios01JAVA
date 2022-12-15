package lista1;

import java.util.Scanner;

public class Lista1_exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o raio da circuferência");
		float raio = sc.nextFloat();
		float area = (float) (Math.PI * (Math.pow(raio, 2)));
		System.out.println("A área da circuferência é de: " + area);
	}

}
