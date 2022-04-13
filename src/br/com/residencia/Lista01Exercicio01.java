package br.com.residencia;

import java.util.Scanner;

public class Lista01Exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome, sobrenome;
		
		System.out.println("Qual é o seu nome? ");
		nome = leia.next();
		
		System.out.println("E o seu sobrenome? ");
		sobrenome = leia.next();
		leia.close();
		
		System.out.println("Olá " + nome + " " + sobrenome + ", seja bem vindo (a)!");
		
		
		
	}

}
