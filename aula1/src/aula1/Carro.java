package aula1;

public class Carro { //está classe não está encapsulada
	
	String modelo;
	double qtd_combustivel;
	double velocidadeAtual;
	boolean ingnicao;
	
	
	
	
	public void ligar() {
		this.ingnicao = true;
		
		System.out.println("carro ligado e funcionando");
	}
	
	public void desligar() {
		this.ingnicao = false;
		
		System.out.println("carro desligado");
	}
	
	public void acelerar() {
		if(this.ingnicao && this.qtd_combustivel > 0) { // o this vai pegar o onj ocorrente.
			System.out.println("acelerando o " + this.modelo);
			this.velocidadeAtual += 10;
			this.qtd_combustivel--;
		}
		else {
			System.out.println("o carro " + this.modelo + " esta desligado ou sem combustivel");
		}
		
		
	}
	public void frear() {
		
		System.out.println("freando o carro...");
		if(this.velocidadeAtual > 0) {
			this.velocidadeAtual -= 10;
		}
		
	}
	
	
	
	public void painel() {
		System.out.println("-----------------------------------");
		System.out.println("modelo: " + this.modelo);
		System.out.println("velocidade "+ this.velocidadeAtual);
		System.out.println("qtd de combustivel " + this.qtd_combustivel);
		System.out.println("-----------------------------------");
	}
	
	
	// declarando atribultos padroes, para os atribultos da classe.
	Carro(){// constructor 
		this.qtd_combustivel = 50;
		this.velocidadeAtual = 0;
		this.ingnicao = false;
	}
	
}
