package br.com.residencia;

import java.util.Scanner;

public class Lista02Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nome, tratamento;
		
		System.out.println("Olá, como é o seu nome? ");
		nome = scan.next();
		
		System.out.println("Como você gostaria de ser tratado(a)? ");
		tratamento = scan.next();
		scan.close();
		
		System.out.println("Olá " + tratamento + " " + nome + ", é um prazer te conhecer!");

	}

}
