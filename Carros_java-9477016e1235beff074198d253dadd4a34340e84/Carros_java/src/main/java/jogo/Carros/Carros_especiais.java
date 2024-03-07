package jogo.Carros;

public class Carros_especiais extends Carros {

	public Carros_especiais(int id, String marca, String modelo, float velocidade, float controle, float aceleração,
			float arrancada, float frenagem, int preço, String cor) {
		super(id, marca, modelo, velocidade, controle, aceleração, arrancada, frenagem, preço, cor);

	}

	 
    
    @Override
    public void ligar() {
        System.out.println("O motor ruge com potência, revelando a singularidade deste veículo!");
    }
    
    @Override
    public void desligar() {
        System.out.println("O silêncio cai, o veículo descansa, pronto para seu próximo ato surpreendente.");
    }
    
    @Override
    public void acelerar() {
        System.out.println("O veículo acelera com intensidade, mostrando sua excepcionalidade.");
    }
    
    @Override
    public void frear() {
        System.out.println("Os freios respondem com precisão, controlando a máquina especial.");
    }
    
    @Override
    public void virar(String direção) {
        System.out.println("O veículo realiza uma manobra incrível e muda de direção em direção a " + direção + ".");
    }
    
    @Override
    public void bater() {
        System.out.println("Houve uma colisão! O veículo especial exibe sua resistência notável.");
    }
    
    @Override
    public void buzinar() {
        System.out.println("Biiiii! O som distintivo ecoa, capturando a atenção de todos ao redor.");
    }
    
}