package jogo.Motos;

import jogo.Automóvel;

public class Motos implements Automóvel{

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

	public Motos(int id, String marca, String modelo, float velocidade, float controle, float aceleração,
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

    public void verautomóveis() {

        System.out.println(id + "- \n Marca: " + marca + "\nModelo: " + modelo + "\nVelocidade: " + velocidade + "F" + "\nControle: " + controle + "\nAceleração: " + aceleração + "\nArrancada: " + arrancada + "\nFrenagem: " + frenagem + "\nPreço: R$" + preço + "\nCor: " + cor);
    
        }

        public void verautomóveissimples() {

            System.out.println( marca + "  " + modelo);
    
        }


    @Override
    public void ligar() {
        System.out.println("A moto ruge, pronta para acelerar!");
    }
    
    @Override
    public void desligar() {
        System.out.println("A moto fica em silêncio, desligada.");
    }
    
    @Override
    public void acelerar() {
        System.out.println("A moto dispara como uma flecha, ganhando velocidade!");
    }
    
    @Override
    public void frear() {
        System.out.println("Os freios rangem e a moto diminui a velocidade.");
    }
    
    @Override
    public void virar(String direção) {
        System.out.println("A moto faz uma curva em direção a " + direção + ".");
    }
    
    @Override
    public void bater() {
        System.out.println("Houve uma colisão! A moto está danificada.");
    }
    
    @Override
    public void buzinar() {
        System.out.println("Biiiii! A buzina da moto ressoa pela estrada.");
    }
    

}
