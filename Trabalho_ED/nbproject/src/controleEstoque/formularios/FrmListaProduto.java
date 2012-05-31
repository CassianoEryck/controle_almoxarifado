/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleEstoque.formularios;

import controleEstoque.controladores.ControlMain;

/**
 *
 * @author Christopher
 */
public class FrmListaProduto extends javax.swing.JInternalFrame {


    ControlMain controlMain = new ControlMain();
    
    public FrmListaProduto() {
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

        txtPesquisaProduto1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEntradaProdutos1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnExcluirProdutos = new javax.swing.JButton();
        btnAdicionarProduto = new javax.swing.JButton();
        btnIndicarProduto = new javax.swing.JButton();
        btnProdutosPendentes = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(730, 380));
        getContentPane().setLayout(null);

        txtPesquisaProduto1.setText("Pesquisar produto...");
        getContentPane().add(txtPesquisaProduto1);
        txtPesquisaProduto1.setBounds(30, 70, 220, 20);

        tblEntradaProdutos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "", "ID", "Produto "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEntradaProdutos1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblEntradaProdutos1);
        tblEntradaProdutos1.getColumnModel().getColumn(0).setResizable(false);
        tblEntradaProdutos1.getColumnModel().getColumn(0).setPreferredWidth(15);
        tblEntradaProdutos1.getColumnModel().getColumn(1).setResizable(false);
        tblEntradaProdutos1.getColumnModel().getColumn(1).setPreferredWidth(15);
        tblEntradaProdutos1.getColumnModel().getColumn(2).setPreferredWidth(500);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 110, 670, 150);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Produtos cadastrados");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 10, 190, 25);

        btnExcluirProdutos.setText("Excluir produtos selecionados");
        getContentPane().add(btnExcluirProdutos);
        btnExcluirProdutos.setBounds(20, 280, 230, 23);

        btnAdicionarProduto.setText("Adicionar novo produto");
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIndicarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndicarProdutoActionPerformed
        controlMain.criaIndicarProduto();
    }//GEN-LAST:event_btnIndicarProdutoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarProduto;
    private javax.swing.JButton btnExcluirProdutos;
    private javax.swing.JButton btnIndicarProduto;
    private javax.swing.JButton btnProdutosPendentes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblEntradaProdutos1;
    private javax.swing.JTextField txtPesquisaProduto1;
    // End of variables declaration//GEN-END:variables
}