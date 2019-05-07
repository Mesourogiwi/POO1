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
    private float taxaImposto;
    
    public ProdutoNacional(String codigo, String descricao, float valor, float taxaImposto){
        super(codigo, descricao, valor);
        this.taxaImposto = taxaImposto;
    }
    
    @Override
    public float calcularPreco(){
        float preco = valor + ((valor * taxaImposto) / 100);
        return preco;
    }

    public float getTaxaImposto() {
        return taxaImposto;
    }

    public void setTaxaImposto(float taxaImposto) {
        this.taxaImposto = taxaImposto;
    }
    
}
