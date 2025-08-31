/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.veiculos;

/**
 *
 * @author janil
 */
public class MainVeiculoComStrategy {

    public static void main(String[] args) {
         Veiculo carro = new Carro("Civic", "Preto");
        Veiculo moto = new Moto("CBR 600", "Vermelha");

        System.out.println("--- Teste do Carro ---");
        carro.ligar();
        carro.acelerar();
        carro.frear();

        System.out.println("\n--- Teste da Moto ---");
        moto.ligar();
        moto.acelerar();
        moto.frear();
    }
}
