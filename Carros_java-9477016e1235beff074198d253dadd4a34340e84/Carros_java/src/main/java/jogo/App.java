package jogo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import jogo.Carros.Carros;
import jogo.Carros.Carros_especiais;
import jogo.Motos.Motos;
import jogo.Motos.Motos_especiais;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/carros"; 
            String username = "root";
            String password = "";
            Connection connection = DriverManager.getConnection(url, username, password);
            
             
            String sqlQuery = "SELECT * FROM carros";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            
            System.out.println("você tem 800000 reais, Escolha um Carro para adicionar a sua garagem");
            
            while (resultSet.next()) {
            	 int id = resultSet.getInt("id");
                 String marca = resultSet.getString("marca");
                 String modelo = resultSet.getString("modelo");
                 double velocidade = resultSet.getDouble("velocidade");
                 double controle = resultSet.getDouble("controle");
                 double aceleracao = resultSet.getDouble("aceleracao");
                 double arrancada = resultSet.getDouble("arrancada");
                 double frenagem = resultSet.getDouble("frenagem");
                 double preco = resultSet.getDouble("preco");
                 String cor = resultSet.getString("cor");
               
                 System.out.println(id + "- \n Marca: " + marca + "\nModelo: " + modelo + "\nVelocidade: " + velocidade + "F" + "\nControle: " + controle + "\nAceleração: " + aceleracao + "\nArrancada: " + arrancada + "\nFrenagem: " + frenagem + "\nPreço: R$" + preco + "\nCor: " + cor + "\n");
            }
            
           
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

       try  (Scanner scanner = new Scanner(System.in)) {;

        List<Automóvel> listaautomoveis = new ArrayList<>();
        ArrayList<Motos> Listamotos = new ArrayList<>();
        ArrayList<Carros> Listacarros = new ArrayList<>();
        Garagem<Carros> garagem = new Garagem<>();

        Carros c1 = new Carros(1, "Ferrari", "LaFerrari", 8.3f, 8.8f, 9.6f, 9.3f, 10f, 800000, "vermelho");

        Carros c2 = new Carros(2, "McLaren", "P1", 9.4f, 8.7f, 9.5f, 9.1f, 10f, 780000, "Laranja");

        Carros c3 = new Carros(3, "Hennessey", "Venom GT", 10f, 8.3f, 9.4f, 9.1f, 10f, 380000, "Amarelo");

        Carros c4 = new Carros(4, "Bugatti", "Veyron Super Sport", 10f, 8.2f, 10f, 10f, 9.9f, 1080000, "Preto e Laranja");

        Carros c5 = new Carros(5, "Porsche", "918 Spyder", 8.4f, 8.3f, 9.7f, 10f, 10, 850000, "Prata");

        Carros c6 = new Carros_especiais(6, "tesla", "foguete car", 10f, 8.0f, 10f, 10f, 9.0f, 3000000, "Cinza");

        Carros c7 = new Carros_especiais(7, "google", "AIcar", 9.8f, 10f, 9.0f, 10f, 10f, 5000000, "Vermelho");

    
    Motos m1 = new Motos(1, "Yamaha", "YZF R1", 8.6f, 9.0f, 9.3f, 9.5f, 9.2f, 70000, "Azul");

    Motos m2 = new Motos(2, "Kawasaki", "Ninja ZX-10R", 9.0f, 9.2f, 9.4f, 9.3f, 9.0f, 75000, "Verde");
    
    Motos m3 = new Motos(3, "Honda", "CBR1000RR", 8.8f, 8.9f, 9.2f, 9.1f, 8.8f, 72000, "Vermelho");
    
    Motos m4 = new Motos(4, "Ducati", "Panigale V4", 9.2f, 9.3f, 9.5f, 9.4f, 9.1f, 78000, "Preto");
    
    Motos m5 = new Motos(5, "Suzuki", "GSX-R1000", 8.7f, 9.1f, 9.3f, 9.2f, 8.9f, 69000, "Amarelo");
    
    Motos m6 = new Motos_especiais(8, "Ducati", "Panigale V4R", 9.5f, 9.4f, 9.7f, 9.6f, 9.4f, 85000, "Vermelho Carbono");

    Motos m7 = new Motos_especiais(9, "KTM", "1290 Super Duke R", 9.8f, 9.7f, 9.9f, 9.9f, 9.8f, 92000, "Laranja");
    



    listaautomoveis.addAll(Arrays.asList(c1, c2, c3, c4, c5, c6, c7, m1, m2, m3, m4, m5, m6, m7));
    Listamotos.addAll(Arrays.asList(m1, m2, m3, m4, m5, m6, m7));
       Listacarros.addAll(Arrays.asList(c1, c2, c3, c4, c5, c6, c7));

 
        

         
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            garagem.adicionarCarro(c1);
            System.out.println("Você comprou um "); c1.verautomóveis();
        } else if (escolha == 2) {
            garagem.adicionarCarro(c2);
              System.out.println("Você comprou um "); c2.verautomóveis();
        } else if (escolha == 3) {
            garagem.adicionarCarro(c3);
               System.out.println("Você comprou um "); c3.verautomóveis();
        } else if (escolha == 4) {
            garagem.adicionarCarro(c4);
               System.out.println("Você comprou um "); c4.verautomóveis();
        } else if (escolha == 5) {
            garagem.adicionarCarro(c5);
             System.out.println("Você comprou um "); c5.verautomóveis();
        } else if (escolha == 6) {
            garagem.adicionarCarro(c6);
               System.out.println("Você comprou um "); c6.verautomóveis();
        } else if (escolha == 7) {
            garagem.adicionarCarro(c7);
             System.out.println("Você comprou um "); c7.verautomóveis();
        }           

        System.out.println("\nLista de Carros na garagem:");
        garagem.listarCarrosSimples();


        garagem.adicionarMotos(m3); // adicionando a moto 3 honda para exemplo
 

        System.out.println("\nLista de Motos na garagem:");
        garagem.listarMotosSimples();


        System.out.println("\nLista de Automóveis na garagem:");
        garagem.listarAutomóveisSimples();
    
       }
    }
}
