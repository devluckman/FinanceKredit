package UmumMethod;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import RuangStaff.From.*;
/**
 *
 * @author Lukmanul Hakim
 */
public class UpdateDatabase {
    public Statement st;
    public Connection conn;
    
    public void updatedatastaff(int baris, String nama, String ttl, String alamat,
            String password, String tlp){
     try{
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kredit", "root", "");
        st = conn.createStatement();
        if (baris != -1)
        {
         int xttl = st.executeUpdate("update adm set ttl = '" + ttl + "' where nama = '" + nama + "'");
         int xalamat = st.executeUpdate("update adm set alamat_adm = '" + alamat + "' where nama = '" + nama + "'");
         int xpassword = st.executeUpdate("update adm set password = '" + password + "' where nama = '" + nama + "'");
         int xtlp = st.executeUpdate("update adm set no_telepon = '" + tlp + "' where nama = '" + nama + "'");
         JOptionPane.showMessageDialog(null,"Data Berhasil Di Update");
        }
    }catch(SQLException | HeadlessException e)
        {   JOptionPane.showMessageDialog(null, "Update Data Error "+ e); }
    
    }
    
    public void updatedatakonsumen(int baris, String nopsn, String nama, String jnskelamin,
            String jnskrt, String no_id, String alamat, String hp, String email,
            String pkrjaan){
    try{
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kredit", "root", "");
        st = conn.createStatement();
        if (baris != -1)
        {
            int xnama = st.executeUpdate("update biodata set nama_lengkap = '" + nama + "' where no_identitasi = '" + no_id + "'");
            int xjnskelamin = st.executeUpdate("update biodata set jenis_kelamin = '" + jnskelamin + "' where no_identitasi = '" + no_id + "'");
            int xjnskrt = st.executeUpdate("update biodata set jenis_kartu_identitas = '" + jnskrt + "' where no_identitasi = '" + no_id + "'");
            int xnalamat = st.executeUpdate("update biodata set alamat = '" + alamat + "' where no_identitasi = '" + no_id + "'");
            int xhp = st.executeUpdate("update biodata set handphone = '" + hp + "' where no_identitasi = '" + no_id + "'");
            int xemail = st.executeUpdate("update biodata set email = '" + email + "' where no_identitasi = '" + no_id + "'");
            int xpkrjaan = st.executeUpdate("update biodata set pekerjaan = '" + pkrjaan + "' where no_identitasi = '" + no_id + "'");
            JOptionPane.showMessageDialog(null,"Data Berhasil Di Update");
        }
    }catch(SQLException | HeadlessException e)
        {   JOptionPane.showMessageDialog(null, "Update Data Error "+ e); }
    
    
    }
}
