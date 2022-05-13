package br.com.residencia;

import java.util.Scanner;

public class Aula02Exercicio01 {

	public static void main(String[] args) {
		
		String nome, sobrenome;
		Scanner leia = new Scanner(System.in);		
		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		System.out.println("Digite seu sobrenome: ");
		sobrenome = leia.next();
//		gambiarra para o limpa()
		for(int i = 0; i <= 5; i++) {
			System.out.println("");
		}
		System.out.println("Meu nome é " + nome + " " + sobrenome);
		leia.close();

	}

}
