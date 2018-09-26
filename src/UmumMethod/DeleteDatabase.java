package UmumMethod;
import java.awt.*;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Lukmanul Hakim
 */
public class DeleteDatabase {
    public Statement st;
    public Connection conn;
    public void deletedatastaff(String Id){
     try{
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kredit", "root", "");
        st = conn.createStatement();
        String stf = "delete from adm where nama = '"+Id+"';";
        st.executeUpdate(stf);
        JOptionPane.showMessageDialog(null, "Staff Berhasil Dihapus");
        }
     catch(SQLException | HeadlessException e)
        {   JOptionPane.showMessageDialog(null, "Delete Staff Error "+ e); }
    }
    
    public void deletedatakonsumen(String Id){
     try{
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kredit", "root", "");
        st = conn.createStatement();
        String ks = "delete from biodata where no_identitasi = '"+Id+"';";
        st.executeUpdate(ks);
        JOptionPane.showMessageDialog(null, "Konsumen Berhasil Dihapus");
        }
     catch(SQLException | HeadlessException e)
        {   JOptionPane.showMessageDialog(null, "Delete Konsumen Error "+ e); }
    }
}
