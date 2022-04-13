package br.com.residencia;

import java.util.Scanner;

public class Lista01Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float numero1, numero2, soma, subtracao, multiplicacao, divisao;
			
		System.out.println("Digite um número: ");
		numero1 = leia.nextInt();
		System.out.println("Digite outro número: ");
		numero2 = leia.nextInt();
		leia.close();
		
		soma = numero1 + numero2;
		subtracao = numero1 - numero2;
		divisao = numero1 / numero2;
		multiplicacao = numero1 * numero2;
		
		System.out.println("Soma: " + soma + "\nSubtração: " + subtracao);
		System.out.println("Multiplicação: " + multiplicacao);
					
		if (numero2 == 0) {
			System.out.println("Não é possível dividir um número por zero");
		}else{
			System.out.println("Divisao: " + divisao);
		}
				
		
				 
		

	}

}
