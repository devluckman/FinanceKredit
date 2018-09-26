package UmumMethod;

import java.sql.*;
import Registrasi.From.*;
import RuangStaff.From.*;
import javax.swing.*;
import java.awt.HeadlessException;


public class InsertDatabase {
     private Connection conn;
     private Statement st;
     
     public void savebiodata(String nopesan,String namalengkap,String jnskelamin,String jnsidentitas,
                                String noidentitas,String alamat,String nohp,String email,String pekerjaan) {
        
         try
            {   StepIsiBiodata p = new StepIsiBiodata();
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kredit", "root", "");
                st = conn.createStatement();
                String costumer = "insert into biodata values ('"+nopesan+"','"
                +namalengkap+"','"
                +jnskelamin+"','"
                +jnsidentitas+"','"
                +noidentitas+"','"
                +alamat+"','"
                +nohp+"','"
                +email+"','"
                +pekerjaan+"')";
                int xcostumer = st.executeUpdate(costumer);
                JOptionPane.showMessageDialog(p, "Data berhasil disimpan, ID anda " + nopesan, "Informasi", JOptionPane.INFORMATION_MESSAGE);
                new DokumenPersyaratan().setVisible(true);
        }catch (SQLException | HeadlessException e)
            {   JOptionPane.showMessageDialog(null, "Save data Registrasi error" + e); }
     }
     
    public void savekredit(String nopesanan, String typerumah, String ukuran, String harga,
                String dp, String tgl, String waktu, String angsuran){
        
        try {
                StepSimulasi q = new StepSimulasi();
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kredit", "root", "");
                st = conn.createStatement();
                String simulasi = "insert into pesanan values ('"+nopesanan+"','"
                +typerumah+"','"
                +ukuran+"','"
                +harga+"','"
                +dp+"','"
                +tgl+"','"
                +waktu+"','"
                +angsuran+"')";
                st.executeUpdate(simulasi);
                JOptionPane.showMessageDialog(q, "Data berhasil disimpan, ID anda " + nopesanan, "Informasi", JOptionPane.INFORMATION_MESSAGE);
                new StepIsiBiodata().setVisible(true);

            }catch(SQLException | HeadlessException e)
            {   JOptionPane.showMessageDialog(null, "Save data Registrasi error"); }
    }
    
    public void datastaff(String nama, String ttl, String alamat, String password, String no_tlp){
        try {
                KelolaData s = new KelolaData();
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kredit", "root", "");
                st = conn.createStatement();
                String adm = "insert into adm values ('"+nama+"','"
                +ttl+"','"
                +alamat+"','"
                +password+"','"
                +no_tlp+"')";
                st.executeUpdate(adm);
                JOptionPane.showMessageDialog(s,"Data berhasil disimpan","Informasi", JOptionPane.INFORMATION_MESSAGE);
            }catch(SQLException | HeadlessException e)
            {   JOptionPane.showMessageDialog(null, "Save data Registrasi error "+ e); }
    }
    
     
}
