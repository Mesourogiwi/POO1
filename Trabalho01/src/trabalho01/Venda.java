/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho01;

import java.util.Calendar;
import java.io.Serializable;

/**
 *
 * @author Guga
 */

public class Venda implements Serializable{
    private String nCompra;
    private Cliente cliente;
    private Produto produto[] = new Produto[100];
    private TipoPagamento tipoPgto[] = new TipoPagamento[100];
    private float valortotal;
     int i;
    private Calendar data;     

     Venda(String numero,Cliente cliente,Produto prod,TipoPagamento tipopgto,int l, float valor ) {
        this.nCompra = numero;
        this.cliente = cliente;
        this.produto[i] = prod;
        this.tipoPgto[i]= tipopgto;
        this.valortotal = valor;
        i++;
    }

    public String getNumero() {
        return nCompra;
    }

    public void setNumero(String numero) {
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

    public float getValortotal() {
        return valortotal;
    }

    public void setValortotal(float valortotal) {
        this.valortotal = valortotal;
    }
    
}
