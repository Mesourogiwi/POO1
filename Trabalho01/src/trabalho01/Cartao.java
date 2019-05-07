/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho01;

/**
 *
 * @author Erick Yoshike
 */
public class Cartao extends TipoPagamento {

    private String nome;
    private String numero;

    public Cartao(String tipoPagamento, String nome, String numero) {
        super(tipoPagamento);
        this.nome = nome;
        this.numero = numero;
    }

    @Override
    public void exibirDados() {

    }
}
