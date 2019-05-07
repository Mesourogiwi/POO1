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
public abstract class Produto {

    protected String codigo;
    protected String descricao;
    protected float valor;

    public Produto(String codigo, String descricao, float valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public abstract float calcularPreco();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

}
