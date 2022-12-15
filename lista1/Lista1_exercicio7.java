package lista1;
import java.util.Scanner;
public class Lista1_exercicio7 {
	// calculador de área do retângulo
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite a base do retângulo");
	float base = sc.nextFloat();
	System.out.println("Digite a altura do retângulo");
	float altura = sc.nextFloat();
	float area = base * altura;
	System.out.println("A área do retângulo é de: " + area);
	
	}
	
}
