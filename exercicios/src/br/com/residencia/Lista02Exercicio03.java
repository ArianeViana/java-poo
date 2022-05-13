package br.com.residencia;

import java.util.Scanner;

public class Lista02Exercicio03 {

	public static void main(String[] args) {

		Scanner quantidade = new Scanner(System.in);
		int quantProduto;

		System.out.println("Quantos produtos você quer comprar? ");
		quantProduto = quantidade.nextInt();
		quantidade.close();

		if (quantProduto < 0) {
			System.out.println("Valor inválido! Tente novamente");
		} 		
		
		if (quantProduto == 0) {
			System.out.println("Ops, nenhuma compra foi realizada!");
		}
		
		if (quantProduto > 0) {
			System.out.println("Sua compra foi finalizada! Parabéns por comprar " + quantProduto + " produtos.");
		}
	}

}
