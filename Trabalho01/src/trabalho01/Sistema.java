/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho01;

import javax.swing.JOptionPane;

/**
 *
 * @author Erick Yoshike
 */
public class Sistema {
    private int MAXC = 100; 
    private int MAXP = 100;

    public String principal() {
        String principal = "MENU PRINCIPAL\n"
                + "1 - Cadastrar \n"
                + "2 - Registrar Compra \n"
                + "3 - Relatórios \n"
                + "4 - Salvar Dados \n"
                + "5 - Carregar Dados \n"
                + "6 - Sair \n"
                + "Digite a opção desejada: ";
        String opt = JOptionPane.showInputDialog(principal);
        if (opt == null) {
            return "6";
        } else {
            return opt;
        }
    }

    public String cadastrar() {
        String cadastrar = "MENU CADASTRAR \n"
                + "1 - Cliente \n"
                + "2 - Produto \n"
                + "3 - Voltar \n"
                + "Digite a opção desejada: ";
        String opt1 = JOptionPane.showInputDialog(cadastrar);
        if (opt1 == null) {
            return "3";
        } else {
            return opt1;
        }
    }

    public void executar() {
        String opcao, opcao1, nomeC, cpfC, codigoP, descricaoP, tipoP;
        int contC = 0, contP = 0, taxaImposto = 0, taxaImport = 0;
        float valorP = 0;
        Cliente c[] = new Cliente[MAXC];
        Produto p[] = new Produto[MAXP];

        do {
            opcao = principal();
            switch (opcao) {
                case "1":
                    do {
                        opcao1 = cadastrar();
                        switch (opcao1) {
                            case "1":
                                if (contC < MAXC){
                                    nomeC = JOptionPane.showInputDialog("Introduza seu nome: ");
                                    cpfC = JOptionPane.showInputDialog("Introduza seu cpf: ");
                                    c[contC] = new Cliente(cpfC, nomeC);
                                    contC++;
                                }
                                break;
                            case "2":
                                if (contP < MAXP){
                                    descricaoP = JOptionPane.showInputDialog("Introduza uma descricao do produto: ");
                                    codigoP = JOptionPane.showInputDialog("Introduza o codigo do produto: ");
                                    valorP = Float.parseFloat(JOptionPane.showInputDialog("Introduza o valor do produto: "));
                                    tipoP = JOptionPane.showInputDialog("Introduza o tipo do produto (NACIONAL ou IMPORTADO): ");
                                    if (tipoP.equals("NACIONAL")){
                                        taxaImposto = Integer.parseInt(JOptionPane.showInputDialog("Introduza a taxa de imposto (em %): "));
                                        p[contP] = new ProdutoNacional(codigoP, descricaoP, valorP, tipoP, taxaImposto);
                                        contP++;
                                    }
                                    else{
                                        taxaImposto = Integer.parseInt(JOptionPane.showInputDialog("Introduza a taxa de imposto (em %): "));
                                        taxaImport = Integer.parseInt(JOptionPane.showInputDialog("Introduza a taxa de importacao (em %): "));
                                        p[contP] = new ProdutoImportado (codigoP, descricaoP, valorP, tipoP, taxaImposto, taxaImport);
                                        contP++;
                                    }
                                }
                                break;
                        }
                    } while (!opcao1.equals("3"));
                    break;

                case "2":

                    break;

                case "3":

                    break;

                case "4":

                    break;

                case "5":

                    break;

            }
        } while (!opcao.equals("6"));
    }
}
