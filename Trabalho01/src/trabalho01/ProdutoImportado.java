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
    private float taxaImposto;
    private float taxaImportacao;
    
    public ProdutoImportado(String codigo, String descricao, float valor, float taxaImposto, float taxaImportacao){
        super(codigo, descricao, valor);
        this.taxaImposto = taxaImposto;
        this.taxaImportacao = taxaImportacao;
    }
    
    @Override
    public float calcularPreco(){
        float preco = valor + ((valor * taxaImposto) / 100) + ((valor + taxaImportacao) / 100);
        return preco;
    }

    public float getTaxaImposto() {
        return taxaImposto;
    }

    public void setTaxaImposto(float taxaImposto) {
        this.taxaImposto = taxaImposto;
    }

    public float getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(float taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }
    
}
