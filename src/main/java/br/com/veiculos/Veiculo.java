/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.veiculos;

/**
 *
 * @author janil
 */
public class Veiculo {
    private String modelo;
    private String cor;
    private boolean ligado;

    // Atributos de comportamento (composition)
    private ComportamentoAceleracao aceleracao;
    private ComportamentoFrenagem frenagem;

    public Veiculo(String modelo, String cor, ComportamentoAceleracao aceleracao, ComportamentoFrenagem frenagem) {
        this.modelo = modelo;
        this.cor = cor;
        this.ligado = false;
        this.aceleracao = aceleracao;
        this.frenagem = frenagem;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O " + modelo + " ligou.");
        } else {
            System.out.println("O " + modelo + " já está ligado.");
        }
    }

    // O método frear agora delega a responsabilidade para a estratégia
    public void frear() {
        if (ligado) {
            this.frenagem.frear();
        } else {
            System.out.println("O " + modelo + " está desligado.");
        }
    }

    // O método acelerar agora delega a responsabilidade para a estratégia
    public void acelerar() {
        if (ligado) {
            this.aceleracao.acelerar();
        } else {
            System.out.println("O " + modelo + " está desligado. Ligue-o primeiro.");
        }
    }

    public boolean isLigado() {
        return ligado;
    }
    
}
