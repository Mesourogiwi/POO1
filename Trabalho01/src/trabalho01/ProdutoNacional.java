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
public class ProdutoNacional extends Produto{
    
    private String tipoProduto;
    private float taxaImposto;
    
    /**
     *
     * @param codigo
     * @param descricao
     * @param valor
     * @param tipoProduto
     * @param taxaImposto
     */
    
    public ProdutoNacional(String codigo, String descricao, float valor, String tipoProduto, float taxaImposto){
        super(codigo, descricao, valor);
        this.tipoProduto = tipoProduto;
        this.taxaImposto = taxaImposto;
    }
    
    @Override
    public float calcularPreco(){
        float preco = valor + ((valor * taxaImposto) / 100);
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
    
}
