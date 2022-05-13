package br.com.monitoria;

public class Bebida {
	private String nome;
	private Double valor;
	
	public Bebida(String nome, Double valor) {
		super();
		this.setNome(nome);
		this.setValor(valor);
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return this.valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Bebida [nome=" + nome + ", valor=" + valor + "]";
	}
	
	
	
	
	
}
