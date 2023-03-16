package Exercicio;

import java.util.Scanner;

public class dois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dois numeros:");
		int numero1=scanner.nextInt();
		int numero2 = scanner.nextInt();
		
		System.out.println("a soma eh:");
		System.out.println(numero1 + numero2);
		
		
		System.out.println("a subtração e");
		System.out.println(numero1 - numero2);
		System.out.println("a subtração segundo sob o primeiro é");
		System.out.println(numero2 - numero1);
		
		System.out.println("a multiplicação é:");
		System.out.println(numero1 * numero2);
		
		System.out.println("a divisão é");
		System.out.println(numero1 / numero2);
		
		System.out.println("a porcentagem do numero um sob o dois e");
		System.out.println(numero1 % numero2);
		
		System.out.println("a porcentagem do numero um sob o dois e");
		System.out.println(numero2 % numero1);
		
		
		scanner.close();
		
		
	}

}
