package lista1;
import java.util.Scanner;
public class Lista1_exercicio7 {
	// calculador de �rea do ret�ngulo
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite a base do ret�ngulo");
	float base = sc.nextFloat();
	System.out.println("Digite a altura do ret�ngulo");
	float altura = sc.nextFloat();
	float area = base * altura;
	System.out.println("A �rea do ret�ngulo � de: " + area);
	
	}
	
}
