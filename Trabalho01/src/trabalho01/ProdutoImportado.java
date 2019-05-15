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
public class ProdutoImportado extends Produto{
    
    private String tipoProduto;
    private float taxaImposto;
    private float taxaImportacao;
    
    public ProdutoImportado(String codigo, String descricao, float valor, String tipoProduto, float taxaImposto, float taxaImportacao){
        super(codigo, descricao, valor);
        this.tipoProduto = tipoProduto;
        this.taxaImposto = taxaImposto;
        this.taxaImportacao = taxaImportacao;
    }
    
    @Override
    public float calcularPreco(){
        float preco = valor + ((valor * taxaImposto) / 100) + ((valor + taxaImportacao) / 100);
        return preco;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
    
    public float getTaxaImposto() {
        return taxaImposto;
    }

    public void setTaxaImposto(int taxaImposto) {
        this.taxaImposto = taxaImposto;
    }

    public float getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(int taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }
    
}
