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
        String opcao, opcao1;

        do {
            opcao = principal();
            switch (opcao) {
                case "1":
                    do {
                        opcao1 = cadastrar();
                        switch (opcao1) {
                            case "1":

                                break;
                            case "2":

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
