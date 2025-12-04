package Calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner imput = new Scanner (System.in);
		
		double resultado = 0, num = 0, num1 = 0, num2 = 0;
		String operacao = "";
		char resposta = ' ';
			
		System.out.println("=========================");
		System.out.println("|    CALCMASTER 3000    |");
		System.out.println("=========================");
		System.out.println("======== TECLADO ========");
		System.out.println("|  [1]  [2]  [3]   [+]  |");
		System.out.println("|  [4]  [5]  [6]   [-]  |");
		System.out.println("|  [7]  [8]  [9]   [*]  |");
		System.out.println("|  [0]  [.]  [√]   [^]  |");
		System.out.println("|  [/]                  |");
		System.out.println("=========================");
		
		while (resposta != 0) {
		
		do {
		
		System.out.print("\nEscolha a operação (+, -, *, /, ^, √) ou [0] para sair (raiz quadrada = V): ");
		resposta = imput.next().charAt(0);
		
		if (resposta == '0') {
			
			System.out.println("Saindo... Até logo!");	
			return;
			
		}
		
		if (resposta != '+' && resposta != '-' && resposta != '*' && resposta != '/' && resposta != '^' && resposta != 'V') {
			
			System.out.println("\nResposta inválida. Comece novamente!!!");
		
		}
		
		} while (resposta != '+' && resposta != '-' && resposta != '*' && resposta != '/' && resposta != '^' && resposta != 'V');
		
		if (resposta == 'V') {
			
			System.out.print("Informe o número: ");
			num = imput.nextInt();
			
		while (num < 0) { 
			
			System.out.print("Número inválido!!! Informe o número: ");
			num = imput.nextInt();
			
		}
		
		} else {
		
		System.out.print("Informe o primeiro número: ");
		num1 = imput.nextDouble();
		
		System.out.print("Informe o segundo número: ");
		num2 = imput.nextDouble();

		}
		
		switch (resposta) {
				
		case '+':
			
			resultado = num1 + num2;
			operacao = "ADIÇÃO";
			break; 
			
		case '-':
			
			resultado = num1 - num2;
			operacao = "SUBTRAÇÃO";
			break; 

		case '*':
			
			resultado = num1 * num2;
			operacao = "MULTIPLICAÇÃO";
			break; 

		case '/':
			
			resultado = num1 / num2;
			operacao = "DIVISÃO";
			break; 

		case '^':
			
			resultado = Math.pow(num1,num2);
			operacao = "POTÊNCIA";
			break; 

		case 'V':  
			
			resultado = Math.sqrt(num);
			operacao = "RAIZ QUADRADA";
			break; 
		
		}
		
		System.out.println("============================");
		System.out.printf("| Resultado da " + operacao + ":%.2f ", resultado);
		System.out.println("\n============================");
		System.out.println("============================");
		System.out.println("|      Fim da operação!    |");
		System.out.println("============================");
		System.out.println("Pressione Enter para voltar ao menu...");
		imput.nextLine();
		imput.nextLine();
		
	}

	imput.close();
		
	}
}