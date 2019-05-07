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
public class Cheque extends TipoPagamento {

    private String nomeEmissor;
    private String numeroCheque;

    public Cheque(String tipoPagamento, String nomeEmissor, String numeroCheque) {
        super(tipoPagamento);
        this.nomeEmissor = nomeEmissor;
        this.numeroCheque = numeroCheque;
    }

    public String getNomeEmissor() {
        return nomeEmissor;
    }

    public void setNomeEmissor(String nomeEmissor) {
        this.nomeEmissor = nomeEmissor;
    }

    public String getNumeroCheque() {
        return numeroCheque;
    }

    public void setNumeroCheque(String numeroCheque) {
        this.numeroCheque = numeroCheque;
    }

    @Override
    public void exibirDados() {

    }
}
