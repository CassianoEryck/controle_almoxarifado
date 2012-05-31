/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleEstoque;

import controleEstoque.controladores.*;
import javax.swing.*;



/**
 *
 * 
 * @author Christopher
 */
public class FrmMenuPrincipal extends javax.swing.JFrame {

    ControlMain controlMain = new ControlMain();
    /**
     * Creates new form FrmMenuPrincipal
     */
    public FrmMenuPrincipal() {
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

        jSeparator1 = new javax.swing.JSeparator();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnLogout = new javax.swing.JButton();
        btnFornecedores = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        btnEntrada = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        btnSaida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Estoque");
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(null);
        setMinimumSize(new java.awt.Dimension(800, 380));
        setName("Controle de Estoque");
        setResizable(false);
        getContentPane().setLayout(null);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(200, 0, 2, 380);

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(200, 0, 730, 380);

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout);
        btnLogout.setBounds(40, 310, 110, 28);

        btnFornecedores.setText("Lista de fornecedores");
        getContentPane().add(btnFornecedores);
        btnFornecedores.setBounds(10, 70, 180, 28);

        btnRelatorio.setText("Gerar relatório");
        getContentPane().add(btnRelatorio);
        btnRelatorio.setBounds(10, 240, 180, 28);

        btnEntrada.setText("Registrar entrada");
        getContentPane().add(btnEntrada);
        btnEntrada.setBounds(10, 140, 180, 28);

        btnProdutos.setText("Lista de produtos");
        getContentPane().add(btnProdutos);
        btnProdutos.setBounds(10, 30, 180, 28);

        btnSaida.setText("Registrar saída");
        btnSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSaida);
        btnSaida.setBounds(10, 180, 180, 28);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaidaActionPerformed
        controlMain.chamaRegistrarSaida(this);
    }//GEN-LAST:event_btnSaidaActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed

        
        if(JOptionPane.showConfirmDialog(this, "Deseja realmente efetuar logout?", 
                "Aviso!", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
           
            this.dispose();
            controlMain.criaFormularioLogin();
        }
        
    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FrmMenuPrincipal().setVisible(true);
            }
        });
    }
    
   public JDesktopPane getJDesktopPane() {
       return jDesktopPane1;
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrada;
    private javax.swing.JButton btnFornecedores;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnSaida;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
