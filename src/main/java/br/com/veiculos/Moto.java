/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.veiculos;

/**
 *
 * @author janil
 */
public class Moto extends Veiculo{
    public Moto(String modelo, String cor) {
        super(modelo, cor, new AceleracaoPotente(), new FrenagemPadrao());
    }
}
