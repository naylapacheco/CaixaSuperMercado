public class frmCompra extends javax.swing.JFrame {

    /**
     * Creates new form mercadoVilaNova
     */
    public frmCompra() {
        initComponents();
        //setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        descricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        vlrUnitario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cadBarra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        quantidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        totalCompra = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        list1 = new java.awt.List();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setText("Descrição:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        descricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        descricao.setEnabled(false);
        getContentPane().add(descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 230, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("Preço:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        vlrUnitario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        vlrUnitario.setEnabled(false);
        getContentPane().add(vlrUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 130, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel1.setText("Código:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        cadBarra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cadBarra.setEnabled(false);
        getContentPane().add(cadBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 410, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("Quantidade:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, -1));

        quantidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quantidade.setEnabled(false);
        getContentPane().add(quantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 130, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setText("Total:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        totalCompra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        totalCompra.setEnabled(false);
        getContentPane().add(totalCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 130, 30));

        btnConfirmar.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btnConfirmar.setText("Confirmar Compra");
        getContentPane().add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, -1, -1));

        btnCancelar.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btnCancelar.setText("Cancelar Compra");
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel6.setText("Lista de produtos");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));
        getContentPane().add(list1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 560, 350));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mercado-1.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
                if ("windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JTextField cadBarra;
    private javax.swing.JTextField descricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private java.awt.List list1;
    private javax.swing.JTextField quantidade;
    private javax.swing.JTextField totalCompra;
    private javax.swing.JTextField vlrUnitario;
    // End of variables declaration//GEN-END:variables
}
