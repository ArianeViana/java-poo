package br.com.residencia;

import java.util.Scanner;

public class Lista02Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nome, tratamento;
		
		System.out.println("Ol�, como � o seu nome? ");
		nome = scan.next();
		
		System.out.println("Como voc� gostaria de ser tratado(a)? ");
		tratamento = scan.next();
		scan.close();
		
		System.out.println("Ol� " + tratamento + " " + nome + ", � um prazer te conhecer!");

	}

}
