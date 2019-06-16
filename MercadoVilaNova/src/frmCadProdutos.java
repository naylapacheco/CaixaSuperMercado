import ConexaoBD.BD;
import Imageclass.WorkImage;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class frmCadProdutos extends javax.swing.JFrame {
 BufferedImage image;
 String[] nomearquivo;
 
    public frmCadProdutos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeProd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        estoqueProd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        marcaProd = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        precoProd = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        codBarraProd = new javax.swing.JTextField();
        btnCadastro = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnCapturarIMG = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        marcaProd1 = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Produto");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("jLabel7");
        jLabel7.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel1.add(jLabel7);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 160, 160));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de produtos:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("Descrição do produto:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        nomeProd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nomeProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(nomeProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 220, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setText("Quantidade:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 100, -1));

        estoqueProd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        estoqueProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estoqueProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estoqueProdActionPerformed(evt);
            }
        });
        getContentPane().add(estoqueProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 150, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("Marca do produto:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        marcaProd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        marcaProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(marcaProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 220, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel9.setText("Preço de venda:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        precoProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        precoProd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        getContentPane().add(precoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 150, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("Código de barras:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        codBarraProd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        codBarraProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(codBarraProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 220, 30));

        btnCadastro.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCadastro.setText("Cadastrar");
        btnCadastro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 130, 40));

        btnLimpar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 130, 40));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setText("Data Validade:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        btnCapturarIMG.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCapturarIMG.setText("Capturar");
        btnCapturarIMG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapturarIMGActionPerformed(evt);
            }
        });
        getContentPane().add(btnCapturarIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, -1, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 160, 20));

        marcaProd1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        marcaProd1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(marcaProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 150, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mercado-1.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 20, 880, 390));

        setSize(new java.awt.Dimension(836, 427));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        
        NumberFormat instance = DecimalFormat.getInstance(new Locale("pt", "BR"));
        instance.setMaximumFractionDigits(2);

        Double dValue;
        
        try{ 
            
         dValue = (Double) instance.parse(precoProd.getText());
        System.out.println(dValue);
        NumberFormat nf = new DecimalFormat( "#.00" );
            
            BD conexao = new BD();//instancia a classe db
            conexao.conecta();//chama metodo getconnection
            Connection conexao1;//Cria um objetivo conexão 1 do tipo da classe
            conexao1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/VILANOVA","root","1234");
            String query =("INSERT INTO produto (nomeProd, estoqueProd, marcaProd, precoProd, codBarraProd,caminhoImg) VALUES(?,?,?,?,?,?)");//Comando de inserir dados
            PreparedStatement stm = conexao1.prepareStatement(query);//liga o form ao DB
            stm.setString(1,nomeProd.getText());
            stm.setString(2,estoqueProd.getText());
            stm.setString(3,marcaProd.getText());
            stm.setString(4,dValue.toString());
            stm.setString(5,codBarraProd.getText());
            stm.setString(6,jLabel8.getText());
            
            

            nomeProd.setText("");
            codBarraProd.setText("");
            estoqueProd.setText("");
            marcaProd.setText("");
            precoProd.setText("");
        
            stm.executeUpdate();
            stm.close();
            conexao1.close();
            JOptionPane.showMessageDialog(null,"O produto foi cadastrado com sucesso! ");
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro! :( !"+ ex.toString());
        } 
        catch (ParseException ex) { 
         Logger.getLogger(frmCadProdutos.class.getName()).log(Level.SEVERE, null, ex);
     }
        
      
        //aqui é o que vai salvar a imagem tiramos os pontinhos .. //
        try{
        String caminho= getClass().getResource("/img/").toString().substring(5);
        System.out.println(caminho);
        File outputfile = new File(caminho+nomearquivo[0]);
        ImageIO.write(image, "jpg", outputfile);
        JOptionPane.showMessageDialog(rootPane, "Imagem enviada comsucesso");
        jLabel8.setText(caminho);
        image = null;
        
        }catch (IOException ex) {
        Logger.getLogger(WorkImage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        nomeProd.setText("");
        codBarraProd.setText("");
        estoqueProd.setText("");
        marcaProd.setText("");
        precoProd.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void estoqueProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estoqueProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estoqueProdActionPerformed

    private void btnCapturarIMGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturarIMGActionPerformed
        // Capturar imagem
        JFileChooser fc = new JFileChooser();
        int res = fc.showOpenDialog(null);
        
            if(res == JFileChooser.APPROVE_OPTION){
                File arquivo= fc.getSelectedFile();
                try{
                System.out.println("Arquivo selecionado" + arquivo.getCanonicalPath());
                nomearquivo = arquivo.getName().split("\\\\");
                    for (int i=0;i<nomearquivo.length;i++){
                    System.out.println("Valor: " + nomearquivo[0]);
                   }
                }catch (IOException ex) {
                    Logger.getLogger(WorkImage.class.getName()).log(Level.SEVERE, null, ex);
                }try{
                   image= WorkImage.setImagemDimensao(arquivo.getAbsolutePath(), 160,160);
                   jLabel7.setIcon(new ImageIcon(image));
                   btnCapturarIMG.setEnabled(true);
                   btnCadastro.setEnabled(true);
                }catch(Exception ex){ }
            }else{
            JOptionPane.showMessageDialog(null,"Voce não selecionou nenhumarquivo.");
            }
    }//GEN-LAST:event_btnCapturarIMGActionPerformed

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
                if ("Windows classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCadProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnCapturarIMG;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JTextField codBarraProd;
    private javax.swing.JTextField estoqueProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField marcaProd;
    private javax.swing.JTextField marcaProd1;
    private javax.swing.JTextField nomeProd;
    private javax.swing.JFormattedTextField precoProd;
    // End of variables declaration//GEN-END:variables

    private Color Color(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
