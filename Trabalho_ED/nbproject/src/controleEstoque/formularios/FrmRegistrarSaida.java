/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleEstoque.formularios;

/**
 *
 * @author Christopher
 */
public class FrmRegistrarSaida extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmRegistrarSaida
     */
    public FrmRegistrarSaida() {
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
        btnDesmarcarTodos = new javax.swing.JButton();
        btnMarcarTodos = new javax.swing.JButton();
        btnListaProdutos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabProdutos = new javax.swing.JTable();

        setMaximumSize(null);
        setMinimumSize(new java.awt.Dimension(591, 396));
        setPreferredSize(null);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Registrar saída");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 10, 130, 25);

        btnDesmarcarTodos.setText("Desmarcar todos produtos");
        getContentPane().add(btnDesmarcarTodos);
        btnDesmarcarTodos.setBounds(30, 250, 170, 23);

        btnMarcarTodos.setText("Marcar todos produtos");
        getContentPane().add(btnMarcarTodos);
        btnMarcarTodos.setBounds(30, 210, 170, 23);

        btnListaProdutos.setText("Ir para lista de produtos selecionados");
        getContentPane().add(btnListaProdutos);
        btnListaProdutos.setBounds(310, 240, 240, 23);

        tabProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "", "Produto", "Qtd. atual"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabProdutos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabProdutos);
        tabProdutos.getColumnModel().getColumn(0).setResizable(false);
        tabProdutos.getColumnModel().getColumn(0).setPreferredWidth(20);
        tabProdutos.getColumnModel().getColumn(1).setPreferredWidth(550);
        tabProdutos.getColumnModel().getColumn(2).setResizable(false);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 50, 530, 150);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDesmarcarTodos;
    private javax.swing.JButton btnListaProdutos;
    private javax.swing.JButton btnMarcarTodos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabProdutos;
    // End of variables declaration//GEN-END:variables
}