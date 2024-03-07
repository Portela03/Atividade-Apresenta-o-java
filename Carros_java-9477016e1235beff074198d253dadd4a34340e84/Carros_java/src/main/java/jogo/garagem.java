package jogo;

import java.util.ArrayList;

import jogo.Carros.Carros;
import jogo.Motos.Motos;

class Garagem<T> {

    private ArrayList<Automóvel> automóveisNaGaragem = new ArrayList<>();
    private ArrayList<Carros> carrosNaGaragem = new ArrayList<>();
    private ArrayList<Motos> motosNaGaragem = new ArrayList<>();



 

    public void listarAutomóveis() {
        for ( Automóvel automóvel :  automóveisNaGaragem) {
            automóvel.verautomóveis();
        }
    }

    public void listarAutomóveisSimples() {
        for ( Automóvel automóvel :  automóveisNaGaragem) {
            automóvel.verautomóveissimples();
        }
    }






    public void adicionarCarro(Carros carro) {
        carrosNaGaragem.add(carro);
                automóveisNaGaragem.add(carro) ;
    }

    public void listarCarros() {
        for (Carros carro : carrosNaGaragem) {
                carro.verautomóveis();
        }
    }
    public void listarCarrosSimples() {
        for (Carros carro : carrosNaGaragem) {
                carro.verautomóveissimples();
        }
    }





    public void adicionarMotos(Motos moto) {
        motosNaGaragem.add(moto);
           automóveisNaGaragem.add(moto) ;
    }
 

    public void listarMotos() {
        for (Motos moto : motosNaGaragem) {
               moto.verautomóveis();
        }
    }

        public void listarMotosSimples() {
        for (Motos moto : motosNaGaragem) {
               moto.verautomóveissimples();
        }
    }
}
