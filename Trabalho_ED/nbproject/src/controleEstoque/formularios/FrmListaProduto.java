/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleEstoque.formularios;

import controleEstoque.controladores.ControlMain;
import controleEstoque.estruturaDados.ListaProdutos;
import javax.swing.JList;
/**
 *
 * @author Christopher
 */
public class FrmListaProduto extends javax.swing.JInternalFrame {

    ControlMain controlMain = new ControlMain();
    ListaProdutos listaProdutos;
    
    public FrmListaProduto() {
        initComponents();
    }

    public JList getLstProdutos() {
        return lstProdutos;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPesquisaProduto1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnExcluirProdutos = new javax.swing.JButton();
        btnAdicionarProduto = new javax.swing.JButton();
        btnIndicarProduto = new javax.swing.JButton();
        btnProdutosPendentes = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstProdutos = new javax.swing.JList();

        setPreferredSize(new java.awt.Dimension(730, 380));
        getContentPane().setLayout(null);

        txtPesquisaProduto1.setText("Pesquisar produto...");
        getContentPane().add(txtPesquisaProduto1);
        txtPesquisaProduto1.setBounds(30, 70, 220, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Produtos cadastrados");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 20, 190, 25);

        btnExcluirProdutos.setText("Excluir produtos selecionados");
        getContentPane().add(btnExcluirProdutos);
        btnExcluirProdutos.setBounds(20, 280, 230, 23);

        btnAdicionarProduto.setText("Adicionar novo produto");
        btnAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionarProduto);
        btnAdicionarProduto.setBounds(460, 280, 230, 23);

        btnIndicarProduto.setText("Indicar compra de produto");
        btnIndicarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndicarProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnIndicarProduto);
        btnIndicarProduto.setBounds(460, 310, 230, 23);

        btnProdutosPendentes.setText("Produtos pendentes");
        getContentPane().add(btnProdutosPendentes);
        btnProdutosPendentes.setBounds(540, 70, 150, 23);

        listaProdutos = new ListaProdutos();
        lstProdutos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = listaProdutos.percorreListaArray();
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstProdutos);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(70, 110, 560, 120);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIndicarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndicarProdutoActionPerformed
        controlMain.criaIndicarProduto();
    }//GEN-LAST:event_btnIndicarProdutoActionPerformed

    private void btnAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoActionPerformed
       
    }//GEN-LAST:event_btnAdicionarProdutoActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarProduto;
    private javax.swing.JButton btnExcluirProdutos;
    private javax.swing.JButton btnIndicarProduto;
    private javax.swing.JButton btnProdutosPendentes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lstProdutos;
    private javax.swing.JTextField txtPesquisaProduto1;
    // End of variables declaration//GEN-END:variables
}
