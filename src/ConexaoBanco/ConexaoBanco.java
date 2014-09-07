
package ConexaoBanco;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoBanco {
    
    public java.sql.Connection con;
    public java.sql.Statement st;
    
    public void conexaoBanco() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/estoque", "estoque", "estoque");
            st = con.createStatement();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
           
        public void fecharConexaoBanco() {
            
            try {
                con.close();
                st.close();
                
                con = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
        }  

}
    
