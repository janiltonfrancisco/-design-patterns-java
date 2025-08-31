/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.veiculos;

/**
 *
 * @author janil
 */
public class Carro extends Veiculo{
     public Carro(String modelo, String cor) {
        super(modelo, cor, new AceleracaoSuave(), new FrenagemPadrao());
    }
    
}
