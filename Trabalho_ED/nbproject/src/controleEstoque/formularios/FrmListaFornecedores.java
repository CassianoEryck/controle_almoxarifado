/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleEstoque.formularios;

/**
 *
 * @author Christopher
 */
public class FrmListaFornecedores extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmListaFornecedores
     */
    public FrmListaFornecedores() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnExcluirFornecedores = new javax.swing.JButton();
        btnAdicionarFornecedor = new javax.swing.JButton();
        txtPesquisar = new javax.swing.JTextField();

        setMaximumSize(null);
        setMinimumSize(new java.awt.Dimension(730, 380));
        setPreferredSize(new java.awt.Dimension(730, 380));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Fornecedores");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 20, 120, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "", "Fornecedor", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class
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
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(25);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(300);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(32, 110, 660, 120);

        btnExcluirFornecedores.setText("Excluir fornecedores marcados");
        getContentPane().add(btnExcluirFornecedores);
        btnExcluirFornecedores.setBounds(50, 270, 240, 23);

        btnAdicionarFornecedor.setText("Adicionar novo fornecedor");
        getContentPane().add(btnAdicionarFornecedor);
        btnAdicionarFornecedor.setBounds(480, 270, 200, 23);

        txtPesquisar.setText("Pesquisar fornecedor...");
        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(txtPesquisar);
        txtPesquisar.setBounds(80, 70, 150, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarFornecedor;
    private javax.swing.JButton btnExcluirFornecedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
