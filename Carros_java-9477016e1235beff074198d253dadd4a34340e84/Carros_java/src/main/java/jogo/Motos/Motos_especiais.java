package jogo.Motos;

public class Motos_especiais extends Motos {

    public Motos_especiais(int id, String marca, String modelo, float velocidade, float controle, float aceleração,
    float arrancada, float frenagem, int preço, String cor) {
super(id, marca, modelo, velocidade, controle, aceleração, arrancada, frenagem, preço, cor);

}


@Override
public void ligar() {
    System.out.println("A moto especial ruge, pronta para uma corrida alucinante!");
}

@Override
public void desligar() {
    System.out.println("A moto especial desliga seu motor, após uma exibição de poder.");
}

@Override
public void acelerar() {
    System.out.println("A moto especial acelera com intensidade sobrenatural, deixando tudo para trás!");
}

@Override
public void frear() {
    System.out.println("Os freios da moto especial respondem com precisão, controlando sua velocidade incrível.");
}

@Override
public void virar(String direção) {
    System.out.println("A moto especial executa uma manobra incrível e muda de direção em direção a " + direção + ".");
}

@Override
public void bater() {
    System.out.println("Houve uma colisão! A moto especial mostra sua durabilidade notável.");
}

@Override
public void buzinar() {
    System.out.println("Biiiii! A buzina da moto especial emite um som distinto, capturando a atenção de todos ao redor.");
}


}
