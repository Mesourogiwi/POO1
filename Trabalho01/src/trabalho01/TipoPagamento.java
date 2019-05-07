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
public abstract class TipoPagamento {
    protected String tipoPagamento;
    
    public TipoPagamento(String tipoPagamento){
        this.tipoPagamento = tipoPagamento;
    }
    
    public abstract void exibirDados();

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
