 package jogo.Carros;

import jogo.Automóvel;

public class Carros implements Automóvel {

	private int id;
	private String marca;
	private String modelo;
	private float velocidade;
	private float controle;
	private float aceleração;
	private float arrancada;
	private float frenagem;
	private int preço;
	private String cor;

	public Carros(int id, String marca, String modelo, float velocidade, float controle, float aceleração,
			float arrancada, float frenagem, int preço, String cor) {

		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.velocidade = velocidade;
		this.controle = controle;
		this.aceleração = aceleração;
		this.arrancada = arrancada;
		this.frenagem = frenagem;
		this.preço = preço;
		this.cor = cor;

	};


public String listarcarros(){

	return marca + " " + modelo;

}

	public void verautomóveis() {

	System.out.println(id + "- \n Marca: " + marca + "\nModelo: " + modelo + "\nVelocidade: " + velocidade + "F" + "\nControle: " + controle + "\nAceleração: " + aceleração + "\nArrancada: " + arrancada + "\nFrenagem: " + frenagem + "\nPreço: R$" + preço + "\nCor: " + cor);

	}

	public void verautomóveissimples() {

		System.out.println( marca + "  " + modelo);

	}

    @Override
    public void ligar() {
        System.out.println("O motor ronca e o carro ganha vida.");
    }
    
    @Override
    public void desligar() {
        System.out.println("O motor para, o carro está em repouso.");
    }
    
    @Override
    public void acelerar() {
        System.out.println("O carro acelera com força, partindo velozmente.");
    }
    
    @Override
    public void frear() {
        System.out.println("Os freios são acionados, o carro desacelera com segurança.");
    }
    
    @Override
    public void virar(String direção) {
        System.out.println("O volante gira e o carro muda de direção em direção a " + direção + ".");
    }
    
    @Override
    public void bater() {
        System.out.println("Houve uma colisão! O carro está danificado.");
    }
    
    @Override
    public void buzinar() {
        System.out.println("Biiiiiii! A buzina do carro ressoa pela estrada.");
    }
    
}