/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho01;

/**
 *
 * @author Guga
 */
public class MenuCadastrar extends javax.swing.JFrame {

    /**
     * Creates new form MenuCadastrar
     */
    public MenuCadastrar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btcliente = new javax.swing.JButton();
        BtProduto = new javax.swing.JButton();
        BtVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Btcliente.setText("Cliente");
        Btcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtclienteActionPerformed(evt);
            }
        });

        BtProduto.setText("Produto");
        BtProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtProdutoActionPerformed(evt);
            }
        });

        BtVoltar.setText("Voltar");
        BtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVoltarActionPerformed(evt);
            }
        });

        jLabel1.setText(" Menu Cadastrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(Btcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(BtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(BtVoltar)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btcliente)
                    .addComponent(BtProduto))
                .addGap(52, 52, 52)
                .addComponent(BtVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int contc;
int contp;
    
    private void BtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVoltarActionPerformed
         MenuInicial form2 = new MenuInicial();
            form2.setVisible(true);
            
            dispose();
    }//GEN-LAST:event_BtVoltarActionPerformed

    private void BtclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtclienteActionPerformed
        CadastroCliente form2 = new CadastroCliente();
            form2.setVisible(true);
            
            dispose();
    }//GEN-LAST:event_BtclienteActionPerformed

    private void BtProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtProdutoActionPerformed
        CadastroProduto form2 = new CadastroProduto();
            form2.setVisible(true);
           
            dispose();
    }//GEN-LAST:event_BtProdutoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtProduto;
    private javax.swing.JButton BtVoltar;
    private javax.swing.JButton Btcliente;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    void exportarContc1(int contC) {
        this.contc = contC;//To change body of generated methods, choose Tools | Templates.
    }

    void exportarCont1(int contP) {
        this.contp = contP; //To change body of generated methods, choose Tools | Templates.
    }
}
