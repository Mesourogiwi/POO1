/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho01;

import java.util.Calendar;

/**
 *
 * @author Guga
 */
public class Venda {
    private int nCompra;
    private Cliente cliente;
    private Produto produto[] = new Produto[100];
    private TipoPagamento tipoPgto[] = new TipoPagamento[100];
    int l;
    private Calendar data;     

     Venda(int numero,Cliente cliente,Produto prod,int i, TipoPagamento tipopgto ) {
        this.nCompra = numero;
        this.cliente = cliente;
        this.produto[l] = prod;
       
        this.tipoPgto[i]= tipopgto;
    }

    public int getNumero() {
        return nCompra;
    }

    public void setNumero(int numero) {
        this.nCompra = numero;
    }

    public Produto[] getProduto() {
        return produto;
    }

    public void setProduto(Produto[] produto) {
        this.produto = produto;
    }

    public TipoPagamento[] getTipoPgto() {
        return tipoPgto;
    }

    public void setTipoPgto(TipoPagamento[] tipoPgto) {
        this.tipoPgto = tipoPgto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
