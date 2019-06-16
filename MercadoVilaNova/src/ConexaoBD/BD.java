/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoBD;
 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.ResultSet;
 import java.sql.SQLException;
 import java.sql.Statement;
 import javax.swing.JOptionPane;

 /*@author V8360317*/
public class BD {
    //declarações de parametros de acesso ao banco
    private final String driver = "com.mysql.jdbc.Driver";
    private final String database = "VILANOVA";
    private final String url = "jdbc:mysql://127.0.0.1:3306/VILANOVA";
    private final String username = "root";
    private final String password = "1234";
    public Statement stm; //stm conecta conecta com o banco
    public ResultSet rs; // executa o mysql
    public Connection conex = null;
    
    public void conecta(){
        try{
            System.setProperty("jdbc.Drivers", driver);
            conex = DriverManager.getConnection(url,username,password);
            //JOptionPane.showMessageDialog(null,"Conexão efetuada com sucesso! ");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"O banco não foi localizado :( !"+ ex.toString());
        }
}
    public void executaSQL(String sql){
        try{
             stm = conex.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY );
             rs = stm.executeQuery(sql);
         
    }catch(SQLException ex){
         JOptionPane.showMessageDialog(null,"Erro ao Executar o sql :( !\n"+ ex.getMessage());
       
    }
    } 
 public void desconecta(){
     try{
         conex.close();
          JOptionPane.showMessageDialog(null,"O banco foi desconectado ");
     }catch(SQLException ex){
         JOptionPane.showMessageDialog(null,"erro ao desconectar o banco  :( !"+ ex.toString());
     }
 }
    
}
