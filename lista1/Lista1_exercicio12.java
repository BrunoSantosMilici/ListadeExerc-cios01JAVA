package lista1;

import java.util.Scanner;

public class Lista1_exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o raio da circufer�ncia");
		float raio = sc.nextFloat();
		float area = (float) (Math.PI * (Math.pow(raio, 2)));
		System.out.println("A �rea da circufer�ncia � de: " + area);
	}

}
