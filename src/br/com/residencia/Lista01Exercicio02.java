package br.com.residencia;

import java.util.Scanner;

public class Lista01Exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idadeAmigo01;
		int idadeAmigo02;
		int idadeAmigo03;
		int idadeAmigo04;
		int idadeAmigo05;
		int minhaIdade;
		int soma;
		
		System.out.println("Qual é a idade do amigo 1? ");
		idadeAmigo01 = leia.nextInt();
		System.out.println("Qual é a idade do amigo 2? ");
		idadeAmigo02 = leia.nextInt();
		System.out.println("Qual é a idade do amigo 3? ");
		idadeAmigo03 = leia.nextInt();
		System.out.println("Qual é a idade do amigo 4? ");
		idadeAmigo04 = leia.nextInt();
		System.out.println("Qual é a idade do amigo 5? ");
		idadeAmigo05 = leia.nextInt();
		System.out.println("Qual é a minha idade? ");
		minhaIdade = leia.nextInt();
		
		soma = idadeAmigo01 + idadeAmigo02 + idadeAmigo03 + idadeAmigo04 + idadeAmigo05 + minhaIdade;
		
		System.out.println("A soma de todas as idades é: " + soma);
		leia.close();
		
	}
}
