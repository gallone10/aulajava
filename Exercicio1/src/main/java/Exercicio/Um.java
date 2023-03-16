package Exercicio;

import java.util.Scanner;

public class Um {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		boolean mulher = false;
		

		String respostaMulher = null;
		
		
		System.out.println("Você é mulher?");
		 respostaMulher = scanner.nextLine();
		
		if (respostaMulher.equals("S")) {
			mulher = true;
		} else {
			mulher = false;
		}
		 
		System.out.println("Digite sua idade:");
		int idade = scanner.nextInt();
		
		System.out.println("E mulher? " + mulher);
		System.out.println("Sua idade:" + idade);
		
		if (mulher) {
			System.out.println("Voce pode entrar no vestiário");
		} else {
			if (idade > 6) {
				System.out.println("Voce nao pode entrar no vestiário");
			} else {
				System.out.println("Voce pode entrar no vestiário");
				
			scanner.close();
				
			}
			
		}
		
		
	}

}