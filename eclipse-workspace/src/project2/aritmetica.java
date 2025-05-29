package project2;

import java.util.Scanner;

public class aritmetica {
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;
		
		System.out.print("Primeiro Numero: ");
		number1 = s1.nextInt();
		
		System.out.print("Segundo Numero: ");
		number2 = s1.nextInt();
		
		sum = number1 + number2;
		
		System.out.printf("A soma é: %d%n", sum); //%n é a quebra de linha
		
		Scanner arit = new Scanner(System.in);
	
		int n1;
		int n2;
		
		System.out.print("Primeiro numero: ");
		n1 = arit.nextInt();
		
		System.out.print("Segundo numero: ");
		n2 = arit.nextInt();
		
		if(n1 == n2) {
			System.out.print("Numero 1 = Numero 2");
		}
		else if(n1 > n2){
			System.out.print("Numero 1 maior que numero 2");
		}
		else if(n1 < n2){
			System.out.print("Numero 1 menor que numero 2");
		}
		else {
			System.out.print("Nao e numero");
		}
		
		
	}
}
